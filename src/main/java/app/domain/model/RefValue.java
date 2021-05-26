package app.domain.model;

public class RefValue {

    private String metric;
    private double refValueMin;
    private double refValueMax;

    public RefValue(String metric, double refValueMin, double refValueMax) {
        this.metric = metric;
        this.refValueMin = refValueMin;
        this.refValueMax = refValueMax;
    }

    public String getMetric() {
        return metric;
    }

    public double getRefValueMin() {
        return refValueMin;
    }

    public double getRefValueMax() {
        return refValueMax;
    }
}
