package app.domain.mappers.dto;

public class CategoryListDTO {

    private String code;
    private String nhsld;
    private String description;

    public CategoryListDTO(String code, String nhsld,String description) {
        this.code = code;
        this.nhsld = nhsld;
        this.description=description;
    }

    public String getCode() {
        return code;
    }

    public String getNhsld() {
        return nhsld;
    }

    public String getDescription() {
        return description;
    }
}