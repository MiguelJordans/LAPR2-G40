package app.domain.model;

public class TestParameter {

    private String testID;
    private Parameter param;
    private TestParameterResult tpr;

    /**
     * Constructor.
     *
     * @param testID the test ID
     * @param param  the parameter
     */
    public TestParameter(String testID, Parameter param) {
        this.testID = testID;
        this.param = param;
        this.tpr = null;
    }

    /**
     * Gets the test ID.
     *
     * @return the test ID
     */
    public String getTestID() {
        return testID;
    }

    /**
     * Gets the parameter.
     *
     * @return the parameter
     */
    public Parameter getParam() {
        return param;
    }

    /**
     * Gets the test parameter result.
     *
     * @return the test parameter result
     */
    public TestParameterResult getTpr() {
        return tpr;
    }

    /**
     * Modifies the test parameter result.
     *
     * @param tpr the test parameter result
     */
    public void setTpr(TestParameterResult tpr) {
        this.tpr = tpr;
    }
}
