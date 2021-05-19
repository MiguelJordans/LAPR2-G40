package app.domain.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParameterStoreTest {

    @Test
    public void createParameter() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        ParameterStore pcStore = new ParameterStore();

        Parameter aa = pcStore.CreateParameter("AAA", "aaa", "aaa",parameterCategoryStore);

    }

    @Test
    public void validateParameter1() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        ParameterStore pp = new ParameterStore();

        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa",parameterCategoryStore);

        boolean expected = true;

        boolean actual = pp.validateParameter(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void validateParameter2() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        ParameterStore pp = new ParameterStore();

        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa",parameterCategoryStore);
        pp.listAdd(aa);

        boolean expected = false;

        boolean actual = pp.validateParameter(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void listContainParameter1() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        ParameterStore pp = new ParameterStore();

        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa",parameterCategoryStore);
        pp.listAdd(aa);

        boolean expected = true;

        boolean actual = pp.listContain(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void listContainParameter2() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        ParameterStore pp = new ParameterStore();

        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa",parameterCategoryStore);

        boolean expected = false;

        boolean actual = pp.listContain(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void saveParameter1() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        ParameterStore pp = new ParameterStore();

        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa",parameterCategoryStore);

        boolean expected = true;

        boolean actual = pp.saveParameter();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void saveParameter2() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        ParameterStore pp = new ParameterStore();

        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa",parameterCategoryStore);
        pp.listAdd(aa);

        boolean expected = false;

        boolean actual = pp.saveParameter();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void listAddParameter1() {
        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        ParameterStore pp = new ParameterStore();

        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa",parameterCategoryStore);

        boolean expected = true;

        boolean actual = pp.listAdd(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void listAddParameter2() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        ParameterStore pp = new ParameterStore();

        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa",parameterCategoryStore);
        pp.listAdd(aa);

        boolean expected = true;

        boolean actual = pp.listAdd(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getParameter1() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        ParameterStore pp = new ParameterStore();

        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa",parameterCategoryStore);
        pp.listAdd(aa);

        Parameter expected = aa;

        Parameter actual = pp.getParameter(0);

        assertEquals(expected, actual);

    }

    @Test
    public void getPP() {

        ParameterCategoryStore  parameterCategoryStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        parameterCategoryStore.listAdd();

        ParameterStore pp = new ParameterStore();

        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa",parameterCategoryStore);

        Parameter expected = aa;

        Parameter actual = pp.getPp();

        assertEquals(expected, actual);

    }

    @Test
    public void getParameterList(){

        ParameterStore pp = new ParameterStore();
        ParameterCategoryStore pcStore = new ParameterCategoryStore();

        pp.getParameterList();

    }

}
