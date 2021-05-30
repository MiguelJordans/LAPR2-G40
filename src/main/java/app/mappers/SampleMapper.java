package app.mappers;

import app.mappers.dto.SampleDTO;
import app.domain.model.Sample;

import java.util.ArrayList;
import java.util.List;

public class SampleMapper {

    /**
     * Transforms Sample into DTO.
     *
     * @param sm the sample
     * @return Sample (DTO)
     */
    private SampleDTO toDTO(Sample sm) {
        return new SampleDTO(sm.getTr(), sm.getBarcode(), sm.getDate());
    }

    /**
     * Transforms Sample list into DTO.
     *
     * @param sampleList the sample list
     * @return Sample list (DTO)
     */
    public List<SampleDTO> toDTO(List<Sample> sampleList) {
        List<SampleDTO> smListDto = new ArrayList<>();
        for (Sample sm : sampleList) {
            smListDto.add(this.toDTO(sm));
        }
        return smListDto;
    }
}
