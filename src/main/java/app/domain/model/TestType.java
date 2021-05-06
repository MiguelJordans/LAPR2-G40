package app.domain.model;
import org.apache.commons.lang3.StringUtils;

public class TestType {

    private String testCode;
    private String description;
    private String collectingMethod;

    //private Category category; Quando já estiver implementado a class Category

    public TestType(String testCode,String description,String collectingMethod){

        String aux=testCode;

        if(!(testCode==null)) testCode.trim();
        checkTestCode(testCode);
        checkCollectingMethod(collectingMethod);
        checkDescription(description);
        testCode=aux;

        this.testCode=testCode;
        this.collectingMethod=collectingMethod;
        this.description=description;

    }

    public void checkTestCode(String testCode){

         if (StringUtils.isBlank(testCode))
            throw new IllegalArgumentException("Test Code cannot be blank.");


        if(!(testCode.matches("^[a-zA-Z0-9]*$"))||testCode.length()>5)
            throw new IllegalArgumentException("Test Code not valid! Must be alpha numeric and have less than 5 chars.");

    }

    public void checkCollectingMethod(String collectingMethod){

         if (StringUtils.isBlank(collectingMethod))
            throw new IllegalArgumentException("Collecting Method cannot be blank.");

        if (collectingMethod.length()>20)
            throw new IllegalArgumentException("Collecting Method not valid! Cannot have more than 20 chars.");

    }

    public void checkDescription(String description){

        if (StringUtils.isBlank(description))
            throw new IllegalArgumentException("Description cannot be blank.");

        if (description.length()>15)
            throw new IllegalArgumentException("Description not valid! Cannot have more than 15 chars.");

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

    @Override
    public String toString() {
        return "TestType{" +
                "testCode='" + testCode + '\'' +
                ", description='" + description + '\'' +
                ", collectingMethod='" + collectingMethod + '\'' +
                '}';
    }
}