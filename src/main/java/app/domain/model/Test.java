package app.domain.model;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {

    String citizenCardNumber;
    String testID;
    String nhsCode;
    TestType tt;
    State state;

    private List<TestParameter> tpList;

    final int NHSCODE_SIZE = 12;
    static int testCode = 1;


    public Test(String citizenCardNumber, String testCode, String nhsCode, TestType testType) {
        checkNhsCode(nhsCode);

        this.citizenCardNumber = citizenCardNumber;
        this.testID = testCode;
        this.nhsCode = nhsCode;
        this.tt = tt;
        state = State.REGISTERED;
        tpList = new ArrayList<>();
    }

    public enum State {
        REGISTERED, SAMPLECOLLECTED, ANALYZED, DIAGNOSED, VALIDATED
    }

    public String getTestID() {
        return testID;
    }

    public String getNhsCode() {
        return nhsCode;
    }

    public State getState() {
        return state;
    }

    public List<Parameter> getParamList() {
        List<Parameter> paramList = new ArrayList<>();

        for(TestParameter tp : tpList) {
            paramList.add(tp.getParam());
        }
        return paramList;
    }

    public List<TestParameter> getTpList() {
        return tpList;
    }

    public void setState(State state) {
        this.state = state;
    }

    private void checkNhsCode(String nhsCode) {
        if (StringUtils.isBlank(nhsCode))
            throw new IllegalArgumentException("The NHS code cannot be blank.");
        if (!nhsCode.matches("[a-zA-Z0-9]+$")) {
            throw new IllegalArgumentException("NHS code only accepts letters and numbers.");
        }
        if (nhsCode.length() != NHSCODE_SIZE) {
            throw new IllegalArgumentException("The NHS code must be 12 characters long.");
        }
    }

    public void CreateTestParameter(String testID, List<Parameter> parameters) {
        TestParameter tp;
        for(Parameter param : parameters) {
            tp = new TestParameter(testID, param);
            tpList.add(tp);
        }
    }

    public boolean addTestParameterResult(String parameterCode, double result) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        TestParameter tp1 = null;

        for(TestParameter tp : tpList) {
            if(tp.getParam().getCode().equals(parameterCode)) {
                tp1 = tp;
            }
        }

        if(tp1 == null) {
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



    //US15
    public boolean isValid() {
        return false;
    }

    public boolean validate(LocalDate date) {
        // this.validationDate=date;
        return true;
    }
}

