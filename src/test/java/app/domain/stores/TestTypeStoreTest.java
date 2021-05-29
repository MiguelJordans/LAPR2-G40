package app.domain.stores;

import app.domain.model.ParameterCategory;
import app.domain.model.TestType;
import app.domain.stores.TestTypeStore;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestTypeStoreTest {

    @Test
    public void createTestType() {

        TestTypeStore tt = new TestTypeStore();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType aa = tt.createTestType("AAA","aaa","aaa",pcList);

    }

    @Test
    public void validateTestType1() {

        TestTypeStore tt = new TestTypeStore();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType aa = tt.createTestType("AAA","aaa","aaa",pcList);

        boolean expected = true;

        boolean actual = tt.validateTestType(aa);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void validateTestType2() {

        TestTypeStore tt = new TestTypeStore();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType aa = tt.createTestType("aaa","aaa","aaa",pcList);
        tt.listAdd(aa);

        boolean expected = false;

        boolean actual = tt.validateTestType(aa);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void listContain1() {

        TestTypeStore tt = new TestTypeStore();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType aa = tt.createTestType("aaa","aaa","aaa",pcList);
        tt.listAdd(aa);

        boolean expected = true;

        boolean actual = tt.listContain(aa);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void listContain2() {

        TestTypeStore tt = new TestTypeStore();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType aa = tt.createTestType("aaa","aaa","aaa",pcList);

        boolean expected = false;

        boolean actual = tt.listContain(aa);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void saveTestType1() {

        TestTypeStore tt = new TestTypeStore();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType aa = tt.createTestType("aaa","aaa","aaa",pcList);

        boolean expected = true;

        boolean actual = tt.saveTestType();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void saveTestType2() {

        TestTypeStore tt = new TestTypeStore();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType aa = tt.createTestType("aaa","aaa","aaa",pcList);
        tt.listAdd(aa);

        boolean expected = false;

        boolean actual = tt.saveTestType();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void listAdd1() {
        TestTypeStore tt = new TestTypeStore();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType aa = tt.createTestType("aaa","aaa","aaa",pcList);

        boolean expected = true;

        boolean actual = tt.listAdd(aa);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void listAdd2() {

        TestTypeStore tt = new TestTypeStore();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType aa = tt.createTestType("aaa","aaa","aaa",pcList);
        tt.listAdd(aa);

        boolean expected = true;

        boolean actual = tt.listAdd(aa);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getTestType1() {

        TestTypeStore tt = new TestTypeStore();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType aa = tt.createTestType("aaa","aaa","aaa",pcList);
        tt.listAdd(aa);

        TestType expected = tt.getTestType(0);

        TestType actual = tt.getTestType(0);

        assertEquals(expected,actual);

    }

    @Test
    public void getTt() {

        TestTypeStore tt = new TestTypeStore();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);
        TestType aa = tt.createTestType("aaa","aaa","aaa",pcList);

        TestType expected = aa;

        TestType actual = tt.getTt();

        assertEquals(expected,actual);

    }

}