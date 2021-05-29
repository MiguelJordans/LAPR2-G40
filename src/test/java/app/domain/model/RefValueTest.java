package app.domain.model;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Ref;

import static org.junit.Assert.*;

public class RefValueTest {

    @Test
    public void getMetric() {

        RefValue rv1 = new RefValue("aaa", 10.0, 20.0);

        String expected = "aaa";
        String actual = rv1.getMetric();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getRefValueMin() {

        RefValue rv1 = new RefValue("aaa", 10.0, 20.0);

        Double expected = 10.0;
        Double actual = rv1.getRefValueMin();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getRefValueMax() {

        RefValue rv1 = new RefValue("aaa", 10.0, 20.0);

        Double expected = 20.0;
        Double actual = rv1.getRefValueMax();

        Assert.assertEquals(expected, actual);

    }
}