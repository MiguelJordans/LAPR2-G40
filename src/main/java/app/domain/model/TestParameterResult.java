package app.domain.model;

public class TestParameterResult {

    String paramID;
    double result;
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

    @Override
    public String toString() {
        return "Parameter: " + paramID + "\n Result: " + result + ", " + refValue.getMetric() + "Reference values: \n" + "Max: " + refValue.getRefValueMax() + "\n Min: " + refValue.getRefValueMin();
    }
}
