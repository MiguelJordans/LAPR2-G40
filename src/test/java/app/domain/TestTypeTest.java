package app.domain;
import org.junit.Assert;
import org.junit.Test;

public class TestTypeTest {

    @Test
    public void checkParameterToString1() {

        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();

        TestType tt = new TestType("1abcE","yes","aaa",pcStore);

        String expected = " Test Code: " + "1abcE"  +
                ", Description:" + "yes" +
                ", CollectingMethod:" + "aaa";

        String actual = tt.toString();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void checkParameterToString2() {

        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();

        TestType tt = new TestType("1111","23232s","aaa42342",pcStore);

        String expected = " Test Code: " + "1111"  +
                ", Description:" + "23232s" +
                ", CollectingMethod:" + "aaa42342";

        String actual = tt.toString();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setTestCode1(){

        ParameterCategoryStore pcStore = new ParameterCategoryStore();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();

        TestType tt = new TestType("1111","23232s","aaa42342",pcStore);

        String expected ="1abcd";
        tt.setTestCode(expected);

        String Actual = tt.getTestCode();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setTestCode2(){
        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        TestType tt = new TestType("1111","23232s","aaa42342",pcStore);

        String expected ="1SDASDASDASDA";
        tt.setTestCode(expected);

        String Actual = tt.getTestCode();

        Assert.assertEquals(expected,Actual);
    }

    @Test
    public void setDescription1(){

        ParameterCategoryStore pcStore = new ParameterCategoryStore();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();
        TestType tt = new TestType("1111","23232s","aaa42342",pcStore);

        String expected ="1abcd";
        tt.setDescription(expected);

        String Actual = tt.getDescription();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDescription2(){
        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        TestType tt = new TestType("1111","23232s","aaa42342",pcStore);

        String expected ="1abAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcd";
        tt.setDescription(expected);

        String Actual = tt.getDescription();

        Assert.assertEquals(expected,Actual);
    }

    @Test
    public void setCollectingMethod1(){

        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();
        TestType tt = new TestType("1111","23232s","aaa42342",pcStore);

        String expected ="aaaaaaaa";
        tt.setCollectingMethod(expected);

        String Actual = tt.getCollectingMethod();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setCollectingMethod2(){
        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        TestType tt = new TestType("1111","23232s","aaa42342",pcStore);

        String expected ="aaaaaASDASDASDASDASDASDASDASDASDASDAaaa";
        tt.setCollectingMethod(expected);

        String Actual = tt.getCollectingMethod();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTestCodeNotAlphaNumeric1() {

        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        TestType tt = new TestType("+++","23232s","aaa42342",pcStore);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTestCodeNotAlphaNumeric2() {

        ParameterCategoryStore pcStore = new ParameterCategoryStore();

        TestType tt = new TestType("...","23232s","aaa42342",pcStore);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTestCodeTooManyChars() {

        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        TestType tt = new TestType("11aaaaaa11","23232s","aaa42342",pcStore);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTestCodeTooManyChars2() {

        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        TestType tt = new TestType("111asdasdasdas1","23232s","aaa42342",pcStore);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTestCodeBlank() {

        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        TestType tt = new TestType("","23232s","aaa42342",pcStore);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCollectingMethodTooManyChars1() {

        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        TestType tt = new TestType("1111","23232s","aaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA42342",pcStore);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCollectingMethodTooManyChars2() {

        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        TestType tt = new TestType("1111","23232s","aaaAAAAAAAAA1231231231231231AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA42342",pcStore);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCollectingMethodBlank() {

        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        TestType tt = new TestType("1111","23232s","",pcStore);

    }

    @Test
    public void checkCollectingMethod() {

        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("AAAAa","aaa","aaaa");
        pcStore.listAdd();
        TestType tt = new TestType("1111","23232s","aaaa",pcStore);

        Assert.assertNotNull(tt);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionTooManyChars1() {

        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        TestType tt = new TestType("1111","232asdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasda32s","2",pcStore);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionTooManyChars2() {

        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        TestType tt = new TestType("1111","2312312312312312312312312312312312312312312312232s","2",pcStore);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionBlank() {

        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        TestType tt = new TestType("1111","","2",pcStore);

    }
    
    @Test
    public void setPp() {

        ParameterCategoryStore pcStore = new ParameterCategoryStore();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();

        TestType tt = new TestType("1111","aaa","2",pcStore);

        ParameterCategoryStore pctt = new ParameterCategoryStore();

        tt.setPp(pctt);


    }

    @Test
    public void getTestCode() {

        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        TestType tt = new TestType("1111","aaaaa","2",pcStore);

        tt.getTestCode();

    }

    @Test
    public void setTestCode() {

        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        TestType tt = new TestType("1111","aaaaa","2",pcStore);

        tt.setTestCode("dn");

    }

    @Test
    public void getDescription(){

        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        TestType tt = new TestType("1111","aaaaa","2",pcStore);

        tt.getDescription();

    }

    @Test
    public void setDescription(){

        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        TestType tt = new TestType("1111","aaaaa","2",pcStore);

        tt.setDescription("aaaa");

    }

    @Test
    public void getCollectingMethod(){

        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        TestType tt = new TestType("1111","aaaaa","2",pcStore);

        tt.getCollectingMethod();
    }

    @Test
    public void setCollectingMethod(){

        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();

        TestType tt = new TestType("1111","aaaaa","2",pcStore);

        tt.setCollectingMethod("aaaa");

    }

    @Test
    public void checkCategoryList(){
        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();

        TestType tt = new TestType("1111","aaaaa","2",pcStore);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCategoryListBlank() {

        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        TestType tt = new TestType("1111","aaa","2",pcStore);

    }

}