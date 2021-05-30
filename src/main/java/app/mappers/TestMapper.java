package app.mappers;

import app.mappers.dto.TestDTO;
import app.domain.model.Test;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class TestMapper {

    /**
     * Transforms Parameter Category into DTO.
     *
     * @param test the test
     * @param name the name
     * @return Test (DTO)
     */
    private TestDTO toDTO(Test test, String name) {
        return new TestDTO(test.getTinNumber(), test.getTestID(), test.getNhsCode(), test.getState(), name);
    }

    /**
     * Transforms Test list into DTO.
     *
     * @param testList the test list
     * @param name     the name
     * @return Test list (DTO)
     */
    public List<TestDTO> toDTO(List<Test> testList, String name) {
        List<TestDTO> testDTOS = new ArrayList<>();
        for (Test tr : testList) {
            testDTOS.add(this.toDTO(tr, name));
        }
        return testDTOS;
    }
}
