package app.controller;

import app.domain.model.*;
import app.domain.stores.ParameterCategoryStore;

import java.util.List;

public class ParameterCategoryController {

    private Company company;
    private ParameterCategoryStore store;

    /**
     * Creates an empty ParameterCategory controller.
     */

    public ParameterCategoryController(){
        this(App.getInstance().getCompany());
    }

    /**
     * Instance of a ParameterCategory.
     *
     * @param company - the company that administrates the system
     */

    public ParameterCategoryController(Company company){
        this.company=company;
    }

    /**
     * Creates a ParameterCategory
     *
     * @param description the parameter category's description
     * @param testCode the parameter category's test code
     * @param nhsld the parameter category's nhsld
     */

    public void CreateParameterCategory(String description,String testCode,String nhsld){
        store = company.getParameterCategoryStore();
        store.createParameterCategory(description,testCode,nhsld);
    }

    /**
     * Transforms into string.
     *
     * @return the parameter category's info in string format
     */

    public String getPC(){ return store.getPc().toString(); }


    /**
     * Saves an instance of parameter category.
     *
     * @return the saving of an instance of a parameter cartegory
     */

    public boolean saveParameterCategory(){ return this.store.saveParameterCategory(); }

    /**
     * Returns the list of parameter category already created
     *
     * @return the list of parameter category already created
     */

    public List<ParameterCategory> getParameterList() {
        return store.getParameterCategoryList();
    }

}