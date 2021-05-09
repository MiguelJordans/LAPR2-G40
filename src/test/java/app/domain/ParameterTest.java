package app.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParameterTest {

    @Test
    public void checkParameterToString1() {

        Parameter pp = new Parameter("1abcE","yes","aaa");

        String expected = " Code: " + "1abcE"  +
                ", Description:" + "yes" +
                ", Name:" + "aaa";

        String actual = pp.toString();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void checkParameterToString2() {

        Parameter pp = new Parameter("11111","22222","aaa");

        String expected = " Code: " + "11111"  +
                ", Description:" + "22222" +
                ", Name:" + "aaa";

        String actual = pp.toString();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setCode1(){

        Parameter pp = new Parameter("11111","22222","aaa");

        String expected ="1abcd";
        pp.setCode(expected);

        String Actual = pp.getCode();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setCode2(){
        Parameter pp = new Parameter("11111","22222","aaa");

        String expected ="ABCDED";
        pp.setCode(expected);

        String Actual = pp.getCode();

        Assert.assertEquals(expected,Actual);
    }

    @Test
    public void setDescription1(){
        Parameter pp = new Parameter("11111","22222","aaa");

        String expected ="1abcd";
        pp.setDescription(expected);

        String Actual = pp.getDescription();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDescription2(){
        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        TestType tt = new TestType("ABCDE","ABCDE'","swab",pcStore);

        String expected ="1abcdAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        tt.setDescription(expected);

        String Actual = tt.getDescription();

        Assert.assertEquals(expected,Actual);
    }

    @Test
    public void setName1(){
        Parameter pp = new Parameter("11111","22222","aaa");

        String expected ="aaaaaaaa";
        pp.setName(expected);

        String Actual = pp.getName();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setName2(){
        Parameter pp = new Parameter("11111","22222","aaa");

        String expected ="ASDASDASDASDASDASDASDa";
        pp.setName(expected);

        String Actual = pp.getName();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCodeNotAlphaNumeric1() {

        Parameter pp = new Parameter("+´+111","22222","aaa");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCodeNotAlphaNumeric2() {

        Parameter pp = new Parameter(".-.","22222","aaa");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCodeTooManyChars() {

        Parameter pp = new Parameter("11112312312311","22222","aaa");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCodeTooManyChars2() {

        Parameter pp = new Parameter("111ASSSDS11","22222","aaa");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCodeBlank() {

        Parameter pp = new Parameter("","22222","aaa");

    }

    @Test
    public void checkCode() {

        Parameter pp = new Parameter("1231","22222","aaa");

        Assert.assertNotNull(pp);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameTooManyChars1() {

        Parameter pp = new Parameter("11111","AAAAA222","aa212312312312312a");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameTooManyChars2() {

        Parameter pp = new Parameter("11111","2","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameBlank() {

        Parameter pp = new Parameter("2","22222","");

    }

    @Test
    public void checkName() {

        Parameter pp = new Parameter("2","22222","aaaaaa");

        Assert.assertNotNull(pp);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionTooManyChars1() {

        Parameter pp = new Parameter("3","22AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA222","aaa");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionTooManyChars2() {

        Parameter pp = new Parameter("12","2222232323gdfgdfgd233234234234sdgfsdgsdgs2","aaa");

    }

    @Test
    public void checkDescriptionDescription() {

        Parameter pp = new Parameter("12","222fg2","aaa");

        Assert.assertNotNull(pp);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionBlank() {

        Parameter pp = new Parameter("21","","aaa");

    }

}
