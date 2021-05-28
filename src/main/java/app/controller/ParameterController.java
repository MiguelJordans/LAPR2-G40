package app.controller;

import app.domain.model.*;
import app.domain.stores.ParameterStore;

import java.util.List;

public class ParameterController {

    private Company company;
    private ParameterStore store;

    /**
     * Creates an empty Parameter controller.
     */

    public ParameterController(){
        this(App.getInstance().getCompany());
    }

    /**
     * Instance of a Parameter.
     *
     * @param company - the company that administrates the system
     */

    public ParameterController(Company company){
        this.company=company;
    }

    /**
     * Creates a Parameter(Calling the Parameter constructor implemented in the parameterStore)
     *
     * @param description the parameter's description
     * @param code the parameter's code
     * @param name the parameter's name
     * @param pcList the parameter's category list
     */

    public void CreateParameter(String description,String code,String name,List<ParameterCategory> pcList){
        store = company.getParameterStore();
        store.createParameter(description,code,name,pcList);
    }

    /**
     * Transforms into string.
     *
     * @return the Parameter's info in string format
     */

    public String getPP(){ return store.getPp().toString(); }

    /**
     * Saves an instance of Parameter.
     *
     * @return the saving of an instance of a Parameter.
     */

    public boolean saveParameter() {
        return this.store.saveParameter();
    }

    /**
     * Returns the list of parameters already created
     *
     * @return the list of parameters already created
     */

    public List<Parameter> getParameterList() {
        return store.getParameterList();
    }
}