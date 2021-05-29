package app.domain.mappers.dto;

import app.domain.model.Parameter;
import app.domain.model.ParameterCategory;
import app.domain.model.TestParameterResult;
import app.mappers.dto.TestParameterDTO;
import org.junit.Assert;
import org.junit.Test;

public class TestParameterDTOTest {

    @Test
    public void getTestID() {

        ParameterCategory pc = new ParameterCategory("12345", "categoria", "1212");
        Parameter param = new Parameter("ESR00", "ESR", "ESR", pc);

        TestParameterDTO tpDTO = new TestParameterDTO("100000000000", param);

        String expected = "100000000000";
        String actual = tpDTO.getTestID();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getParam() {

        ParameterCategory pc = new ParameterCategory("12345", "categoria", "1212");
        Parameter param = new Parameter("ESR00", "ESR", "ESR", pc);

        TestParameterDTO tpDTO = new TestParameterDTO("100000000000", param);

        Parameter actual = tpDTO.getParam();

        Assert.assertEquals(param, actual);

    }

    @Test
    public void getTpr() {

        ParameterCategory pc = new ParameterCategory("12345", "categoria", "1212");
        Parameter param = new Parameter("ESR00", "ESR", "ESR", pc);

        TestParameterDTO tpDTO = new TestParameterDTO("100000000000", param);

        TestParameterResult actual = tpDTO.getTpr();

        Assert.assertNull(actual);

    }

    @Test
    public void testToString() {

        ParameterCategory pc = new ParameterCategory("12345", "categoria", "1212");
        Parameter param = new Parameter("ESR00", "ESR", "ESR", pc);

        TestParameterDTO tpDTO = new TestParameterDTO("100000000000", param);

        String actual = tpDTO.toString();

        String expected = "TestParameterDTO{testID='100000000000', param=' Code: ESR00, Description:ESR, Name:ESR', tpr='null'}";

        Assert.assertEquals(actual, expected);

    }
}