package app.controller;

import app.domain.model.Company;
import app.domain.model.TestType;
import app.domain.model.TestTypeStore;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestTypeControllerTest {

    @Test
    public void testCreateTestType() {

        TestTypeStore store = new TestTypeStore();

        TestType actual = store.CreateTestType("aaaa", "aaaa", "aaaa");

        TestType excpected = new TestType("aaaa","aaaa","aaaa");

        Assert.assertEquals(excpected,actual);

    }

    @Test
    public void testGetTT() {

        TestTypeStore  store = new TestTypeStore();

        TestType tt = new TestType("aaa","aaa","aaa");

        // String actual = getTT();


    }

    @Test
    public void testSaveTestTypeInvalid() {

        TestTypeStore  store = new TestTypeStore();
        TestType tt = new TestType("aaa","aaa","aaa");
        store.listAdd(tt);

        boolean expected = false;
        boolean actual = store.saveTestType();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testSaveTestTypeInvalid2() {

        TestTypeController ctrl = new TestTypeController();
        TestType tt = ctrl.CreateTestType("aaa","aaa","aaa");

        boolean expected = false;
        boolean actual = ctrl.saveTestType();

        Assert.assertEquals(expected,actual);

    }

}

