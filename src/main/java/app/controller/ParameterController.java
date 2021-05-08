package app.controller;

import app.domain.*;

import java.util.List;

public class ParameterController {

    private Company company;
    private ParameterStore store;
    private List<Parameter> ppList;

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

    public boolean saveParameter(){ return this.store.saveParameter(); }

    public List<Parameter> getParameterList() {
        return store.getParameterList();
    }

}