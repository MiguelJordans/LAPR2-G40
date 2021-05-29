package app.domain.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RefValueAdapter3Test {

    RefValueAdapter3 rva3 = new RefValueAdapter3();

    @Test
    public void getRefValue() {

        RefValue expected = new RefValue("g/L", 130.0, 180.0);

        RefValue actual = rva3.getRefValue("g/L");

        Assert.assertEquals(expected.getClass(), actual.getClass());

    }

    @Test
    public void getRefValueMin() {

        String paramID = "HB000";

        String expected = "130.0";
        String actual = String.valueOf(rva3.getRefValueMin(paramID));

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getRefValueMinNotValid() {

        String paramID = "HB000";

        String expected = "120.0";
        String actual = String.valueOf(rva3.getRefValueMin(paramID));

        Assert.assertNotEquals(expected, actual);

    }

    @Test
    public void getRefValueMax() {

        String paramID = "HB000";

        String expected = "180.0";
        String actual = String.valueOf(rva3.getRefValueMax(paramID));

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getRefValueMaxNotValid() {

        String paramID = "HB000";

        String expected = "200.0";
        String actual = String.valueOf(rva3.getRefValueMax(paramID));

        Assert.assertNotEquals(expected, actual);

    }

    @Test
    public void getMetric() {

        String paramID = "HB000";

        String expected = "g/L";
        String actual = rva3.getMetric(paramID);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getMetricNotValid() {

        String paramID = "HB000";

        String expected = "mm/hr";
        String actual = rva3.getMetric(paramID);

        Assert.assertNotEquals(expected, actual);

    }
}