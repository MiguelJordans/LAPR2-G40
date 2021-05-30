package app.domain.model;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {

    private String tinNumber;
    private String testID;
    private String nhsCode;
    private TestType tt;
    private State state;
    private LocalDate date;

    private List<TestParameter> tpList;

    private static int nhsSize = 12;


    public Test(String citizenCardNumber, String testID, String nhsCode, TestType tt) {
        checkNhsCode(nhsCode);

        this.tinNumber = citizenCardNumber;
        this.testID = testID;
        this.nhsCode = nhsCode;
        this.tt = tt;
        state = State.CREATED;
        tpList = new ArrayList<>();
        this.date=LocalDate.now();
    }

    public String getTestID() {
        return testID;
    }

    public String getNhsCode() {
        return nhsCode;
    }

    public List<Parameter> getParamList() {
        List<Parameter> paramList = new ArrayList<>();

        for (TestParameter tp : tpList) {
            paramList.add(tp.getParam());
        }
        return paramList;
    }

    private void checkNhsCode(String nhsCode) {
        if (StringUtils.isBlank(nhsCode))
            throw new IllegalArgumentException("The NHS code cannot be empty.");
        if (!nhsCode.matches("[a-zA-Z0-9]+$")) {
            throw new IllegalArgumentException("NHS code only accepts letters and numbers.");
        }
        if (nhsCode.length() != nhsSize) {
            throw new IllegalArgumentException("The NHS code must be 12 characters long.");
        }
    }

    public void createTestParameter(String testID, List<Parameter> parameters) {
        TestParameter tp;
        for (Parameter param : parameters) {
            tp = new TestParameter(testID, param);
            this.tpList.add(tp);
        }
    }

    public List<TestParameter> getTpList() {
        return tpList;
    }

    public boolean addTestParameterResult(String parameterCode, double result) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        TestParameter tp1 = null;

        for (TestParameter tp : tpList) {
            if (tp.getParam().getCode().equals(parameterCode)) {
                tp1 = tp;
            }
        }

        if (tp1 == null) {
            return false;
        }

        String em = tt.getExternalModule();
        Class<?> daclass = Class.forName(em);
        RefValueAdapter adp = (RefValueAdapter) daclass.newInstance();

        String paramCode = tp1.getParam().getCode();

        TestParameterResult tpr = new TestParameterResult(parameterCode, result);
        tpr.setRefValue(adp.getRefValue(paramCode));

        tp1.setTpr(tpr);
        return true;
    }

    public String getTinNumber() {
        return tinNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public TestType getTt() {
        return tt;
    }

    //US15
    public boolean isValid() {
        return false;
    }

    public boolean validate(LocalDate date) {
        // this.validationDate=date;
        return true;
    }

    //

    enum State {
        CREATED,
        SAMPLE_COLLECTED,
        SAMPLE_ANALYSED,
        DIAGNOSTIC_MADE,
        VALIDATED;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setState(String s) {
        switch (s) {
            case "CREATED":
                setState(State.CREATED);
                date=LocalDate.now();
                break;
            case "SAMPLE_COLLECTED":
                setState(State.SAMPLE_COLLECTED);
                date=LocalDate.now();
                break;
            case "SAMPLE_ANALYSED":
                setState(State.SAMPLE_ANALYSED);
                date=LocalDate.now();
                break;
            case "DIAGNOSTIC_MADE":
                setState(State.DIAGNOSTIC_MADE);
                date=LocalDate.now();
                break;
            case "VALIDATED":
                setState(State.VALIDATED);
                date=LocalDate.now();
                break;
            default:
                break;
        }
    }

    public boolean compareState(String state) {

        if (state.equals("SAMPLE_ANALYSED") || state.equals("SAMPLE_COLLECTED") || state.equals("DIAGNOSTIC_MADE") || state.equals("VALIDATED")) {
            return false;
        }
        return true;
    }

    public boolean compareTestState(String state) {

        if (state.equals("SAMPLE_ANALYSED") || state.equals("DIAGNOSTIC_MADE") || state.equals("VALIDATED")) {
            return false;
        }
        return true;
    }

    public String getState() {
        return state.name();
    }

    @Override
    public String toString() {
        return "Test{" +
                "TinNumber='" + tinNumber + '\'' +
                ", testID='" + testID + '\'' +
                ", nhsCode='" + nhsCode + '\'' +
                ", tt=" + tt +
                ", state=" + state +
                ", date=" + date +
                '}';
    }

}

