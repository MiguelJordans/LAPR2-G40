package app.mappers.dto;

import app.domain.model.Parameter;
import app.domain.model.TestParameterResult;

public class TestParameterDTO {

    private String testID;
    private Parameter param;
    private TestParameterResult tpr;

    /**
     * Constructor.
     * @param testID the test ID
     * @param param the parameter
     */
    public TestParameterDTO(String testID, Parameter param) {
        this.testID = testID;
        this.param = param;
        this.tpr = null;
    }

    /**
     * Gets the test ID.
     * @return the test ID
     */
    public String getTestID() {
        return testID;
    }

    /**
     * Gets the parameter.
     * @return the parameter
     */
    public Parameter getParam() {
        return param;
    }

    /**
     * Gets the test parameter result.
     * @return the test parameter result
     */
    public TestParameterResult getTpr() {
        return tpr;
    }

    /**
     * Returns the textual description of the test parameter in the format: test ID, parameter, test parameter result.
     * @return the Test Parameter's characteristics
     */
    @Override
    public String toString() {
        return "TestParameterDTO{" +
                "testID='" + testID + '\'' +
                ", param='" + param + '\'' +
                ", tpr='" + tpr + '\'' +
                '}';
    }
}
