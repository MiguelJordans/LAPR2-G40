package app.domain.model;

import app.domain.stores.ParameterStore;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestTest {


    @Test
    public void createTest() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);


    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTestNHSBlank() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "", tt);


    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTestNHSTooManyChars() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "11111111111111111111111111111111111111111111111111", tt);


    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTestNHSNotValid() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "==",tt);

    }

    @Test
    public void getNHS() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);

        Assert.assertNotNull(test.getNhsCode());

    }

    @Test
    public void getParamList() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);

        Assert.assertNotNull(test.getParamList());

    }

    @Test
    public void getParamList2() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);

        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        test.createTestParameter("100000", parameters);

        try {
            test.addTestParameterResult(pp.getCode(), 1);
        } catch (Exception e) {

        }

        Assert.assertNotNull(test.getParamList());

    }

    @Test
    public void createTestParameter() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        test.createTestParameter("100000", parameters);


    }

    @Test
    public void getTestParameter() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        test.createTestParameter("100000", parameters);

        Assert.assertNotNull(test.getTpList());


    }

    @Test
    public void addTestParameterResult() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        test.createTestParameter("100000", parameters);

        try {
            test.addTestParameterResult(pp.getCode(), 1);
        } catch (Exception e) {

        }


    }

    @Test
    public void getCitizenCardNumber() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        test.createTestParameter("100000", parameters);

        Assert.assertNotNull(test.getTinNumber());

    }

    @Test
    public void isValid() { //??

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        test.createTestParameter("100000", parameters);

        Assert.assertFalse(test.isValid());

    }

    @Test
    public void validate() { //???

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        test.createTestParameter("100000", parameters);
        LocalDate date = null;

        Assert.assertTrue(test.validate(date));

    }

    @Test
    public void setState1() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        test.createTestParameter("100000", parameters);

        test.setState("CREATED");


    }

    @Test
    public void setState2() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        test.createTestParameter("100000", parameters);

        test.setState("SAMPLE_COLLECTED");


    }

    @Test
    public void setState() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        test.createTestParameter("100000", parameters);

        test.setState("SAMPLE_ANALYSED");


    }

    @Test
    public void setState3() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        test.createTestParameter("100000", parameters);

        test.setState("DIAGNOSTIC_MADE");


    }

    @Test
    public void setState4() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        test.createTestParameter("100000", parameters);

        test.setState("VALIDATED");


    }

    @Test
    public void compareState1() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        test.createTestParameter("100000", parameters);

        test.compareState("SAMPLE_ANALYSED");


    }

    @Test
    public void compareState2() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        test.createTestParameter("100000", parameters);

        test.compareState("CREATED");


    }

    @Test
    public void compareTestState1() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        test.createTestParameter("100000", parameters);

        test.compareTestState("SAMPLE_ANALYSED");


    }

    @Test
    public void compareTestState2() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        test.createTestParameter("100000", parameters);

        test.compareTestState("CREATED");


    }

    @Test
    public void compareTestState3() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        test.createTestParameter("100000", parameters);

        test.compareTestState("SAMPLE_COLLECTED");


    }

    @Test
    public void compareTestState4() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        test.createTestParameter("100000", parameters);

        test.compareTestState("DIAGNOSTIC_MADE");


    }

    @Test
    public void compareTestState5() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        test.createTestParameter("100000", parameters);

        test.compareTestState("VALIDATED");


    }

    @Test
    public void getState() {

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);
        Parameter pp = new Parameter("1abcE", "yes", "aaa", pc);

        ParameterStore parameterStore = new ParameterStore();

        TestType tt = new TestType("1abcE", "yes", "aaa", pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(pp);

        test.createTestParameter("100000", parameters);

        test.getState();


    }

}