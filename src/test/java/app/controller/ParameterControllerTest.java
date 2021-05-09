package app.controller;

import app.domain.*;
import org.junit.Assert;
import org.junit.Test;

public class ParameterControllerTest {

    Company company = App.getInstance().getCompany();

    @Test
    public void createParameter() {

        ParameterController ctrl = new ParameterController();

    }

    @Test
    public void CreateParameterWithParameter() {

        ParameterController ctrl = new ParameterController(company);

    }

    @Test
    public void createValidParameter(){

        ParameterController ctrl = new ParameterController();
        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();

        ctrl.CreateParameter("aaa","aaa","aaa",pcStore);

    }

    @Test(expected = IllegalArgumentException.class)
    public void createInvalidParameter(){
        ParameterController ctrl = new ParameterController();
        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();

        ctrl.CreateParameter("aaa","+++","aaa",pcStore);
    }

    @Test
    public void saveParameter() {

        ParameterController ctrl = new ParameterController();
        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();

        ctrl.CreateParameter("aaa","aaa","aaa",pcStore);

        Assert.assertTrue(ctrl.saveParameter());

    }

    @Test(expected = IllegalArgumentException.class)
    public void saveParameterInvalid() {

        ParameterController ctrl = new ParameterController();
        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();

        ctrl.CreateParameter("aaa","+++","aaa",pcStore);

        Assert.assertTrue(ctrl.saveParameter());

    }

    @Test
    public void saveParameterValid() {

        ParameterController ctrl = new ParameterController();
        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();

        ctrl.CreateParameter("aaa","aaa","aaa",pcStore);

        Assert.assertTrue(ctrl.saveParameter());

    }

    @Test
    public void getParameter() {

        ParameterController ctrl = new ParameterController();
        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();

        ctrl.CreateParameter("aaa","aaa","aaa",pcStore);

        String expected =  " Code: " + "aaa"  +
                ", Description:" + "aaa" +
                ", Name:" + "aaa";

        String actual = (ctrl.getPP());

        Assert.assertEquals(expected,actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void getTestTypeInvalid() {

        ParameterController ctrl = new ParameterController();
        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();

        ctrl.CreateParameter("aaa","+++","aaa",pcStore);

        String expected =  " Code: " + "aaa"  +
                ", Description:" + "+++" +
                ", Name:" + "aaa";

        String actual = (ctrl.getPP());

        Assert.assertEquals(expected,actual);

    }

    @Test(expected = NullPointerException.class)
    public void getParameterList(){

        ParameterController ctrl = new ParameterController();

        ctrl.getParameterList();

    }

}