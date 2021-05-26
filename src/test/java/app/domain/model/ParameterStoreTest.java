package app.domain.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ParameterStoreTest {

    @Test
    public void createParameter() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        ParameterStore pcStore = new ParameterStore();

        Parameter aa = pcStore.CreateParameter("AAA", "aaa", "aaa",pcList);

    }

    @Test
    public void validateParameter1() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        ParameterStore pp = new ParameterStore();

        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa",pcList);

        boolean expected = true;

        boolean actual = pp.validateParameter(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void validateParameter2() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        ParameterStore pp = new ParameterStore();

        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa",pcList);
        pp.listAdd(aa);

        boolean expected = false;

        boolean actual = pp.validateParameter(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void listContainParameter1() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        ParameterStore pp = new ParameterStore();

        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa",pcList);
        pp.listAdd(aa);

        boolean expected = true;

        boolean actual = pp.listContain(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void listContainParameter2() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        ParameterStore pp = new ParameterStore();

        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa",pcList);

        boolean expected = false;

        boolean actual = pp.listContain(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void saveParameter1() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        ParameterStore pp = new ParameterStore();

        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa",pcList);

        boolean expected = true;

        boolean actual = pp.saveParameter();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void saveParameter2() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        ParameterStore pp = new ParameterStore();

        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa",pcList);
        pp.listAdd(aa);

        boolean expected = false;

        boolean actual = pp.saveParameter();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void listAddParameter1() {
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        ParameterStore pp = new ParameterStore();

        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa",pcList);

        boolean expected = true;

        boolean actual = pp.listAdd(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void listAddParameter2() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        ParameterStore pp = new ParameterStore();

        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa",pcList);
        pp.listAdd(aa);

        boolean expected = true;

        boolean actual = pp.listAdd(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getParameter1() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        ParameterStore pp = new ParameterStore();

        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa",pcList);
        pp.listAdd(aa);

        Parameter expected = aa;

        Parameter actual = pp.getParameter(0);

        assertEquals(expected, actual);

    }

    @Test
    public void getPP() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        ParameterStore pp = new ParameterStore();

        Parameter aa = pp.CreateParameter("AAA", "aaa", "aaa",pcList);

        Parameter expected = aa;

        Parameter actual = pp.getPp();

        assertEquals(expected, actual);

    }

    @Test
    public void getParameterList(){

        ParameterStore pp = new ParameterStore();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        pp.getParameterList();

    }

}
