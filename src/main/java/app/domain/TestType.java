package app.domain;

import org.apache.commons.lang3.StringUtils;
import java.util.List;

public class TestType {

    private String testCode;
    private String description;
    private String collectingMethod;


    private ParameterCategoryStore ppStore;
    private List<Parameter> ppList;
    private ParameterCategoryStore pp;

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

    public void checkTestCode(String testCode) {

        if (StringUtils.isBlank(testCode))
            throw new IllegalArgumentException("Test Code cannot be blank.");

        if (!(testCode.matches("^[a-zA-Z0-9]*$")) || testCode.length() > 5)
            throw new IllegalArgumentException("Test Code not valid! Must be alphanumeric and have less than 5 chars.");

    }
    public void checkCollectingMethod(String collectingMethod) {
        if (StringUtils.isBlank(collectingMethod))
            throw new IllegalArgumentException("Collecting Method cannot be blank.");
        if (collectingMethod.length() > 20)
            throw new IllegalArgumentException("Collecting Method not valid! Cannot have more than 20 chars.");
    }
    public void checkDescription(String description) {
        if (StringUtils.isBlank(description))
            throw new IllegalArgumentException("Description cannot be blank.");

        if (description.length() > 15)
            throw new IllegalArgumentException("Description not valid! Cannot have more than 15 chars.");

    }

    public void checkCategoriesList(ParameterCategoryStore ppStore){
        if(ppStore.list.isEmpty()) {
            throw new IllegalArgumentException("Categories not valid! List is null!");
        }
    }

    public String getTestCode() {
        return testCode;
    }

    public String getDescription() {
        return description;
    }
    public String getCollectingMethod() {
        return collectingMethod;
    }
    public void setCollectingMethod(String collectingMethod) {
        checkCollectingMethod(collectingMethod);
        this.collectingMethod = collectingMethod;
    }
    public void setDescription(String description) {
        checkDescription(description);
        this.description = description;
    }
    public void setTestCode(String testCode) {
        checkTestCode(testCode);
        this.testCode = testCode;
    }
    public void setPp(ParameterCategoryStore ppsstore) {
        this.pp = ppsstore;
    }
    @Override
    public String toString() {
        return
                " Test Code: " + testCode  +
                ", Description:" + description +
                ", CollectingMethod:" + collectingMethod;
    }
}