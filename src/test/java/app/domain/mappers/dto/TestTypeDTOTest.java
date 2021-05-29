package app.domain.mappers.dto;

import app.domain.model.Parameter;
import app.domain.model.ParameterCategory;
import app.domain.model.TestType;
import app.domain.stores.ParameterStore;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class TestTypeDTOTest {

    @Test
    public void createTestTypeDTO(){


        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestTypeDTO testTypeDTO = new TestTypeDTO("aaa","aaaa","aaa");

        Assert.assertNotNull(testTypeDTO);

    }

    @Test
    public void getDescription(){


        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestTypeDTO testTypeDTO = new TestTypeDTO("aaa","aaaa","aaa");

        Assert.assertNotNull(testTypeDTO.getDescription());

    }

    @Test
    public void getCollectingMethod(){


        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestTypeDTO testTypeDTO = new TestTypeDTO("aaa","aaaa","aaa");

        Assert.assertNotNull(testTypeDTO.getCollectingMethod());

    }

    @Test
    public void getTestCode(){


        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestTypeDTO testTypeDTO = new TestTypeDTO("aaa","aaaa","aaa");

        Assert.assertNotNull(testTypeDTO.getTestCode());

    }

    @Test
    public void TestToString(){


        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestTypeDTO testTypeDTO = new TestTypeDTO("aaa","aaaa","aaa");

        String actual = testTypeDTO.toString();

        String expected = "TestTypeDTO{testCode='aaa', description='aaaa', collectingMethod='aaa'}";

        Assert.assertEquals(expected,actual);

    }

}