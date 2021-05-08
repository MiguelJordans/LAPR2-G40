package app.domain;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestTypeTest {

    @Test
    public void checkParameterToString1() {

        TestType tt = new TestType("1abcE","yes","aaa");

        String expected = " Test Code: " + "1abcE"  +
                ", Description:" + "yes" +
                ", CollectingMethod:" + "aaa";

        String actual = tt.toString();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void checkParameterToString2() {

        TestType tt = new TestType("1111","23232s","aaa42342");

        String expected = " Test Code: " + "1111"  +
                ", Description:" + "23232s" +
                ", CollectingMethod:" + "aaa42342";

        String actual = tt.toString();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setTestCode1(){

        TestType tt = new TestType("1111","23232s","aaa42342");

        String expected ="1abcd";
        tt.setTestCode(expected);

        String Actual = tt.getTestCode();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setTestCode2(){
        TestType tt = new TestType("1111","23232s","aaa42342");

        String expected ="1SDASDASDASDA";
        tt.setTestCode(expected);

        String Actual = tt.getTestCode();

        Assert.assertEquals(expected,Actual);
    }

    @Test
    public void setDescription1(){

        TestType tt = new TestType("1111","23232s","aaa42342");

        String expected ="1abcd";
        tt.setDescription(expected);

        String Actual = tt.getDescription();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDescription2(){
        TestType tt = new TestType("1111","23232s","aaa42342");

        String expected ="1abAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAcd";
        tt.setDescription(expected);

        String Actual = tt.getDescription();

        Assert.assertEquals(expected,Actual);
    }

    @Test
    public void setCollectingMethod1(){

        TestType tt = new TestType("1111","23232s","aaa42342");

        String expected ="aaaaaaaa";
        tt.setCollectingMethod(expected);

        String Actual = tt.getCollectingMethod();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setCollectingMethod2(){
        TestType tt = new TestType("1111","23232s","aaa42342");

        String expected ="aaaaaASDASDASDASDASDASDASDASDASDASDAaaa";
        tt.setCollectingMethod(expected);

        String Actual = tt.getCollectingMethod();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTestCodeNotAlphaNumeric1() {

        TestType tt = new TestType("+++","23232s","aaa42342");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTestCodeNotAlphaNumeric2() {

        TestType tt = new TestType("...","23232s","aaa42342");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTestCodeTooManyChars() {

        TestType tt = new TestType("11aaaaaa11","23232s","aaa42342");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTestCodeTooManyChars2() {

        TestType tt = new TestType("111asdasdasdas1","23232s","aaa42342");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTestCodeBlank() {

        TestType tt = new TestType("","23232s","aaa42342");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCollectingMethodTooManyChars1() {

        TestType tt = new TestType("1111","23232s","aaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA42342");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCollectingMethodTooManyChars2() {

        TestType tt = new TestType("1111","23232s","aaaAAAAAAAAA1231231231231231AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA42342");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCollectingMethodBlank() {

        TestType tt = new TestType("1111","23232s","");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionTooManyChars1() {

        TestType tt = new TestType("1111","232asdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasda32s","2");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionTooManyChars2() {

        TestType tt = new TestType("1111","2312312312312312312312312312312312312312312312232s","2");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionBlank() {

        TestType tt = new TestType("1111","","2");

    }

}
