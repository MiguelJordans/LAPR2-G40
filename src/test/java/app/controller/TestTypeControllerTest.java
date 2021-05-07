package app.controller;

<<<<<<< HEAD
import app.domain.model.Company;
import app.domain.model.TestType;
import app.domain.model.TestTypeStore;
=======
import app.domain.TestType;
import app.domain.TestTypeStore;
>>>>>>> 30bae8652689aa30cfa5c2f6b6037606cd57c869
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

