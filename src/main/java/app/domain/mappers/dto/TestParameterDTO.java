package app.domain.mappers.dto;

import app.domain.model.Parameter;
import app.domain.model.TestParameterResult;

public class TestParameterDTO {

    private String testID;
    private Parameter param;
    private TestParameterResult tpr;

    public TestParameterDTO(String testID, Parameter param) {
        this.testID = testID;
        this.param = param;
        this.tpr = null;
    }

    public String getTestID() {
        return testID;
    }

    public Parameter getParam() {
        return param;
    }

    public TestParameterResult getTpr() {
        return tpr;
    }

    @Override
    public String toString() {
        return "TestParameterDTO{" +
                "testID='" + testID + '\'' +
                ", param='" + param + '\'' +
                ", tpr='" + tpr + '\'' +
                '}';
    }
}
