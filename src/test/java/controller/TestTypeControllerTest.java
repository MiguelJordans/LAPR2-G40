package app.controller;

import app.domain.model.TestType;
import app.domain.model.TestTypeStore;
import junit.framework.TestCase;
import org.junit.Assert;

public class TestTypeControllerTest extends TestCase {

    public void testCreateTestType() {

        TestTypeStore  store = new TestTypeStore();

        TestType actual = store.CreateTestType("aaaa", "aaaa", "aaaa");

        TestType excpected = new TestType("aaaa","aaaa","aaaa");

        Assert.assertEquals(excpected,actual);

    }

    public void testGetTT() {

        TestTypeStore  store = new TestTypeStore();

        TestType tt = new TestType("aaa","aaa","aaa");

        String actual = getTT();


    }

    public void testSaveTestType() {
    }
}