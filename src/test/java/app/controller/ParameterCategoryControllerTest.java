package app.controller;

import app.domain.Company;
import org.junit.Assert;
import org.junit.Test;

public class ParameterCategoryControllerTest {

    Company company = App.getInstance().getCompany();

    @Test
    public void createParameter() {

        ParameterCategoryController ctrl = new ParameterCategoryController();

    }

    @Test
    public void CreateParameterWithParameterCategory() {

        ParameterCategoryController ctrl = new ParameterCategoryController(company);
    }

    @Test
    public void createValidParameterCategory(){

        ParameterCategoryController ctrl = new ParameterCategoryController();
        ctrl.CreateParameterCategory("aaa","aaaaa","aaa");

    }

    @Test(expected = IllegalArgumentException.class)
    public void createInvalidParameterCategory(){
        ParameterCategoryController ctrl = new ParameterCategoryController();
        ctrl.CreateParameterCategory("aaa","aaaaaaaaaaaa","aaa");
    }

    @Test
    public void saveParameterCategory() {

        ParameterCategoryController ctrl = new ParameterCategoryController();
        ctrl.CreateParameterCategory("aaa","aaaaa","aaa");

        Assert.assertTrue(ctrl.saveParameterCategory());

    }

    @Test(expected = IllegalArgumentException.class)
    public void saveParameterCategoryInvalid() {

        ParameterCategoryController ctrl = new ParameterCategoryController();
        ctrl.CreateParameterCategory("aaa","aaaaaaaaaaaaaaaaaaaa","aaa");

        Assert.assertTrue(ctrl.saveParameterCategory());

    }

    @Test
    public void saveParameterCategoryValid() {

        ParameterCategoryController ctrl = new ParameterCategoryController();
        ctrl.CreateParameterCategory("aaa","aaaaa","aaa");

        Assert.assertTrue(ctrl.saveParameterCategory());

    }

    @Test
    public void getParameterCategory() {

        ParameterCategoryController ctrl = new ParameterCategoryController();
        ctrl.CreateParameterCategory("aaa","aaaaa","aaa");

        String expected =  " Code: " + "aaaaa"  +
                ", Description:" + "aaa" +
                ", NHSLD:" + "aaa";

        String actual = (ctrl.getPC());

        Assert.assertEquals(expected,actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void getParameterCategoryInvalid() {

        ParameterCategoryController ctrl = new ParameterCategoryController();
        ctrl.CreateParameterCategory("aaa","aa1231231231231a","aaa");

        String expected =  " Code: " + "aaa"  +
                ", Description:" + "aa1231231231231a" +
                ", Name:" + "aaa";

        String actual = (ctrl.getPC());

        Assert.assertEquals(expected,actual);

    }

    @Test(expected = NullPointerException.class)
    public void getParameterCategoryList(){

        ParameterCategoryController ctrl = new ParameterCategoryController();

        ctrl.getParameterList();

    }

}