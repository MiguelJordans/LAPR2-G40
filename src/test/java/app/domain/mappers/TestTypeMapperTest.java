package app.domain.mappers;

import app.domain.model.ParameterCategory;
import app.domain.model.TestType;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestTypeMapperTest {

    @Test
    public void toDto(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        List<TestType> testTypeList = new ArrayList<>();
        testTypeList.add(tt);

        TestTypeMapper testTypeMapper = new TestTypeMapper();

        testTypeMapper.toDTO(testTypeList);

    }

}