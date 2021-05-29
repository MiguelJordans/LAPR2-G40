package app.domain.mappers.dto;

public class TestTypeDTO {

    private String testID;
    private String description;
    private String collectingMethod;

    public TestTypeDTO(String testID, String description, String collectingMethod){

        this.testID = testID;
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
        return testID;
    }

    @Override
    public String toString() {
        return "TestTypeDTO{" +
                "testCode='" + testID + '\'' +
                ", description='" + description + '\'' +
                ", collectingMethod='" + collectingMethod + '\'' +
                '}';
    }

}
