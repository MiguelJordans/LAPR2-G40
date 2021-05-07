package app.controller;

import app.domain.TestType;
import app.domain.TestTypeStore;
import org.junit.Assert;
import org.junit.Test;

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
    public void testSaveTestType() {
    }
}

