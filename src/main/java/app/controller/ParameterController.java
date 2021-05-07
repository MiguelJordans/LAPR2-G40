package app.controller;

import app.domain.Company;
import app.domain.ParameterStore;
import app.domain.TestTypeStore;

public class ParameterController {

    private Company company;
    private ParameterStore store;

    public ParameterController(){
        this(App.getInstance().getCompany());
    }

    public ParameterController(Company company){
        this.company=company;
    }

    public void CreateParameter(String description,String code,String name){
        store = company.getParameterStore();
        store.CreateParameter(description,code,name);
    }

    public String getPP(){ return store.getPp().toString(); }

    public boolean saveTestType(){ return this.store.saveTestType(); }

}