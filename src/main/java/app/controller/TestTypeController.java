package app.controller;

import app.domain.model.Company;
import app.domain.model.TestType;
import app.domain.model.TestTypeStore;
import app.domain.shared.Constants;
import auth.AuthFacade;

import java.util.Properties;

public class TestTypeController {

    private Company company;

    private TestTypeStore store;

    public TestTypeController(){
        this(App.getInstance().getCompany());
    }

    public TestTypeController(Company company){
        this.company=company;
    }

    public TestType CreateTestType(String description,String testCode,String collectingMethod){
        //store = company.getTestTypeList();
        return store.CreateTestType(description,testCode,collectingMethod);
    }

    public String getTT(){ return store.getTt().toString(); }

    public boolean saveTestType(){ return this.store.saveTestType(); }

}