package app.domain.model;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestTypeTest {

    @Test
    public void checkParameterToString1() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);

        String expected = " Test Code: " + "1abcE"  +
                ", Description:" + "yes" +
                ", CollectingMethod:" + "aaa";

        String actual = tt.toString();

        Assert.assertEquals(expected,actual);

    }


    @Test
    public void checkParameterToString2() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1111","23232s","aaa42342",pcList);

        String expected = " Test Code: " + "1111"  +
                ", Description:" + "23232s" +
                ", CollectingMethod:" + "aaa42342";

        String actual = tt.toString();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setTestCode1(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1111","23232s","aaa42342",pcList);

        String expected ="1abcd";
        tt.setTestCode(expected);

        String Actual = tt.getTestCode();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setTestCode2(){
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1111","23232s","aaa42342",pcList);

        String expected ="1SDASDASDASDA";
        tt.setTestCode(expected);

        String Actual = tt.getTestCode();

        Assert.assertEquals(expected,Actual);
    }

    @Test
    public void setDescription1(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1111","23232s","aaa42342",pcList);

        String expected ="1abcd";
        tt.setDescription(expected);

        String Actual = tt.getDescription();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDescription2(){
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1111","23232s","aaa42342",pcList);

        String expected ="1abAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcd";
        tt.setDescription(expected);

        String Actual = tt.getDescription();

        Assert.assertEquals(expected,Actual);
    }

    @Test
    public void setCollectingMethod1(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1111","23232s","aaa42342",pcList);

        String expected ="aaaaaaaa";
        tt.setCollectingMethod(expected);

        String Actual = tt.getCollectingMethod();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setCollectingMethod2(){
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1111","23232s","aaa42342",pcList);

        String expected ="aaaaaASDASDASDASDASDASDASDASDASDASDAaaa";
        tt.setCollectingMethod(expected);

        String Actual = tt.getCollectingMethod();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTestCodeNotAlphaNumeric1() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("+++","23232s","aaa42342",pcList);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTestCodeNotAlphaNumeric2() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("+...","23232s","aaa42342",pcList);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTestCodeTooManyChars() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType tt = new TestType("11aaaaaa11","23232s","aaa42342",pcList);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTestCodeTooManyChars2() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType tt = new TestType("111asdasdasdas1","23232s","aaa42342",pcList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTestCodeBlank() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType tt = new TestType("","23232s","aaa42342",pcList);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCollectingMethodTooManyChars1() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType tt = new TestType("1111","23232s","aaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA42342",pcList);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCollectingMethodTooManyChars2() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType tt = new TestType("1111","23232s","aaaAAAAAAAAA1231231231231231AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA42342",pcList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCollectingMethodBlank() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType tt = new TestType("1111","23232s","",pcList);

    }

    @Test
    public void checkCollectingMethod() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType tt = new TestType("1111","23232s","aaaa",pcList);

        Assert.assertNotNull(tt);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionTooManyChars1() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType tt = new TestType("1111","232asdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasda32s","2",pcList);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionTooManyChars2() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType tt = new TestType("1111","2312312312312312312312312312312312312312312312232s","2",pcList);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionBlank() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType tt = new TestType("1111","","2",pcList);

    }

    @Test
    public void setPp() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1111","aaa","2",pcList);

        List<ParameterCategory> pctt = new ArrayList<>();

        tt.setPcList(pctt);


    }

    @Test
    public void getTestCode() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType tt = new TestType("1111","aaaaa","2",pcList);

        tt.getTestCode();

    }

    @Test
    public void setTestCode() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType tt = new TestType("1111","aaaaa","2",pcList);

        tt.setTestCode("dn");

    }

    @Test
    public void getDescription(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType tt = new TestType("1111","aaaaa","2",pcList);

        tt.getDescription();

    }

    @Test
    public void setDescription(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType tt = new TestType("1111","aaaaa","2",pcList);

        tt.setDescription("aaaa");

    }

    @Test
    public void getCollectingMethod(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType tt = new TestType("1111","aaaaa","2",pcList);

        tt.getCollectingMethod();
    }

    @Test
    public void setCollectingMethod(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1111","aaaaa","2",pcList);

        tt.setCollectingMethod("aaaa");

    }

    @Test
    public void checkCategoryList(){
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1111","aaaaa","2",pcList);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCategoryListBlank() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        TestType tt = new TestType("1111","aaa","2",pcList);

    }

    @Test
    public void getPcList(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1111","aaaaa","2",pcList);

        Assert.assertNotNull(tt.getPcList());

    }

    @Test
    public void checkCollectingMethod3(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1111","aaaaa","11111111111111111111",pcList);

    }

    @Test
    public void checkCollectingMethod4(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1111","aaaaa","1111111111111111111",pcList);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCollectingMethod5(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1111","aaaaa","111111111111111111111",pcList);

    }


    @Test
    public void checkDescription3(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1111","111111111111111","11111111111111111111",pcList);

    }

    @Test
    public void checkDescription4(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1111","11111111111111","1111111111111111111",pcList);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescription5(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1111","111111111111111","111111111111111111111",pcList);

    }

    @Test
    public void getExternalModule(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1111","111111111111111","11111111",pcList);

        tt.getExternalModule();


    }

    @Test
    public void setExternalModule(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1111","111111111111111","11111111",pcList);

        Assert.assertNotNull(tt.setExternalModule("BL000"));


    }

    @Test
    public void setExternalModule2(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1111","111111111111111","11111111",pcList);

        Assert.assertNotNull(tt.setExternalModule("COV19"));


    }

    @Test
    public void setExternalModuleNull(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1111","111111111111111","11111111",pcList);

        Assert.assertNull(tt.setExternalModule("aaaa"));


    }



}