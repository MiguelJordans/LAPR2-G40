package app.mappers;

import app.mappers.dto.ParameterCategoryDTO;
import app.domain.model.ParameterCategory;

import java.util.ArrayList;
import java.util.List;

public class ParameterCategoryMapper {
    private ParameterCategoryDTO toDTO(ParameterCategory cat) {
        return new ParameterCategoryDTO(cat.getCode(), cat.getNhsld(),cat.getDescription());
    }

    public List<ParameterCategoryDTO> toDTO(List<ParameterCategory> catList) {
        List<ParameterCategoryDTO> categoriesDTO = new ArrayList<>();
        for (ParameterCategory cat : catList) {
            categoriesDTO.add(this.toDTO(cat));
        }
        return categoriesDTO;
    }

}