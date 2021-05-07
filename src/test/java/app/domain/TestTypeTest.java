package app.domain;

import org.junit.Assert;
import org.junit.Test;

public class TestTypeTest {

    @Test
    public void checkTestCodeToString1() {

        TestType tt = new TestType("1abcE","yes","swab");

        String expected = " Test Code: " + "1abcE"  +
                ", Description:" + "yes" +
                ", CollectingMethod:" + "swab";

        String actual = tt.toString();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void checkTestCodeToString2() {

        TestType tt = new TestType("22222","AAAAAAAAAA","AAAAAAAAAA");

        String expected =  " Test Code: " + "22222"  +
                ", Description:" + "AAAAAAAAAA" +
                ", CollectingMethod:" + "AAAAAAAAAA";

        String actual = tt.toString();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setTestCode1(){
        TestType tt = new TestType("ABCDE","ABCDE'","swab");

        String expected ="1abcd";
        tt.setTestCode(expected);

        String Actual = tt.getTestCode();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setTestCode2(){
        TestType tt = new TestType("1''?-","SDFSGSDGSD0''0'12'2'2'2'2'","swab");

        String expected ="ABCDED";
        tt.setTestCode(expected);

        String Actual = tt.getTestCode();

        Assert.assertEquals(expected,Actual);
    }

    @Test
    public void setDescription1(){
        TestType tt = new TestType("ABCDE","ABCDE'","swab");

        String expected ="1abcd";
        tt.setDescription(expected);

        String Actual = tt.getDescription();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDescription2(){
        TestType tt = new TestType("ABCDE","ABCDE'","swab");

        String expected ="1abcdAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        tt.setDescription(expected);

        String Actual = tt.getDescription();

        Assert.assertEquals(expected,Actual);
    }

    @Test
    public void setCollectingMethod1(){
        TestType tt = new TestType("ABCDE","ABCDE'","swab");

        String expected ="aaaaaaaa";
        tt.setCollectingMethod(expected);

        String Actual = tt.getCollectingMethod();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setCollectingMethod2(){
        TestType tt = new TestType("ABCDE","ABCDE'","swab");

        String expected ="ABCDEABCDEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa12";
        tt.setCollectingMethod(expected);

        String Actual = tt.getCollectingMethod();

        Assert.assertEquals(expected,Actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTestCodeNotAlphaNumeric1() {

        TestType tt = new TestType("1''?-","yes","swab");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTestCodeNotAlphaNumeric2() {

        TestType tt = new TestType("+++++","yes","swab");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTestCodeTooManyChars() {

        TestType tt = new TestType("AAAA2AA","yes","swab");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTestCodeTooManyChars2() {

        TestType tt = new TestType("12aBcDe","yes","swab");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTestCodeBlank() {

        TestType tt = new TestType("",null,"swab");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionTooManyChars1() {

        TestType tt = new TestType("12aBcDe","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA","swab");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionTooManyChars2() {

        TestType tt = new TestType("12aBcDe","b12312312'1'22312312312asdsd","swab");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDescriptionBlank() {

        TestType tt = new TestType("12aBcDe",null,"swab");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCollectingMethodTooManyChars1() {

        TestType tt = new TestType("12aBcDe","b12312312'1'22312312312asdsd","abcde121212ab«ededede");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCollectingMethodTooManyChars2() {

        TestType tt = new TestType("12aBcDe","b12312312'1'22312312312asdsd","AAABBBBCCCCCDDDDDDEEEEEEFFFFF");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCollectingMethodBlank() {

        TestType tt = new TestType("12aBcDe","b12312312'1'22312312312asdsd",null);

    }

}
