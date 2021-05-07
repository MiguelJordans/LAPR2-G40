package app.controller;

import app.domain.Company;
import org.junit.Assert;
import org.junit.Test;

public class TestTypeControllerTest {

    Company company = App.getInstance().getCompany();

    @Test
    public void testCreateTestType() {

        TestTypeController ctrl = new TestTypeController();

    }

    @Test
    public void testCreateTestTypeWithParameter() {

        TestTypeController ctrl = new TestTypeController(company);

    }

    @Test
    public void createValidTestType(){

        TestTypeController ctrl = new TestTypeController();
        ctrl.CreateTestType("aaa","aaa","aaa");

    }

    @Test(expected = IllegalArgumentException.class)
    public void createInvalidTestType(){
        TestTypeController ctrl = new TestTypeController();
        ctrl.CreateTestType("aaa","+++","aaa");
    }

    @Test
    public void saveTestType() {

       TestTypeController ctrl = new TestTypeController();
       ctrl.CreateTestType("aaa","aaa","aaa");

       Assert.assertTrue(ctrl.saveTestType());

    }

    @Test(expected = IllegalArgumentException.class)
    public void saveTestTypeInvalid() {

        TestTypeController ctrl = new TestTypeController();

        ctrl.CreateTestType("aaa","+++","aaa");

        Assert.assertTrue(ctrl.saveTestType());

    }

    @Test
    public void saveTestTypeValid() {

        TestTypeController ctrl = new TestTypeController();

        ctrl.CreateTestType("aaa","aaa","aaa");

        Assert.assertTrue(ctrl.saveTestType());

    }

    @Test
    public void getTestType() {

        TestTypeController ctrl = new TestTypeController();

        ctrl.CreateTestType("aaa","aaa","aaa");

        String expected =  " Test Code: " + "aaa"  +
                ", Description:" + "aaa" +
                ", CollectingMethod:" + "aaa";

        String actual = (ctrl.getTT());

        Assert.assertEquals(expected,actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void getTestTypeInvalid() {

        TestTypeController ctrl = new TestTypeController();

        ctrl.CreateTestType("aaa","+++","aaa");

        String expected =  " Test Code: " + "aaa"  +
                ", Description:" + "+++" +
                ", CollectingMethod:" + "aaa";
        String actual = (ctrl.getTT()).toString();

        Assert.assertEquals(expected,actual);

    }

}