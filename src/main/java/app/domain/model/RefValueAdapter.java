package app.domain.model;

public interface RefValueAdapter {

    /**
     * Gets the reference value of the parameter.
     *
     * @param param the parameter code
     * @return the reference value of the parameter
     */
    RefValue getRefValue(String param);

    /**
     * Gets the minimum reference value of the parameter.
     *
     * @param param the parameter code
     * @return the minimum reference value of the parameter
     */
    double getRefValueMin(String param);

    /**
     * Gets the maximum reference value of the parameter.
     *
     * @param param the parameter code
     * @return the maximum reference value of the parameter
     */
    double getRefValueMax(String param);

    /**
     * Gets the metric of the parameter.
     *
     * @param param the parameter code
     * @return the metric of the parameter
     */
    String getMetric(String param);
}
