package app.domain.mappers.dto;

public class ParameterCategoryDTO {
    private String code;
    private String nhsld;
    private String description;

    public ParameterCategoryDTO(String code, String name,String description) {
        this.code = code;
        this.nhsld = name;
        this.description=description;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return nhsld;
    }

    public String getDescription(){return description;}

    @Override
    public String toString() {
        return "CategoryDTO{" +
                "code='" + code + '\'' +
                ", nhsld='" + nhsld + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}