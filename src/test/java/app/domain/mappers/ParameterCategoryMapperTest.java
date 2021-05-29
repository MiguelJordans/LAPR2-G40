package app.domain.mappers;

import app.domain.model.ParameterCategory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

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