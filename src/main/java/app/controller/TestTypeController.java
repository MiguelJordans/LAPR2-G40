package app.controller;

import app.domain.model.Company;
import app.domain.model.ParameterCategoryStore;
import app.domain.model.TestType;
import app.domain.model.TestTypeStore;

import java.util.List;

public class TestTypeController {

    private Company company;
    private TestTypeStore store;

    /**
     * Creates an empty Test Type controller
     */

    public TestTypeController(){
        this(App.getInstance().getCompany());
    }

    /**
     * Instance of a Test Type
     *
     * @param company the company that administrates the system
     */


    public TestTypeController(Company company){
        this.company=company;
    }

    /**
     * Creates a test type (Calling the TestType constructor implemented in the TestTypeStore)
     *
     * @param description the Test type's description
     * @param testCode the Test type's test code
     * @param collectingMethod the Test type's collecting method
     * @param pc the Test type's category list
     */

    public void CreateTestType(String description, String testCode, String collectingMethod, ParameterCategoryStore pc){
        store = company.getTestTypeStore();
        store.CreateTestType(description,testCode,collectingMethod,pc);
    }

    /**
     * Transforms into string.
     *
     * @return the Test Type's info in string format
     */

     public String getTT(){ return store.getTt().toString(); }

    /**
     * Saves an instance Test type.
     *
     * @return the saving of an instance of a Test Type
     */

     public boolean saveTestType(){ return this.store.saveTestType(); }

    /**
     * Returns the list of test type already created
     *
     * @return the list of test type already created
     */

    public List<TestType> getTestTypeList() {
        return store.getTestTypeList();
    }

}