package app.domain.mappers;

import app.domain.mappers.dto.TestTypeDTO;
import app.domain.model.TestType;

import java.util.ArrayList;
import java.util.List;

public class TestTypeMapper {
    private TestTypeDTO toDTO(TestType tt) {
        return new TestTypeDTO(tt.getTestCode(),tt.getDescription(),tt.getCollectingMethod());
    }

    public List<TestTypeDTO> toDTO(List<TestType> ttList) {
        List<TestTypeDTO> ttsDTO = new ArrayList<>();
        for (TestType tt : ttList) {
            ttsDTO.add(this.toDTO(tt));
        }
        return ttsDTO;
    }

}