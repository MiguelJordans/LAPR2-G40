package app.mappers;

import app.mappers.dto.SampleDTO;
import app.domain.model.Sample;

import java.util.ArrayList;
import java.util.List;

public class SampleMapper {
    private SampleDTO toDTO(Sample sm) {
        return new SampleDTO(sm.getTr(),sm.getBarcode(),sm.getDate());
    }

    public List<SampleDTO> toDTO(List<Sample> sampleList) {
        List<SampleDTO> smListDto = new ArrayList<>();
        for (Sample sm : sampleList) {
            smListDto.add(this.toDTO(sm));
        }
        return smListDto;
    }
}
