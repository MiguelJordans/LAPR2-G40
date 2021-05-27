package app.domain.model;

public class TestParameter {

    private String testID;
    private Parameter param;
    private TestParameterResult tpr;

    public TestParameter(String testID, Parameter param) {
        this.testID = testID;
        this.param = param;
        tpr = null;
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

    public void setTpr(TestParameterResult tpr) {
        this.tpr = tpr;
    }

    @Override
    public String toString() {
        return this.tpr.toString();
    }
}
