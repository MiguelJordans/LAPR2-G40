package app.domain.model;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Ref;

import static org.junit.Assert.*;

public class RefValueAdapter1Test {

    RefValueAdapter1 rva1 = new RefValueAdapter1();

    @Test
    public void getRefValue() {

        RefValue expected = new RefValue("Index (S/C) Value", 0.0, 1.4);

        RefValue actual = rva1.getRefValue("Index (S/C) Value");

        Assert.assertEquals(expected.getClass(), actual.getClass());

    }

    @Test
    public void getRefValueMin() {

        String paramID = "IgGAN";

        String expected = "0.0";
        String actual = String.valueOf(rva1.getRefValueMin(paramID));

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getRefValueMinNotValid() {

        String paramID = "IgGAN";

        String expected = "10.0";
        String actual = String.valueOf(rva1.getRefValueMin(paramID));

        Assert.assertNotEquals(expected, actual);

    }

    @Test
    public void getRefValueMax() {

        String paramID = "IgGAN";

        String expected = "1.4";
        String actual = String.valueOf(rva1.getRefValueMax(paramID));

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getRefValueMaxNotValid() {

        String paramID = "IgGAN";

        String expected = "1.5";
        String actual = String.valueOf(rva1.getRefValueMax(paramID));

        Assert.assertNotEquals(expected, actual);

    }

    @Test
    public void getMetric() {

        String paramID = "IgGAN";

        String expected = "Index (S/C) Value";
        String actual = rva1.getMetric(paramID);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getMetricNotValid() {

        String paramID = "IgGAN";

        String expected = "g/L";
        String actual = rva1.getMetric(paramID);

        Assert.assertNotEquals(expected, actual);

    }
}