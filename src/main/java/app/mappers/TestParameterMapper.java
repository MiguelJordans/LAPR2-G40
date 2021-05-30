package app.mappers;

import app.mappers.dto.TestParameterDTO;
import app.domain.model.TestParameter;

import java.util.ArrayList;
import java.util.List;

public class TestParameterMapper {

    /**
     * Transforms Test Parameter into DTO.
     *
     * @param tp the test parameter
     * @return Test Parameter (DTO)
     */
    private TestParameterDTO toDTO(TestParameter tp) {
        return new TestParameterDTO(tp.getTestID(), tp.getParam());
    }

    /**
     * Transforms Test Parameter list into DTO.
     *
     * @param tpList the test parameter list
     * @return Test list (DTO)
     */
    public List<TestParameterDTO> toDTO(List<TestParameter> tpList) {
        List<TestParameterDTO> tpListDto = new ArrayList<>();
        for (TestParameter tp : tpList) {
            tpListDto.add(this.toDTO(tp));
        }
        return tpListDto;
    }
}
