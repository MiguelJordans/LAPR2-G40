package app.domain.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RefValueAdapter2Test {

    RefValueAdapter2 rva2 = new RefValueAdapter2();

    @Test
    public void getRefValue() {

        RefValue expected = new RefValue("mm/hr", 1.0, 10.0);

        RefValue actual = rva2.getRefValue("mm/hr");

        Assert.assertEquals(expected.getClass(), actual.getClass());

    }

    @Test
    public void getRefValueMin() {

        String paramID = "ESR00";

        String expected = "1.0";
        String actual = String.valueOf(rva2.getRefValueMin(paramID));

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getRefValueMinNotValid() {

        String paramID = "ESR00";

        String expected = "1.1";
        String actual = String.valueOf(rva2.getRefValueMin(paramID));

        Assert.assertNotEquals(expected, actual);

    }

    @Test
    public void getRefValueMax() {

        String paramID = "ESR00";

        String expected = "10.0";
        String actual = String.valueOf(rva2.getRefValueMax(paramID));

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getRefValueMaxNotValid() {

        String paramID = "ESR00";

        String expected = "9.0";
        String actual = String.valueOf(rva2.getRefValueMax(paramID));

        Assert.assertNotEquals(expected, actual);

    }

    @Test
    public void getMetric() {

        String paramID = "ESR00";

        String expected = "mm/hr";
        String actual = rva2.getMetric(paramID);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getMetricNotValid() {

        String paramID = "ESR00";

        String expected = "g/L";
        String actual = rva2.getMetric(paramID);

        Assert.assertNotEquals(expected, actual);

    }
}