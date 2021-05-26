package app.domain.model;

import app.domain.shared.Constants;
import com.example3.CovidReferenceValues1API;

public class RefValueAdapter1 implements RefValueAdapter {
    CovidReferenceValues1API api;

    public RefValueAdapter1() {
        this.api = new CovidReferenceValues1API();
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
