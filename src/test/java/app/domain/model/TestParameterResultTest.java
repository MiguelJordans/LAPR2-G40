package app.domain.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestParameterResultTest {

    @Test
    public void getParamID() {

        TestParameterResult tpr1 = new TestParameterResult("IgGAN", 15);

        String expected = "IgGAN";
        String actual = tpr1.getParamID();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getResult() {

        TestParameterResult tpr1 = new TestParameterResult("IgGAN", 15.5);

        Double expected = 15.5;
        Double actual = tpr1.getResult();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getRefValue() {

        TestParameterResult tpr1 = new TestParameterResult("IgGAN", 1.4);

        RefValue expected = new RefValue("mm/hr", 1.0, 10.0);

        tpr1.setRefValue(expected);
        RefValue actual = tpr1.getRefValue();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setRefValue() {

        TestParameterResult tpr1 = new TestParameterResult("IgGAN", 15.5);
        RefValue rv1 = new RefValue("aaa", 10.0, 20.0);

        tpr1.setRefValue(rv1);
        RefValue actual = tpr1.getRefValue();

        Assert.assertEquals(rv1, actual);

    }
}