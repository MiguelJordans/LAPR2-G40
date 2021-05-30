package app.domain.model;

public class TestParameterResult {

    private String paramID;
    private double result;
    private RefValue refValue;

    /**
     * Constructor.
     *
     * @param paramID the parameter ID
     * @param result  the value/result
     */
    public TestParameterResult(String paramID, double result) {
        this.paramID = paramID;
        this.result = result;
    }

    /**
     * Gets the parameter ID.
     *
     * @return the parameter ID
     */
    public String getParamID() {
        return paramID;
    }

    /**
     * Gets the result.
     *
     * @return the result
     */
    public double getResult() {
        return result;
    }

    /**
     * Gets the reference value.
     *
     * @return the reference value
     */
    public RefValue getRefValue() {
        return refValue;
    }

    /**
     * Modifies the reference value.
     *
     * @param refValue the reference value
     */
    public void setRefValue(RefValue refValue) {
        this.refValue = refValue;
    }

}