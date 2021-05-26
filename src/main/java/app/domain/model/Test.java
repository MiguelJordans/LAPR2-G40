package app.domain.model;

import org.apache.commons.lang3.StringUtils;

public class Test {

    private String citizenCardNumber;
    private String testCode;
    private String nhsCode;
    private TestType testType;
    private State state;

    private static int codeTest = 1;


    public Test (String citizenCardNumber,String testCode, String nhsCode, TestType testType) {
        checkNshCode(nhsCode);

        this.citizenCardNumber = citizenCardNumber;
        this.testCode = testCode;
        this.nhsCode = nhsCode;
        this.testType = testType;
        state = State.REGISTERED;
    }

    public String getTestCode() {
        return testCode;
    }

    public String getNhsCode() {
        return nhsCode;
    }


    private void checkNshCode(String nhsCode) {
        if (StringUtils.isBlank(nhsCode))
            throw new IllegalArgumentException("The NHS code cannot be blank");
        if (!nhsCode.matches("[ a-zA-Z0-9]+$")) {
            throw new IllegalArgumentException("NHS code only accepts letters and numbers");
        }
        if (nhsCode.length() != 12)
            throw new IllegalArgumentException("the nhs code must be 12 characters long");
    }

    public enum State{
        REGISTERED, SAMPLECOLLECTED, ANALYZED, DIAGNOSED, VALIDATED
    }

}
