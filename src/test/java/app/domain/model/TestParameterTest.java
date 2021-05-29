package app.domain.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestParameterTest {

    @Test
    public void getTestID() {

        ParameterCategory parameterCategory = new ParameterCategory("12345", "categoria", "1212");
        Parameter p1 = new Parameter("IgGAN", "000", "paramCv1", parameterCategory);
        TestParameter tp1 = new TestParameter("100000000000", p1);

        String expected = "100000000000";
        String actual = tp1.getTestID();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getParam() {

        ParameterCategory parameterCategory = new ParameterCategory("12345", "categoria", "1212");
        Parameter p1 = new Parameter("IgGAN", "000", "paramCv1", parameterCategory);
        TestParameter tp1 = new TestParameter("100000000000", p1);

        Parameter actual = tp1.getParam();

        Assert.assertEquals(p1, actual);

    }

    @Test
    public void getTpr() {

        ParameterCategory parameterCategory = new ParameterCategory("12345", "categoria", "1212");
        Parameter p1 = new Parameter("IgGAN", "000", "paramCv1", parameterCategory);
        TestParameter tp1 = new TestParameter("100000000000", p1);

        TestParameterResult actual = tp1.getTpr();

        Assert.assertNull(actual);
    }

    @Test
    public void setTpr() {

        ParameterCategory parameterCategory = new ParameterCategory("12345", "categoria", "1212");
        Parameter p1 = new Parameter("IgGAN", "000", "paramCv1", parameterCategory);
        TestParameter tp1 = new TestParameter("100000000000", p1);
        TestParameterResult tpr1 = new TestParameterResult("IgGAN", 15);

        tp1.setTpr(tpr1);
        TestParameterResult actual = tp1.getTpr();

        Assert.assertEquals(tpr1, actual);

    }
}