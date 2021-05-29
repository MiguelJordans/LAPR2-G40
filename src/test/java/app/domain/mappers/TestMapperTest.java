package app.domain.mappers;

import app.domain.model.ParameterCategory;
import app.domain.model.TestType;
import app.mappers.TestMapper;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMapperTest {

    @Test
    public void testMapper(){

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);
        List<app.domain.model.Test> testList = new ArrayList<>();
        testList.add(test);

        TestMapper testMapper = new TestMapper();

        testMapper.toDTO(testList);

    }

}