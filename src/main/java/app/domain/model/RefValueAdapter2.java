package app.domain.model;

import com.example2.EMRefValue;
import com.example2.ExternalModule2API;

public class RefValueAdapter2 implements RefValueAdapter {
    ExternalModule2API api;

    public RefValueAdapter2() {
        this.api = new ExternalModule2API();
    }

    public RefValue getRefValue(String param) {
        return new RefValue(getMetric(param), getRefValueMin(param), getRefValueMax(param));
    }

    public double getRefValueMin(String paramID) {
        EMRefValue refValue = api.getReferenceFor(paramID);
        return refValue.getMinValue();
    }

    public double getRefValueMax(String paramID) {
        EMRefValue refValue = api.getReferenceFor(paramID);
        return refValue.getMaxValue();
    }

    public String getMetric(String paramID) {
        return api.getMetricsFor(paramID);
    }
}
