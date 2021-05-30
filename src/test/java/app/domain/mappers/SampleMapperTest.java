package app.domain.mappers;

import app.domain.model.ParameterCategory;
import app.domain.model.Sample;
import app.domain.model.TestType;
import app.mappers.SampleMapper;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class SampleMapperTest {

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    String date = dtf.format(now);

    @Test
    public void toDTO(){

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        Sample sm1 = new Sample(test, "11111111111",date);
        List<Sample> sampleList = new ArrayList<>();

        sampleList.add(sm1);

        SampleMapper sampleMapper = new SampleMapper();

        sampleMapper.toDTO(sampleList);

    }

}