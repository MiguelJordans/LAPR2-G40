package app.domain.model;

import app.domain.shared.Constants;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.List;

public class TestType implements Serializable {

    private String testCode;
    private String description;
    private String collectingMethod;

    private List<ParameterCategory> pcList;

    private String externalModule;

    /**
     * Constructs an instance of Test Type
     *
     * @param testCode         the Test Type's test code
     * @param description      the Test Type's description
     * @param collectingMethod the Test Type's collecting method
     * @param pcList           the Test Type's category list
     */

    public TestType(String testCode, String description, String collectingMethod, List<ParameterCategory> pcList) {

        checkTestCode(testCode);
        checkCollectingMethod(collectingMethod);
        checkDescription(description);
        checkCategoriesList(pcList);

        this.testCode = testCode;
        this.collectingMethod = collectingMethod;
        this.description = description;

        this.pcList = pcList;

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

        if (!(testCode.matches("^[a-zA-Z0-9]*$")) || testCode.length() > Constants.TESTCODE_MAX)
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
        if (collectingMethod.length() > Constants.COLLECTINGMETHOD_MAX)
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

        if (description.length() > Constants.DESCRIPTION_MAX)
            throw new IllegalArgumentException("Description not valid! Cannot have more than 15 chars.");

    }

    /**
     * Checks the categories list (according to the acceptance criteira).
     *
     * @param pcList the Test Type's categories
     */

    public void checkCategoriesList(List<ParameterCategory> pcList) {
        if (pcList.isEmpty()) {
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

    public List<ParameterCategory> getPcList() {
        return pcList;
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
     * @param pcList modifies the category list the Test Type
     */

    public void setPcList(List<ParameterCategory> pcList) {
        this.pcList = pcList;
    }

    /**
     * Returns the textual description of the Test Type in the format: Test Code, Description, CollectingMethod.
     *
     * @return the Test Type's characteristics
     */

    @Override
    public String toString() {
        return
                " Test Code: " + testCode +
                        ", Description:" + description +
                        ", CollectingMethod:" + collectingMethod;

    }

    /**
     * Gets the external module name.
     *
     * @return the external module name
     */
    public String getExternalModule() {
        return externalModule;
    }

    /**
     * Sets the external module to the corresponding test type.
     *
     * @param testCode the test type code
     * @return the corresponding external module name
     */
    public String setExternalModule(String testCode) {

        if (testCode.equals("BL000")) {
            return Constants.EM_REFERENCE_API;
        }

        if (testCode.equals("COV19")) {
            return Constants.COVID_REFERENCE_API;
        }
        return null;
    }
}