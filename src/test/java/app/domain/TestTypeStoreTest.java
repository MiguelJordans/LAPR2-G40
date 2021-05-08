package app.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestTypeStoreTest {

    @Test
    public void createTestType() {

        TestTypeStore tt = new TestTypeStore();
        ParameterCategoryStore pcStore = new ParameterCategoryStore();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();
        TestType aa = tt.CreateTestType("AAA","aaa","aaa",pcStore);

    }

    @Test
    public void validateTestType1() {

        TestTypeStore tt = new TestTypeStore();
        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();
        TestType aa = tt.CreateTestType("AAA","aaa","aaa",pcStore);

        boolean expected = true;

        boolean actual = tt.validateTestType(aa);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void validateTestType2() {

        TestTypeStore tt = new TestTypeStore();
        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();
        TestType aa = tt.CreateTestType("aaa","aaa","aaa",pcStore);
        tt.listAdd(aa);

        boolean expected = false;

        boolean actual = tt.validateTestType(aa);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void listContain1() {

        TestTypeStore tt = new TestTypeStore();
        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();
        TestType aa = tt.CreateTestType("aaa","aaa","aaa",pcStore);
        tt.listAdd(aa);

        boolean expected = true;

        boolean actual = tt.listContain(aa);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void listContain2() {

        TestTypeStore tt = new TestTypeStore();
        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();
        TestType aa = tt.CreateTestType("aaa","aaa","aaa",pcStore);

        boolean expected = false;

        boolean actual = tt.listContain(aa);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void saveTestType1() {

        TestTypeStore tt = new TestTypeStore();
        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();
        TestType aa = tt.CreateTestType("aaa","aaa","aaa",pcStore);

        boolean expected = true;

        boolean actual = tt.saveTestType();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void saveTestType2() {

        TestTypeStore tt = new TestTypeStore();
        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();
        TestType aa = tt.CreateTestType("aaa","aaa","aaa",pcStore);
        tt.listAdd(aa);

        boolean expected = false;

        boolean actual = tt.saveTestType();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void listAdd1() {
        TestTypeStore tt = new TestTypeStore();
        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();
        TestType aa = tt.CreateTestType("aaa","aaa","aaa",pcStore);

        boolean expected = true;

        boolean actual = tt.listAdd(aa);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void listAdd2() {

        TestTypeStore tt = new TestTypeStore();
        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();
        TestType aa = tt.CreateTestType("aaa","aaa","aaa",pcStore);
        tt.listAdd(aa);

        boolean expected = true;

        boolean actual = tt.listAdd(aa);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getTestType1() {

        TestTypeStore tt = new TestTypeStore();
        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();
        TestType aa = tt.CreateTestType("aaa","aaa","aaa",pcStore);
        tt.listAdd(aa);

        TestType expected = tt.getTestType(0);

        TestType actual = tt.getTestType(0);

        assertEquals(expected,actual);

    }

    @Test
    public void getTt() {

        TestTypeStore tt = new TestTypeStore();
        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();
        TestType aa = tt.CreateTestType("aaa","aaa","aaa",pcStore);

        TestType expected = aa;

        TestType actual = tt.getTt();

        assertEquals(expected,actual);

    }

}