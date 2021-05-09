package app.domain;

import org.apache.commons.lang3.StringUtils;

public class Parameter {

    private String code;
    private String name;
    private String description;

    //private Category category; Quando já estiver implementado a class Category

    public Parameter(String code, String description, String name) {

        checkTestCode(code);
        checkName(name);
        checkDescription(description);

        this.code = code;
        this.name = name;
        this.description = description;

    }

    public void checkTestCode(String code) {

        if (StringUtils.isBlank(code))
            throw new IllegalArgumentException("Code cannot be blank.");


        if (!(code.matches("^[a-zA-Z0-9]*$")) || code.length() > 5)
            throw new IllegalArgumentException("Code not valid! Must be alphanumeric and have less than 5 chars.");

    }

    public void checkName(String name) {

        if (StringUtils.isBlank(name))
            throw new IllegalArgumentException("Name cannot be blank.");

        if (name.length() > 8)
            throw new IllegalArgumentException("Name not valid! Cannot have more than 8 chars.");

    }

    public void checkDescription(String description) {

        if (StringUtils.isBlank(description))
            throw new IllegalArgumentException("Description cannot be blank.");

        if (description.length() > 20)
            throw new IllegalArgumentException("Description not valid! Cannot have more than 15 chars.");

    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
        this.name = name;
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
                        ", Name:" + name;

    }
}