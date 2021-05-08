package app.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParameterStoreTest {

    @Test
    public void createParameter() {

        ParameterStore pp = new ParameterStore();
        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa");

    }

    @Test
    public void validateParameter1() {

        ParameterStore pp = new ParameterStore();
        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa");

        boolean expected = true;

        boolean actual = pp.validateParameter(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void validateParameter2() {

        ParameterStore pp = new ParameterStore();
        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa");
        pp.listAdd(aa);

        boolean expected = false;

        boolean actual = pp.validateParameter(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void listContainParameter1() {

        ParameterStore pp = new ParameterStore();
        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa");
        pp.listAdd(aa);

        boolean expected = true;

        boolean actual = pp.listContain(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void listContainParameter2() {

        ParameterStore pp = new ParameterStore();
        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa");

        boolean expected = false;

        boolean actual = pp.listContain(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void saveParameter1() {

        ParameterStore pp = new ParameterStore();
        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa");

        boolean expected = true;

        boolean actual = pp.saveParameter();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void saveParameter2() {

        ParameterStore pp = new ParameterStore();
        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa");
        pp.listAdd(aa);

        boolean expected = false;

        boolean actual = pp.saveParameter();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void listAddParameter1() {
        ParameterStore pp = new ParameterStore();
        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa");

        boolean expected = true;

        boolean actual = pp.listAdd(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void listAddParameter2() {

        ParameterStore pp = new ParameterStore();
        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa");
        pp.listAdd(aa);

        boolean expected = true;

        boolean actual = pp.listAdd(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getParameter1() {

        ParameterStore pp = new ParameterStore();
        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa");
        pp.listAdd(aa);

        Parameter expected = aa;

        Parameter actual = pp.getParameter(0);

        assertEquals(expected, actual);

    }

    @Test
    public void getPP() {

        ParameterStore pp = new ParameterStore();
        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa");

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
