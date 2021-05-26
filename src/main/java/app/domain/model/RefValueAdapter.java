package app.domain.model;

public interface RefValueAdapter {

    RefValue getRefValue(String param);

    double getRefValueMin(String param);

    double getRefValueMax(String param);

    String getMetric(String param);
}
