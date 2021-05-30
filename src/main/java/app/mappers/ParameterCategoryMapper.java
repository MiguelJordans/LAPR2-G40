package app.mappers;

import app.mappers.dto.ParameterCategoryDTO;
import app.domain.model.ParameterCategory;

import java.util.ArrayList;
import java.util.List;

public class ParameterCategoryMapper {

    /**
     * Transforms Parameter Category into DTO.
     *
     * @param cat the parameter category
     * @return Parameter Category (DTO)
     */
    private ParameterCategoryDTO toDTO(ParameterCategory cat) {
        return new ParameterCategoryDTO(cat.getCode(), cat.getNhsld(), cat.getDescription());
    }

    /**
     * Transforms Parameter Category list into DTO.
     *
     * @param catList the parameter category list
     * @return Parameter Category list (DTO)
     */
    public List<ParameterCategoryDTO> toDTO(List<ParameterCategory> catList) {
        List<ParameterCategoryDTO> categoriesDTO = new ArrayList<>();
        for (ParameterCategory cat : catList) {
            categoriesDTO.add(this.toDTO(cat));
        }
        return categoriesDTO;
    }
}