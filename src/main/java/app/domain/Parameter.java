package app.domain;

import org.apache.commons.lang3.StringUtils;

public class Parameter {

    private String code;
    private String name;
    private String description;

    private ParameterCategoryStore pp;


    /**
     * Constructs an instance of Parameter
     *
     * @param code the Parameter's code
     * @param description the Parameter's description
     * @param name the Parameter's name
     * @param ppStore the Parameter's category list
     */

    public Parameter(String code, String description, String name,ParameterCategoryStore ppStore) {

        checkCode(code);
        checkName(name);
        checkDescription(description);
        checkCategoriesList(ppStore);

        this.code = code;
        this.name = name;
        this.description = description;
        this.pp = ppStore;

    }

    //Checks-----------------------------------------------------------------------------------------

    /**
     * Checks the Parameter's code (according to the acceptance criteria).
     *
     * @param code the Parameter's code
     */

    public void checkCode(String code) {

        if (StringUtils.isBlank(code))
            throw new IllegalArgumentException("Code cannot be blank.");


        if (!(code.matches("^[a-zA-Z0-9]*$")) || code.length() > 5)
            throw new IllegalArgumentException("Code not valid! Must be alphanumeric and have less than 5 chars.");

    }

    /**
     * Checks the Parameter's name (according to the acceptance criteira).
     *
     * @param name the Parameter's name
     */

    public void checkName(String name) {

        if (StringUtils.isBlank(name))
            throw new IllegalArgumentException("Name cannot be blank.");

        if (name.length() > 8)
            throw new IllegalArgumentException("Name not valid! Cannot have more than 8 chars.");

    }

    /**
     * Checks the Parameter's description (according to the acceptance criteria)
     *
     * @param description the Parameter's description
     */

    public void checkDescription(String description) {

        if (StringUtils.isBlank(description))
            throw new IllegalArgumentException("Description cannot be blank.");

        if (description.length() > 20)
            throw new IllegalArgumentException("Description not valid! Cannot have more than 15 chars.");

    }

    /**
     * Checks the Parameter's category list (according to the acceptance criteria)
     *
     * @param ppStore the Parameter's category list
     */

    public void checkCategoriesList(ParameterCategoryStore ppStore){
        if(ppStore.list.isEmpty()) {
            throw new IllegalArgumentException("Categories not valid! List is null!");
        }
    }

   //Get ------------------------------------------------------------------

    /**
     * Returns the code of the Parameter
     *
     * @return the code of the Parameter
     */

    public String getCode() {
        return code;
    }

    /**
     * Returns the description of the Parameter
     *
     * @return the description of the Parameter
     */

    public String getDescription() {
        return description;
    }

    /**
     * Returns the name of the Parameter
     *
     * @return the name of of the Parameter
     */

    public String getName() {
        return name;
    }

    /**
     * Returns the category list of the Parameter
     *
     * @return the category list of the Parameter
     */

    public ParameterCategoryStore getPp() {
        return pp;
    }

    //Sets---------------------------------------------------------------------

    /**
     * Modifies the category list of the Parameter
     *
     * @param pp modifies the category list of the Parameter
     */

    public void setPp(ParameterCategoryStore pp) {
        checkCategoriesList(pp);
        this.pp = pp;
    }

    /**
     * Modifies the name of the Parameter
     *
     * @param name modifies the name of the Parameter
     */

    public void setName(String name) {
        checkName(name);
        this.name = name;
    }

    /**
     * Modifies the description of the Parameter
     *
     * @param description modifies the description of the Parameter
     */

    public void setDescription(String description) {
        checkDescription(description);
        this.description = description;
    }

    /**
     * Modifies the code of the Parameter
     *
     * @param code modifies the code of the Parameter
     */

    public void setCode(String code) {
        checkCode(code);
        this.code = code;
    }

    /**
     * Returns the textual description of the Parameter in the format : Code, Description, Name.
     *
     * @return
     */


    @Override
    public String toString() {
        return
                " Code: " + code  +
                        ", Description:" + description +
                        ", Name:" + name;

    }
}