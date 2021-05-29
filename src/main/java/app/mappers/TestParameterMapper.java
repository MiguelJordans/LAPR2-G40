package app.mappers;

import app.mappers.dto.TestParameterDTO;
import app.domain.model.TestParameter;

import java.util.ArrayList;
import java.util.List;

public class TestParameterMapper {

    private TestParameterDTO toDTO(TestParameter tp) {
        return new TestParameterDTO(tp.getTestID(), tp.getParam());
    }

    public List<TestParameterDTO> toDTO(List<TestParameter> tpList) {
        List<TestParameterDTO> tpListDto = new ArrayList<>();
        for (TestParameter tp : tpList) {
            tpListDto.add(this.toDTO(tp));
        }
        return tpListDto;
    }
}
