package app.domain.mappers.dto;


import org.junit.Assert;
import org.junit.Test;


public class ParameterCategoryDTOTest {

    @Test
    public void createParameterCategoryDto(){

        ParameterCategoryDTO parameterCategoryDTO = new ParameterCategoryDTO("1111","aaaa","aaaa");

        Assert.assertNotNull(parameterCategoryDTO);

    }

    @Test
    public void getCode(){

        ParameterCategoryDTO parameterCategoryDTO = new ParameterCategoryDTO("1111","aaaa","aaaa");

        Assert.assertNotNull(parameterCategoryDTO.getCode());

    }

    @Test
    public void getName(){

        ParameterCategoryDTO parameterCategoryDTO = new ParameterCategoryDTO("1111","aaaa","aaaa");

        Assert.assertNotNull(parameterCategoryDTO.getDescription());

    }

    @Test
    public void getDescription(){

        ParameterCategoryDTO parameterCategoryDTO = new ParameterCategoryDTO("1111","aaaa","aaaa");

        Assert.assertNotNull(parameterCategoryDTO.getName());

    }

    @Test
    public void TesttoString(){

        ParameterCategoryDTO parameterCategoryDTO = new ParameterCategoryDTO("1111","aaaa","aaaa");

       String actual = parameterCategoryDTO.toString();

       String expected = "CategoryDTO{code='1111', nhsld='aaaa', description='aaaa'}";

       Assert.assertEquals(expected,actual);

    }
}