package app.domain.mappers.dto;

import app.domain.model.ParameterCategory;
import app.domain.model.TestType;
import app.mappers.dto.TestDTO;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestDTOTest {

    @Test
    public void createtestDTO(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        String name="";

        TestDTO testDTO = new TestDTO(test.getTinNumber(),test.getTestID(),test.getNhsCode(),test.getState(),name);

    }

    @Test
    public void getDTO(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        String name="";

        TestDTO testDTO = new TestDTO(test.getTinNumber(),test.getTestID(),test.getNhsCode(),test.getState(),name);

        Assert.assertNotNull(testDTO.getCitizenCardNumber());

    }

    @Test
    public void getNHScode(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        String name="";

        TestDTO testDTO = new TestDTO(test.getTinNumber(),test.getTestID(),test.getNhsCode(),test.getState(),name);

        Assert.assertNotNull(testDTO.getNhsCode());

    }

    @Test
    public void getTestID(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        String name="";

        TestDTO testDTO = new TestDTO(test.getTinNumber(),test.getTestID(),test.getNhsCode(),test.getState(),name);

        Assert.assertNotNull(testDTO.getTestID());

    }

    @Test
    public void getSTATE(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        String name="";

        TestDTO testDTO = new TestDTO(test.getTinNumber(),test.getTestID(),test.getNhsCode(),test.getState(),name);

        Assert.assertNotNull(testDTO.getState());

    }

    @Test
    public void setSTATE(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        String name="";

        TestDTO testDTO = new TestDTO(test.getTinNumber(),test.getTestID(),test.getNhsCode(),test.getState(),name);

       testDTO.setState("SAMPLE_COLLECTED");

    }

    @Test
    public void setSTATE2(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        String name="";

        TestDTO testDTO = new TestDTO(test.getTinNumber(),test.getTestID(),test.getNhsCode(),test.getState(),name);

        testDTO.setState("SAMPLE_ANALYSED");

    }

    @Test
    public void setSTATE3(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        String name="";

        TestDTO testDTO = new TestDTO(test.getTinNumber(),test.getTestID(),test.getNhsCode(),test.getState(),name);

        testDTO.setState("DIAGNOSTIC_MADE");

    }

    @Test
    public void setSTATE4(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        String name="";

        TestDTO testDTO = new TestDTO(test.getTinNumber(),test.getTestID(),test.getNhsCode(),test.getState(),name);

        testDTO.setState("VALIDATED");

    }

    @Test
    public void compareState(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        String name="";

        TestDTO testDTO = new TestDTO(test.getTinNumber(),test.getTestID(),test.getNhsCode(),test.getState(),name);

        testDTO.compareState("SAMPLE_ANALYSED");

    }

    @Test
    public void compareState2(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        String name="";

        TestDTO testDTO = new TestDTO(test.getTinNumber(),test.getTestID(),test.getNhsCode(),test.getState(),name);

        testDTO.compareState("");

    }

    @Test
    public void testToString(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);
        String name="";

        TestDTO testDTO = new TestDTO(test.getTinNumber(),test.getTestID(),test.getNhsCode(),test.getState(),name);

        String expected= "TestDTO{ TestID:100000000000, NhsCode:999999999999, Client name: , state:CREATED}";

        String actual=testDTO.toString();

        Assert.assertEquals(expected,actual);

    }

}