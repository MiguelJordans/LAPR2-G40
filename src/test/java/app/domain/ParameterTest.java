package app.domain;

import org.junit.Assert;
import org.junit.Test;

public class ParameterTest {

    @Test
    public void checkParameterToString1() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE","yes","aaa",parameterCategoryStore);

        String expected = " Code: " + "1abcE"  +
                ", Description:" + "yes" +
                ", Name:" + "aaa";

        String actual = pp.toString();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void checkParameterToString2() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("11111","22222","aaa",parameterCategoryStore);

        String expected = " Code: " + "11111"  +
                ", Description:" + "22222" +
                ", Name:" + "aaa";

        String actual = pp.toString();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setCode1(){

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE","yes","aaa",parameterCategoryStore);

        String expected ="1abcd";
        pp.setCode(expected);

        String Actual = pp.getCode();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setCode2(){
        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE","yes","aaa",parameterCategoryStore);

        String expected ="ABCDED";
        pp.setCode(expected);

        String Actual = pp.getCode();

        Assert.assertEquals(expected,Actual);
    }

    @Test
    public void setDescription1(){
        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE","yes","aaa",parameterCategoryStore);

        String expected ="1abcd";
        pp.setDescription(expected);

        String Actual = pp.getDescription();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDescription2(){
        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE","yes","aaa",parameterCategoryStore);

        String expected ="1abcdAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        pp.setDescription(expected);

        String Actual = pp.getDescription();

        Assert.assertEquals(expected,Actual);
    }

    @Test
    public void setName1(){
        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE","yes","aaa",parameterCategoryStore);
        String expected ="aaaaaaaa";
        pp.setName(expected);

        String Actual = pp.getName();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setName2(){
        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE","yes","aaa",parameterCategoryStore);

        String expected ="ASDASDASDASDASDASDASDa";
        pp.setName(expected);

        String Actual = pp.getName();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCodeNotAlphaNumeric1() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("****","yes","aaa",parameterCategoryStore);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCodeNotAlphaNumeric2() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("_:_","yes","aaa",parameterCategoryStore);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCodeTooManyChars() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("112312312312312312312312","yes","aaa",parameterCategoryStore);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCodeTooManyChars2() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1a4353453453453453453","aaaa","aaaaaa",parameterCategoryStore);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCodeBlank() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("","yes","aaa",parameterCategoryStore);

    }

    @Test
    public void checkCode() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE","yes","aaa",parameterCategoryStore);

        Assert.assertNotNull(pp);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameTooManyChars1() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE","yes","aasdasdasdasdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",parameterCategoryStore);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameTooManyChars2() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE","yes","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",parameterCategoryStore);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameBlank() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE","yes","",parameterCategoryStore);

    }

    @Test
    public void checkName() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE","yes","aaa",parameterCategoryStore);

        Assert.assertNotNull(pp);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionTooManyChars1() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE","yaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaes","aaa",parameterCategoryStore);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionTooManyChars2() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE","ySSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSes","aaa",parameterCategoryStore);

    }

    @Test
    public void checkDescriptionDescription() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE","yes","aaa",parameterCategoryStore);

        Assert.assertNotNull(pp);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionBlank() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE","","aaa",parameterCategoryStore);

    }

    @Test
    public void checkDescriptionDescription2() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE","11111111111111111111","aaa",parameterCategoryStore);

        Assert.assertNotNull(pp);

    }

    @Test
    public void checkDescriptionDescription3() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE","1111111111111111111","aaa",parameterCategoryStore);

        Assert.assertNotNull(pp);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionDescription4() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        Parameter pp = new Parameter("1abcE","111111111111111111111","aaa",parameterCategoryStore);

        Assert.assertNotNull(pp);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCategoryListBlank() {

        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        Parameter pp = new Parameter("1a111","aaa","2",pcStore);

    }

}