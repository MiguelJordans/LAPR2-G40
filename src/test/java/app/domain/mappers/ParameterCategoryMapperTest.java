package app.domain.mappers;

import app.domain.model.ParameterCategory;
import app.mappers.ParameterCategoryMapper;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ParameterCategoryMapperTest {

    @Test
    public void toDto(){

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");

        ParameterCategoryMapper parameterCategoryMapper = new ParameterCategoryMapper();

        List<ParameterCategory> parameterCategoryList = new ArrayList<>();
        parameterCategoryList.add(pc);

        parameterCategoryMapper.toDTO(parameterCategoryList);

    }

}