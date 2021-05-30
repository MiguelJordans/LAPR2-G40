package app.domain.model;

import app.domain.shared.Constants;
import com.example3.CovidReferenceValues1API;

public class RefValueAdapter1 implements RefValueAdapter {
    CovidReferenceValues1API api;

    /**
     * Constructor.
     */
    public RefValueAdapter1() {
        this.api = new CovidReferenceValues1API();
    }

    /**
     * Gets the reference value of the parameter.
     *
     * @param param the parameter code
     * @return the reference value of the parameter
     */
    public RefValue getRefValue(String param) {
        return new RefValue(getMetric(param), getRefValueMin(param), getRefValueMax(param));
    }

    /**
     * Gets the minimum reference value of the parameter.
     *
     * @param paramID the parameter code
     * @return the minimum reference value of the parameter
     */
    public double getRefValueMin(String paramID) {
        return api.getMinReferenceValue(paramID, Constants.ACCESS_KEY);
    }

    /**
     * Gets the maximum reference value of the parameter.
     *
     * @param paramID the parameter code
     * @return the maximum reference value of the parameter.
     */
    public double getRefValueMax(String paramID) {
        return api.getMaxReferenceValue(paramID, Constants.ACCESS_KEY);
    }

    /**
     * Gets the metric of the parameter.
     *
     * @param paramID the parameter code
     * @return the metric of the parameter.
     */
    public String getMetric(String paramID) {
        return api.usedMetric(paramID, Constants.ACCESS_KEY);
    }
}
