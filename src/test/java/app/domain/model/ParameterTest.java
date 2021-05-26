package app.domain.model;

import org.apache.commons.lang3.ObjectUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ParameterTest {

    @Test
    public void checkParameterToString1() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("1abcE","yes","aaa",pcList);

        String expected = " Code: " + "1abcE"  +
                ", Description:" + "yes" +
                ", Name:" + "aaa";

        String actual = pp.toString();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void checkParameterToString2() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("11111","22222","aaa",pcList);

        String expected = " Code: " + "11111"  +
                ", Description:" + "22222" +
                ", Name:" + "aaa";

        String actual = pp.toString();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setCode1(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("1abcE","yes","aaa",pcList);

        String expected ="1abcd";
        pp.setCode(expected);

        String Actual = pp.getCode();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setCode2(){
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("1abcE","yes","aaa",pcList);

        String expected ="ABCDED";
        pp.setCode(expected);

        String Actual = pp.getCode();

        Assert.assertEquals(expected,Actual);
    }

    @Test
    public void setDescription1(){
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("1abcE","yes","aaa",pcList);

        String expected ="1abcd";
        pp.setDescription(expected);

        String Actual = pp.getDescription();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDescription2(){
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("1abcE","yes","aaa",pcList);

        String expected ="1abcdAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        pp.setDescription(expected);

        String Actual = pp.getDescription();

        Assert.assertEquals(expected,Actual);
    }

    @Test
    public void setName1(){
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("1abcE","yes","aaa",pcList);
        String expected ="aaaaaaaa";
        pp.setName(expected);

        String Actual = pp.getName();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setName2(){
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("1abcE","yes","aaa",pcList);

        String expected ="ASDASDASDASDASDASDASDa";
        pp.setName(expected);

        String Actual = pp.getName();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCodeNotAlphaNumeric1() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("****","yes","aaa",pcList);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCodeNotAlphaNumeric2() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("_:_","yes","aaa",pcList);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCodeTooManyChars() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("112312312312312312312312","yes","aaa",pcList);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCodeTooManyChars2() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("1a4353453453453453453","aaaa","aaaaaa",pcList);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCodeBlank() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("","yes","aaa",pcList);

    }

    @Test
    public void checkCode() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("1abcE","yes","aaa",pcList);

        Assert.assertNotNull(pp);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameTooManyChars1() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("1abcE","yes","aasdasdasdasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",pcList);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameTooManyChars2() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("1abcE","yes","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",pcList);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameBlank() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("1abcE","yes","",pcList);

    }

    @Test
    public void checkName() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("1abcE","yes","aaa",pcList);

        Assert.assertNotNull(pp);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionTooManyChars1() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("1abcE","yaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaes","aaa",pcList);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionTooManyChars2() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("1abcE","ySSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSes","aaa",pcList);

    }

    @Test
    public void checkDescriptionDescription() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("1abcE","yes","aaa",pcList);

        Assert.assertNotNull(pp);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionBlank() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("1abcE","","aaa",pcList);

    }

    @Test
    public void checkDescriptionDescription2() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("1abcE","11111111111111111111","aaa",pcList);

        Assert.assertNotNull(pp);

    }

    @Test
    public void checkDescriptionDescription3() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("1abcE","1111111111111111111","aaa",pcList);

        Assert.assertNotNull(pp);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionDescription4() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("1abcE","111111111111111111111","aaa",pcList);

        Assert.assertNotNull(pp);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCategoryListBlank() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        Parameter pp = new Parameter("1111","aaa","2",pcList);

    }

    @Test(expected = NullPointerException.class)
    public void setPcList(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("1abcE","1111111111111111111","aaa",pcList);

        List<ParameterCategory> pcList1 = null;

        pp.setPcList(pcList1);

    }

    @Test
    public void getPP(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("1abcE","1111111111111111111","aaa",pcList);

        pp.getPcList();

    }

    @Test
    public void getPPNotNull(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        Parameter pp = new Parameter("1abcE","1111111111111111111","aaa",pcList);

        pp.getPcList();

        Assert.assertNotNull(pp);

    }

}