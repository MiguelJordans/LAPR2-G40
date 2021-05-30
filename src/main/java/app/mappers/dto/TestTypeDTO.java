package app.mappers.dto;

public class TestTypeDTO {

    private String testCode;
    private String description;
    private String collectingMethod;

    /**
     * Constructor.
     *
     * @param testCode         the test ID
     * @param description      the description
     * @param collectingMethod the collecting method
     */
    public TestTypeDTO(String testCode, String description, String collectingMethod) {
        this.testCode = testCode;
        this.collectingMethod = collectingMethod;
        this.description = description;
    }

    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the collecting method.
     *
     * @return the collecting method
     */
    public String getCollectingMethod() {
        return collectingMethod;
    }

    /**
     * Gets the test code.
     *
     * @return the test code
     */
    public String getTestCode() {
        return testCode;
    }

    /**
     * Returns the textual description of the test type in the format: test code, description, collecting method.
     *
     * @return the Test Type's characteristics
     */
    @Override
    public String toString() {
        return "TestTypeDTO{" +
                "testCode='" + testCode + '\'' +
                ", description='" + description + '\'' +
                ", collectingMethod='" + collectingMethod + '\'' +
                '}';
    }
}
