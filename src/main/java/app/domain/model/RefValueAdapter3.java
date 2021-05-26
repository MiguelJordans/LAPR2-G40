package app.domain.model;

import app.domain.shared.Constants;
import com.example1.ExternalModule3API;

public class RefValueAdapter3 implements RefValueAdapter{
    ExternalModule3API api;

    public RefValueAdapter3() {
        this.api = new ExternalModule3API();
    }

    public RefValue getRefValue(String param) {
        return new RefValue(getMetric(param), getRefValueMin(param), getRefValueMax(param));
    }

    public double getRefValueMin(String paramID) {
        return api.getMinReferenceValue(paramID, Constants.ACCESS_KEY);
    }

    public double getRefValueMax(String paramID) {
        return api.getMaxReferenceValue(paramID, Constants.ACCESS_KEY);
    }

    public String getMetric(String paramID) {
        return api.usedMetric(paramID, Constants.ACCESS_KEY);
    }
}
