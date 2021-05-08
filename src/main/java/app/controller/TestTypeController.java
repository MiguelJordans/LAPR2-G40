package app.controller;

import app.domain.Company;
import app.domain.ParameterCategoryStore;
import app.domain.TestType;
import app.domain.TestTypeStore;

import java.util.List;

public class TestTypeController {

    private Company company;
    private TestTypeStore store;

    public TestTypeController(){
        this(App.getInstance().getCompany());
    }

    public TestTypeController(Company company){
        this.company=company;
    }

    public void CreateTestType(String description, String testCode, String collectingMethod, ParameterCategoryStore pc){
        store = company.getTestTypeStore();
        store.CreateTestType(description,testCode,collectingMethod,pc);
    }

     public String getTT(){ return store.getTt().toString(); }

     public boolean saveTestType(){ return this.store.saveTestType(); }

    public List<TestType> getTestTypeList() {
        return store.getTestTypeList();
    }

}