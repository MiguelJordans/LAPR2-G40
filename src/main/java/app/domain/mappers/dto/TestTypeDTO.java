package app.domain.mappers.dto;

public class TestTypeDTO {

    private String testCode;
    private String description;
    private String collectingMethod;

    public TestTypeDTO(String testCode, String description, String collectingMethod){

        this.testCode = testCode;
        this.collectingMethod = collectingMethod;
        this.description = description;

    }

    public String getDescription() {
        return description;
    }

    public String getCollectingMethod() {
        return collectingMethod;
    }

    public String getTestCode() {
        return testCode;
    }

    @Override
    public String toString() {
        return "TestTypeDTO{" +
                "testCode='" + testCode + '\'' +
                ", description='" + description + '\'' +
                ", collectingMethod='" + collectingMethod + '\'' +
                '}';
    }

}
