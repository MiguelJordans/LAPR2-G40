package app.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParameterCategoryTest {

    @Test
    public void checkParameterToString1() {

        ParameterCategory pc = new ParameterCategory("1abcE","yes","aaa");

        String expected = " Code: " + "1abcE"  +
                ", Description:" + "yes" +
                ", NHSLD:" + "aaa";

        String actual = pc.toString();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void checkParameterToString2() {

        ParameterCategory pc = new ParameterCategory("1abcE","ye22s","aaa");

        String expected = " Code: " + "1abcE"  +
                ", Description:" + "ye22s" +
                ", NHSLD:" + "aaa";

        String actual = pc.toString();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setCode1(){

        ParameterCategory pc = new ParameterCategory("1abcE","ye22s","aaa");

        String expected ="1abcd";
        pc.setCode(expected);

        String Actual = pc.getCode();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setCode2(){
        ParameterCategory pc = new ParameterCategory("1abcE","ye22s","aaa");

        String expected ="ABCD3434ED";
        pc.setCode(expected);

        String Actual = pc.getCode();

        Assert.assertEquals(expected,Actual);
    }

    @Test
    public void setDescription1(){
        ParameterCategory pc = new ParameterCategory("1abcE","ye22s","aaa");

        String expected ="1abcd";
        pc.setDescription(expected);

        String Actual = pc.getDescription();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDescription2(){
        ParameterCategory pc = new ParameterCategory("1abcE","ye22s","aaa");

        String expected ="1abcdAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        pc.setDescription(expected);

        String Actual = pc.getDescription();

        Assert.assertEquals(expected,Actual);
    }

    @Test
    public void setNHSLD1(){
        ParameterCategory pc = new ParameterCategory("1abcE","ye22s","aaa");

        String expected ="aaaaaaaa";
        pc.setName(expected);

        String Actual = pc.getNhsld();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setNHSLD2(){
        ParameterCategory pc = new ParameterCategory("1abcE","ye22s","aaa");

        String expected ="ASDASDASDASDASDASDASDa";
        pc.setName(expected);

        String Actual = pc.getNhsld();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCodeTooManyChars() {

        ParameterCategory pc = new ParameterCategory("1ab23423423423cE","ye22s","aaa");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCodeTooFewChars2() {

        ParameterCategory pc = new ParameterCategory("1","ye22s","aaa");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCodeBlank() {

        ParameterCategory pc = new ParameterCategory("","ye22s","aaa");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNHSLDTooManyChars1() {

        ParameterCategory pc = new ParameterCategory("1abcE","ye22s","aa1234213412341234123412341a");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNHSLDTooManyChars2() {

        ParameterCategory pc = new ParameterCategory("1abcE","ye22s","aa2452345234523452345234523452345234523452345234523452345a");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNHSLDBlank() {

        ParameterCategory pc = new ParameterCategory("1abcE","ye22s","");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionTooManyChars1() {

        ParameterCategory pc = new ParameterCategory("1abcE","yeye22sye22sye22sye22sye22sye22sye22sye22sye22sye22sye22sye22sye22sye22sye22sye22sye22sye22sye22s22s","aaa");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionTooManyChars2() {

        ParameterCategory pc = new ParameterCategory("1abcE","ye2sye22sye22sye22sye22sye22sye22sye22sye22sye22sye22sye22sye22sye221452351235123512352s","aaa");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionBlank() {

        ParameterCategory pc = new ParameterCategory("1abcE","","aaa");

    }

}
