package app.domain.stores;

import app.domain.model.Parameter;
import app.domain.model.ParameterCategory;
import app.domain.stores.ParameterStore;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ParameterStoreTest {

    @Test
    public void createParameter() {

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        ParameterStore ppStore = new ParameterStore();

        Parameter aa = ppStore.createParameter("AAA", "aaa", "aaa",pc);

    }

    @Test
    public void validateParameter1() {

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        ParameterStore ppStore = new ParameterStore();

        Parameter aa = ppStore.createParameter("AAA", "aaa", "aaa",pc);

        boolean expected = true;

        boolean actual = ppStore.validateParameter(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void validateParameter2() {

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        ParameterStore ppStore = new ParameterStore();

        Parameter aa = ppStore.createParameter("AAA", "aaa", "aaa",pc);
        ppStore.listAdd(aa);

        boolean expected = false;

        boolean actual = ppStore.validateParameter(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void listContainParameter1() {

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        ParameterStore ppStore = new ParameterStore();

        Parameter aa = ppStore.createParameter("AAA", "aaa", "aaa",pc);
        ppStore.listAdd(aa);

        boolean expected = true;

        boolean actual = ppStore.listContain(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void listContainParameter2() {

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        ParameterStore ppStore = new ParameterStore();

        Parameter aa = ppStore.createParameter("AAA", "aaa", "aaa",pc);

        boolean expected = false;

        boolean actual = ppStore.listContain(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void saveParameter1() {

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        ParameterStore ppStore = new ParameterStore();

        Parameter aa = ppStore.createParameter("AAA", "aaa", "aaa",pc);

        boolean expected = true;

        boolean actual = ppStore.saveParameter();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void saveParameter2() {

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        ParameterStore ppStore = new ParameterStore();

        Parameter aa = ppStore.createParameter("AAA", "aaa", "aaa",pc);
        ppStore.listAdd(aa);

        boolean expected = false;

        boolean actual = ppStore.saveParameter();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void listAddParameter1() {
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        ParameterStore ppStore = new ParameterStore();

        Parameter aa = ppStore.createParameter("AAA", "aaa", "aaa",pc);

        boolean expected = true;

        boolean actual = ppStore.listAdd(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void listAddParameter2() {

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        ParameterStore ppStore = new ParameterStore();

        Parameter aa = ppStore.createParameter("AAA", "aaa", "aaa",pc);
        ppStore.listAdd(aa);

        boolean expected = true;

        boolean actual = ppStore.listAdd(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getParameter1() {

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        ParameterStore ppStore = new ParameterStore();

        Parameter aa = ppStore.createParameter("AAA", "aaa", "aaa",pc);
        ppStore.listAdd(aa);

        Parameter expected = aa;

        Parameter actual = ppStore.getParameter(0);

        assertEquals(expected, actual);

    }

    @Test
    public void getPP() {

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        ParameterStore ppStore = new ParameterStore();

        Parameter aa = ppStore.createParameter("AAA", "aaa", "aaa",pc);

        Parameter expected = aa;

        Parameter actual = ppStore.getPp();

        assertEquals(expected, actual);

    }

    @Test
    public void getParameterList(){

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        ParameterStore ppStore = new ParameterStore();

        Parameter aa = ppStore.createParameter("AAA", "aaa", "aaa",pc);
        ppStore.saveParameter();

       List<Parameter> parameterList = ppStore.getParameterList();

       Assert.assertNotNull(parameterList);

    }

}
