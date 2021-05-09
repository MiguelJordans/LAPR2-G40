package app.domain;

import org.apache.commons.lang3.StringUtils;

public class TestType {

    private String testCode;
    private String description;
    private String collectingMethod;

    private ParameterCategoryStore pp;


    /**
     * Constructs an instance of Test Type
     *
     * @param testCode the Test Type's test code
     * @param description the Test Type's description
     * @param collectingMethod the Test Type's collecting method
     * @param ppStore the Test Type's category list
     */

    public TestType(String testCode, String description, String collectingMethod,ParameterCategoryStore ppStore) {

        checkTestCode(testCode);
        checkCollectingMethod(collectingMethod);
        checkDescription(description);
        checkCategoriesList(ppStore);

        this.testCode = testCode;
        this.collectingMethod = collectingMethod;
        this.description = description;

        this.pp = ppStore;

    }

    // Checks ---------------------------------------------------------------

    /**
     * Checks Test Code rules(according to the acceptance criteria).
     *
     * @param testCode the Test Type's test code
     */

    public void checkTestCode(String testCode) {

        if (StringUtils.isBlank(testCode))
            throw new IllegalArgumentException("Test Code cannot be blank.");

        if (!(testCode.matches("^[a-zA-Z0-9]*$")) || testCode.length() > 5)
            throw new IllegalArgumentException("Test Code not valid! Must be alphanumeric and have less than 5 chars.");

    }

    /**
     * Checks Collecting method rules (according to the acceptance criteria).
     *
     * @param collectingMethod the Test Type's collecting method
     */

    public void checkCollectingMethod(String collectingMethod) {
        if (StringUtils.isBlank(collectingMethod))
            throw new IllegalArgumentException("Collecting Method cannot be blank.");
        if (collectingMethod.length() > 20)
            throw new IllegalArgumentException("Collecting Method not valid! Cannot have more than 20 chars.");
    }

    /**
     * Checks the Description (according to the acceptance criteria).
     *
     * @param description the Test Type's description
     */

    public void checkDescription(String description) {
        if (StringUtils.isBlank(description))
            throw new IllegalArgumentException("Description cannot be blank.");

        if (description.length() > 15)
            throw new IllegalArgumentException("Description not valid! Cannot have more than 15 chars.");

    }

    /**
     * Checks the categories list (according to the acceptance criteira).
     *
     * @param ppStore the Test Type's categories
     */

    public void checkCategoriesList(ParameterCategoryStore ppStore){
        if(ppStore.list.isEmpty()) {
            throw new IllegalArgumentException("Categories not valid! List is null!");
        }
    }

    //Get-----------------------------------------------------------------------

    /**
     * Returns the test code of the Test Type
     *
     * @return the test code of the Test Type
     */

    public String getTestCode() {
        return testCode;
    }

    /**
     * Returns the description of the Test Type
     *
     * @return the description of the Test Type
     */

    public String getDescription() {
        return description;
    }

    /**
     * Returns the collecting method of the Test Type
     *
     * @return the collecting method of the Test Type
     */

    public String getCollectingMethod() {
        return collectingMethod;
    }

    /**
     * Returns the categories list of the Test Type
     *
     * @return the categories list of the Test Type
     */

    public ParameterCategoryStore getPP() {
        return pp;
    }

    //Sets ----------------------------------------------------------------

    /**
     * Modifies the collecting method of the Test Type
     *
     * @param collectingMethod modifies the collecting method of the Test Type
     */

    public void setCollectingMethod(String collectingMethod) {
        checkCollectingMethod(collectingMethod);
        this.collectingMethod = collectingMethod;
    }

    /**
     * Modifies the description of the Test Type
     *
     * @param description modifies the description of the Test Type
     */

    public void setDescription(String description) {
        checkDescription(description);
        this.description = description;
    }

    /**
     * Modifies the test code of the Test Type
     *
     * @param testCode the test code of the Test Type
     */

    public void setTestCode(String testCode) {
        checkTestCode(testCode);
        this.testCode = testCode;
    }

    /**
     * Modifies the category list of the Test Type
     *
     * @param ppsstore modifies the category list the Test Type
     */

    public void setPp(ParameterCategoryStore ppsstore) {
        this.pp = ppsstore;
    }

    /**
     * Returns the textual description of the Test Type in the format : Test Code, Description, CollectingMethod.
     *
     * @return
     */

    @Override
    public String toString() {
        return
                " Test Code: " + testCode  +
                ", Description:" + description +
                ", CollectingMethod:" + collectingMethod;
    }
}