package app.domain.model;

import app.domain.stores.ParameterStore;
import org.apache.commons.lang3.ObjectUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ParameterTest {

    @Test
    public void checkParameterToString1() {

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        Parameter pp = new Parameter("1abcE","yes","aaa",pc);

        String expected = " Code: " + "1abcE"  +
                ", Description:" + "yes" +
                ", Name:" + "aaa";

        String actual = pp.toString();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setCode1(){

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        Parameter pp = new Parameter("1abcE","111111111","aaa",pc);

        String expected ="1abcd";
        pp.setCode(expected);

        String Actual = pp.getCode();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setCode2(){
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        Parameter pp = new Parameter("1abcE","111111111","aaa",pc);

        String expected ="ABCDED";
        pp.setCode(expected);

        String Actual = pp.getCode();

        Assert.assertEquals(expected,Actual);
    }

    @Test
    public void setDescription1(){
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        Parameter pp = new Parameter("1abcE","111111111","aaa",pc);

        String expected ="1abcd";
        pp.setDescription(expected);

        String Actual = pp.getDescription();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDescription2(){
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        Parameter pp = new Parameter("1abcE","111111111","aaa",pc);

        String expected ="1abcdAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        pp.setDescription(expected);

        String Actual = pp.getDescription();

        Assert.assertEquals(expected,Actual);
    }

    @Test
    public void setName1(){
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        Parameter pp = new Parameter("1abcE","111111111","aaa",pc);
        String expected ="aaaaaaaa";
        pp.setName(expected);

        String Actual = pp.getName();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setName2(){
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        Parameter pp = new Parameter("1abcE","111111111","aaa",pc);

        String expected ="ASDASDASDASDASDASDASDa";
        pp.setName(expected);

        String Actual = pp.getName();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCodeNotAlphaNumeric() {

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        Parameter pp = new Parameter("***","111111111","aaa",pc);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCodeTooManyChars() {

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        Parameter pp = new Parameter("1abc1111111111111111E","111111111","aaa",pc);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCodeBlank() {

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        Parameter pp = new Parameter("","111111111","aaa",pc);

    }

    @Test
    public void checkCode() {

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        Parameter pp = new Parameter("1abcE","111111111","aaa",pc);

        Assert.assertNotNull(pp);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameTooManyChars() {

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        Parameter pp = new Parameter("1abcE","111111111","aaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa",pc);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameBlank() {

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        Parameter pp = new Parameter("1abcE","111111111","",pc);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionTooManyChars1() {

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        Parameter pp = new Parameter("1abcE","111111111111111111111111111111111111111111111111111111111111111111111111111111111","aaa",pc);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionBlank() {

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        Parameter pp = new Parameter("1abcE","","aaa",pc);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCategoryListBlank() {

        ParameterCategory pc = null;

        Parameter pp = new Parameter("1abcE","111111111","aaa",pc);

    }

    @Test(expected = IllegalArgumentException.class)
    public void setPcList(){

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        Parameter pp = new Parameter("1abcE","111111111","aaa",pc);

        ParameterCategory pc1 = null;

        pp.setPc(pc1);

    }

    @Test
    public void getPP(){

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        Parameter pp = new Parameter("1abcE","111111111","aaa",pc);

        pp.getPc();

    }

    @Test
    public void getPPNotNull(){

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        Parameter pp = new Parameter("1abcE","111111111","aaa",pc);

        pp.getPc();

        Assert.assertNotNull(pp);

    }

}