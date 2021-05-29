package app.domain.model;

public class TestParameterResult {

    private String paramID;
    private double result;
    private RefValue refValue;

    public TestParameterResult(String paramID, double result) {
        this.paramID = paramID;
        this.result = result;
    }

    public String getParamID() {
        return paramID;
    }

    public double getResult() {
        return result;
    }

    public RefValue getRefValue() {
        return refValue;
    }

    public void setRefValue(RefValue refValue) {
        this.refValue = refValue;
    }

}