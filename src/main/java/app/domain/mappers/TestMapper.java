package app.domain.mappers;

import app.domain.mappers.dto.TestDTO;
import app.domain.model.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMapper {
    private TestDTO toDTO(Test test) {
        return new TestDTO(test.getCitizenCardNumber(), test.getTestID(), test.getNhsCode(),test.getState());
    }

    public List<TestDTO> toDTO(List<Test> testList) {
        List<TestDTO> testDTOS = new ArrayList<>();
        for (Test tr : testList) {
            testDTOS.add(this.toDTO(tr));
        }
        return testDTOS;
    }
}
