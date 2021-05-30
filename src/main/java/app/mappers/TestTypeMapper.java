package app.mappers;

import app.mappers.dto.TestTypeDTO;
import app.domain.model.TestType;

import java.util.ArrayList;
import java.util.List;

public class TestTypeMapper {

    /**
     * Transforms Test Type into DTO.
     *
     * @param tt the test type
     * @return Test Type (DTO)
     */
    private TestTypeDTO toDTO(TestType tt) {
        return new TestTypeDTO(tt.getTestCode(), tt.getDescription(), tt.getCollectingMethod());
    }

    /**
     * Transforms Test Type list into DTO.
     *
     * @param ttList the test type list
     * @return Test Type list (DTO)
     */
    public List<TestTypeDTO> toDTO(List<TestType> ttList) {
        List<TestTypeDTO> ttsDTO = new ArrayList<>();
        for (TestType tt : ttList) {
            ttsDTO.add(this.toDTO(tt));
        }
        return ttsDTO;
    }
}