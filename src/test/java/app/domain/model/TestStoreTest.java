package app.domain.model;

import app.domain.stores.ParameterStore;
import app.domain.stores.TestStore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestStoreTest {

    @Test
    public void validateTest() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        app.domain.model.Test test = new app.domain.model.Test("1231567890123456", "100000000000", "999999999999", tt);

        TestStore testStore = new TestStore();
        testStore.createTest("1234567890123456", "100000000000", "999999999999", tt);

        testStore.validateTest(test);

    }

    @Test
    public void validateTest2() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        app.domain.model.Test test = null;

        TestStore testStore = new TestStore();
        testStore.createTest("1234567890123456", "100000000000", "999999999999", tt);

        testStore.validateTest(test);

    }

    @Test
    public void validateTest3() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        app.domain.model.Test test = new app.domain.model.Test("1234527890123456", "100000000000", "999999999999", tt);

        TestStore testStore = new TestStore();
        testStore.saveTest(test);
        testStore.createTest("1234567890123456", "100000000000", "999999999999", tt);

        testStore.validateTest(test);


    }

    @Test
    public void validateTest4() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        app.domain.model.Test test = new app.domain.model.Test("1234527890123456", "100000000000", "999999999999", tt);

        TestStore testStore = new TestStore();
        testStore.saveTest(test);
        testStore.saveTest(test);
        testStore.createTest("1234567890123456", "100000000000", "999999999999", tt);

        testStore.validateTest(test);


    }

    @Test
    public void generateTestID() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        app.domain.model.Test test = new app.domain.model.Test("1234527890123456", "100000000000", "999999999999", tt);

        TestStore testStore = new TestStore();
        testStore.createTest("1234567890123456", "100000000000", "999999999999", tt);

        testStore.validateTest(test);

        testStore.generateTestID();


    }

    @Test
    public void validateNhsCode() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        app.domain.model.Test test = new app.domain.model.Test("1234527890123456", "100000000000", "999999999999", tt);

        TestStore testStore = new TestStore();
        testStore.createTest("1234567890123456", "100000000000", "999999999999", tt);

        testStore.validateNhsCode(test.getNhsCode());

        testStore.generateTestID();


    }

    @Test
    public void validateNhsCode2() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        app.domain.model.Test test = new app.domain.model.Test("1234527890123456", "100000000000", "999999999999", tt);

        TestStore testStore = new TestStore();
        testStore.createTest("1234567890123456", "100000000000", "999999999999", tt);

        testStore.saveTest(test);

        testStore.validateNhsCode(test.getNhsCode());

        testStore.generateTestID();


    }

    @Test
    public void getInvalidTestList() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        app.domain.model.Test test = new app.domain.model.Test("1234527890123456", "100000000000", "999999999999", tt);

        TestStore testStore = new TestStore();
        testStore.createTest("1234567890123456", "100000000000", "999999999999", tt);

        testStore.saveTest(test);

        testStore.getInvalidTestList();


    }

    @Test
    public void getTestList() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        app.domain.model.Test test = new app.domain.model.Test("1234527890123456", "100000000000", "999999999999", tt);

        TestStore testStore = new TestStore();
        testStore.createTest("1234567890123456", "100000000000", "999999999999", tt);

        testStore.saveTest(test);

        testStore.getTestList();

    }

    @Test
    public void saveTest() {
    }

}