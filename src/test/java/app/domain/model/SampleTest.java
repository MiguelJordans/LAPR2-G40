package app.domain.model;

import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class SampleTest {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    String date = dtf.format(now);

    @Test
    public void createSample() {

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        Sample sm1 = new Sample(test, "11111111111",date);

    }

    @Test
    public void createSampleNotNull() {

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        Sample sm1 = new Sample(test, "11111111111",date);

        Assert.assertNotNull(sm1);

    }

    @Test
    public void createSampleNull() {

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        Sample sm1 = null;

        Assert.assertNull(sm1);

    }

    @Test
    public void getBarcode1() {

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        Sample sm1 = new Sample(test, "11111111111",date);

        String expected = "11111111111";
        String actual = sm1.getBarcode();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getBarcodeNotNull() {

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        Sample sm1 = new Sample(test, "11111111111",date);


        String actual = sm1.getBarcode();

        Assert.assertNotNull(actual);

    }

    @Test
    public void getBarcodeNull() {

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        Sample sm1 = new Sample(test, null,date);


        String actual = sm1.getBarcode();

        Assert.assertNull(actual);

    }

    @Test(expected = ComparisonFailure.class)
    public void getBarcode2() {

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        Sample sm1 = new Sample(test, "11111111111",date);

        String expected = "1111111111";
        String actual = sm1.getBarcode();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getTest() {

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        Sample sm1 = new Sample(test, "11111111111",date);

        app.domain.model.Test expected = test;
        app.domain.model.Test actual = sm1.getTr();

        Assert.assertEquals(expected, actual);

    }

    @Test(expected = AssertionError.class)
    public void getTest2() {

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        Sample sm1 = new Sample(test, "11111111111",date);

        app.domain.model.Test expected = null;
        app.domain.model.Test actual = sm1.getTr();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getTestNotNull() {

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        Sample sm1 = new Sample(test, "11111111111",date);

        app.domain.model.Test actual = sm1.getTr();

        Assert.assertNotNull(actual);

    }

    @Test
    public void getTestNull() {

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        Sample sm1 = new Sample(null, "11111111111",date);


        app.domain.model.Test actual = sm1.getTr();

        Assert.assertNull(actual);

    }

    @Test
    public void setBarcode() {

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        Sample sm1 = new Sample(test, "11111111111",date);

        String expected = "19111111111";

        sm1.setBarcode(expected);

        Assert.assertNotNull(sm1.getBarcode());

    }

    @Test
    public void setBarcodeNull() {

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        Sample sm1 = new Sample(test, "11111111111",date);

        String expected = null;

        sm1.setBarcode(expected);

        Assert.assertNull(sm1.getBarcode());

    }

    @Test
    public void setTest() {

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        Sample sm1 = new Sample(test, "11111111111",date);

        app.domain.model.Test expected = new app.domain.model.Test("1234567890123412", "120000000000", "991999999999", bloodTest);

        sm1.setTr(expected);

        Assert.assertNotNull(sm1.getTr());

    }

    @Test
    public void setTestNull() {

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        Sample sm1 = new Sample(test, "11111111111",date);

        app.domain.model.Test expected = null;

        sm1.setTr(expected);

        Assert.assertNull(sm1.getTr());
    }

    @Test
    public void toStringTest() {

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        Sample sm1 = new Sample(test, "11111111111",date);

        String expected = "Sample{tr=Test{TinNumber='1234567890123456', testID='100000000000', nhsCode='999999999999', tt= Test Code: BL000, Description:Blood Test, CollectingMethod:Needle, state=CREATED, date=2021-05-31}, barcode='11111111111', date="+date+"}";
        String actual = sm1.toString();

        Assert.assertEquals(expected,actual);

    }

}