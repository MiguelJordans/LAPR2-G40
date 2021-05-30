package app.domain.model;

import com.example2.EMRefValue;
import com.example2.ExternalModule2API;

public class RefValueAdapter2 implements RefValueAdapter {
    ExternalModule2API api;

    /**
     * Constructor.
     */
    public RefValueAdapter2() {
        this.api = new ExternalModule2API();
    }

    /**
     * Gets the reference value of the parameter.
     * @param param the parameter code
     * @return the reference value of the parameter
     */
    public RefValue getRefValue(String param) {
        return new RefValue(getMetric(param), getRefValueMin(param), getRefValueMax(param));
    }

    /**
     * Gets the minimum reference value of the parameter.
     * @param paramID the parameter code
     * @return the minimum reference value of the parameter
     */
    public double getRefValueMin(String paramID) {
        EMRefValue refValue = api.getReferenceFor(paramID);
        return refValue.getMinValue();
    }

    /**
     * Gets the maximum reference value of the parameter.
     * @param paramID the parameter code
     * @return the maximum reference value of the parameter
     */
    public double getRefValueMax(String paramID) {
        EMRefValue refValue = api.getReferenceFor(paramID);
        return refValue.getMaxValue();
    }

    /**
     * Gets the metric of the parameter.
     * @param paramID the parameter code
     * @return the metric of the parameter
     */
    public String getMetric(String paramID) {
        return api.getMetricsFor(paramID);
    }
}
