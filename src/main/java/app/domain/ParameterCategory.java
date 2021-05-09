package app.domain;

import org.apache.commons.lang3.StringUtils;

public class ParameterCategory {

    private String code;
    private String nhsld;
    private String description;

    //private Category category; Quando já estiver implementado a class Category

    public ParameterCategory(String code, String description, String nhsld) {

        checkTestCode(code);
        checkNhsld(nhsld);
        checkDescription(description);

        this.code = code;
        this.nhsld = nhsld;
        this.description = description;

    }

    public void checkTestCode(String code) {

        if (StringUtils.isBlank(code))
            throw new IllegalArgumentException("Code cannot be blank.");

        if (code.length()<4 || code.length() > 8)
            throw new IllegalArgumentException("Code not valid! Code must have 4 to 8 chars.");

    }

    public void checkNhsld(String nhsld) {

        if (StringUtils.isBlank(nhsld))
            throw new IllegalArgumentException("NHSLD cannot be blank.");

        if (nhsld.length() > 8)
            throw new IllegalArgumentException("NHSLD not valid! Cannot have more than 8 chars.");

    }

    public void checkDescription(String description) {

        if (StringUtils.isBlank(description))
            throw new IllegalArgumentException("Description cannot be blank.");

        if (description.length() > 40)
            throw new IllegalArgumentException("Description not valid! Cannot have more than 40 chars.");

    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getNhsld() {
        return nhsld;
    }

    public void setName(String nhsld) {
        checkNhsld(nhsld);
        this.nhsld = nhsld;
    }

    public void setDescription(String description) {
        checkDescription(description);
        this.description = description;
    }

    public void setCode(String code) {
        checkTestCode(code);
        this.code = code;
    }

    @Override
    public String toString() {
        return
                " Code: " + code  +
                        ", Description:" + description +
                        ", NHSLD:" + nhsld;

    }
}