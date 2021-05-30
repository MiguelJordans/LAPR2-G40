package app.mappers;

import app.mappers.dto.TestDTO;
import app.domain.model.Test;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class TestMapper {
    private TestDTO toDTO(Test test, String name) {
        return new TestDTO(test.getTinNumber(), test.getTestID(), test.getNhsCode(),test.getState(),name);
    }

    public List<TestDTO> toDTO(List<Test> testList,String name) {
        List<TestDTO> testDTOS = new ArrayList<>();
        for (Test tr : testList) {
            testDTOS.add(this.toDTO(tr,name));
        }
        return testDTOS;
    }
}
