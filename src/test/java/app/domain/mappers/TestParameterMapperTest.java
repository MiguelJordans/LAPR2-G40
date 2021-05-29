package app.domain.mappers;

import app.domain.model.Parameter;
import app.domain.model.ParameterCategory;
import app.domain.model.TestParameter;
import app.mappers.TestParameterMapper;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestParameterMapperTest {

    @Test
    public void toDTO() {

        ParameterCategory pc = new ParameterCategory("12345", "categoria", "1212");
        Parameter param = new Parameter("ESR00", "ESR", "ESR", pc);

        TestParameter tp = new TestParameter("100000000000", param);

        List<TestParameter> tpList = new ArrayList<>();
        tpList.add(tp);

        TestParameterMapper tpm = new TestParameterMapper();

        tpm.toDTO(tpList);
    }
}