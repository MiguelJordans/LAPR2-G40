package app.controller;

import app.domain.model.Company;
import app.domain.model.TestType;
import app.domain.model.TestTypeStore;
import app.domain.shared.Constants;
import auth.AuthFacade;

import java.util.Properties;

public class TestTypeController {

    private Company company;
    private AuthFacade authFacade;

    private TestTypeController app;
    private TestTypeStore store = null;

    public TestTypeController(){
        this(App.getInstance().getCompany());
    }

    public TestTypeController(Company company){
        this.company=company;
        this.app=null;
    }

    public boolean doLogin(String email, String pwd)
    {
        try {
            return this.app.doLogin(email, pwd);
        } catch(IllegalArgumentException ex)
        {
            return false;
        }
    }

    public TestTypeStore CreateTestType(String description,String testCode,String collectingMethod){
       return store = this.CreateTestType(description,testCode,collectingMethod);
    }


}