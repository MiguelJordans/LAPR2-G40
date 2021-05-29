package app.domain.mappers.dto;


import app.domain.model.ParameterCategory;
import app.domain.model.TestType;
import app.mappers.dto.SampleDTO;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class SampleDTOTest {

    @Test
    public void createSampleDto(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);

        SampleDTO sampleDTO = new SampleDTO(test,"12345678901");

        Assert.assertNotNull(sampleDTO);

    }

    @Test
    public void getBarcode(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);

        SampleDTO sampleDTO = new SampleDTO(test,"12345678901");



        Assert.assertNotNull(sampleDTO.getBarcode());

    }

    @Test
    public void getTR(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);

        SampleDTO sampleDTO = new SampleDTO(test,"12345678901");



        Assert.assertNotNull(sampleDTO.getTr());

    }


    @Test
    public void TesttoString(){

        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa", "aaa", "aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);

        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", tt);

        SampleDTO sampleDTO = new SampleDTO(test,"12345678901");

        String expected = "SampleDTO{tr=Test{citizenCardNumber='1234567890123456', testID='100000000000', nhsCode='999999999999', tt= Test Code: 1abcE, Description:yes, CollectingMethod:aaa, state=CREATED, tpList=[]}, barcode='12345678901'}";

        String actual = sampleDTO.toString();

        Assert.assertEquals(expected,actual);

    }
}