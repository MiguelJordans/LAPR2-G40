package app.mappers.dto;

public class ParameterCategoryDTO {

    private String code;
    private String nhsld;
    private String description;

    /**
     * Constructor.
     * @param code the code
     * @param name the name
     * @param description the description
     */
    public ParameterCategoryDTO(String code, String name, String description) {
        this.code = code;
        this.nhsld = name;
        this.description = description;
    }

    /**
     * Gets the code.
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Gets the name.
     * @return the name
     */
    public String getName() {
        return nhsld;
    }

    /**
     * Gets the description.
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the textual description of the parameter category in the format: code, NHS ID, description.
     * @return the Parameter Category's characteristics
     */
    @Override
    public String toString() {
        return "CategoryDTO{" +
                "code='" + code + '\'' +
                ", nhsld='" + nhsld + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}