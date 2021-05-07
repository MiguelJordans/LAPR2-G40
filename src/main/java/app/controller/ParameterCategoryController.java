package app.controller;

import app.domain.Company;
import app.domain.ParameterCategory;
import app.domain.ParameterCategoryStore;
import app.domain.TestTypeStore;

public class ParameterCategoryController {

    private Company company;
    private ParameterCategoryStore store;

    public ParameterCategoryController(){
        this(App.getInstance().getCompany());
    }

    public ParameterCategoryController(Company company){
        this.company=company;
    }

    public void CreateParameterCategory(String description,String testCode,String nhsld){
        store = company.getParameterCategoryStore();
        store.CreateParameterCategory(description,testCode,nhsld);
    }

    public String getPC(){ return store.getPc().toString(); }

    public boolean saveParameterCategory(){ return this.store.saveParameterCategory(); }

}