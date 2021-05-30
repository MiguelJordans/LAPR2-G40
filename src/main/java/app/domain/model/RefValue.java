package app.domain.model;

public class RefValue {

    private String metric;
    private double refValueMin;
    private double refValueMax;

    /**
     * Constructor.
     *
     * @param metric      the metric
     * @param refValueMin the minimum reference value
     * @param refValueMax the maximum reference value
     */
    public RefValue(String metric, double refValueMin, double refValueMax) {
        this.metric = metric;
        this.refValueMin = refValueMin;
        this.refValueMax = refValueMax;
    }

    /**
     * Gets the metric.
     *
     * @return the metric
     */
    public String getMetric() {
        return metric;
    }

    /**
     * Gets the minimum reference value.
     *
     * @return the minimum reference value
     */
    public double getRefValueMin() {
        return refValueMin;
    }

    /**
     * Gets the maximum reference value.
     *
     * @return the maximum reference value
     */
    public double getRefValueMax() {
        return refValueMax;
    }
}
