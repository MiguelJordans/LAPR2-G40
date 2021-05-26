/*package app.controller;

import app.domain.model.*;

import java.util.List;

public class TestController {

    ClientStore clientStore;
    TestTypeStore testTypeStore;
    ParameterCategoryStore parameterCategoryStore;
    ParameterStore parameterStore;
    TestStore testStore;
    Test test = null;
    String id;
    List<Parameter> ppList;

    public TestController(){

        App app = App.getInstance();
        Company company = app.getCompany();
        clientStore = company.getClientStore();
        testTypeStore = company.getTestTypeStore();
        parameterStore = company.getParameterStore();
        parameterCategoryStore = company.getParameterCategoryStore();
        testStore = company.getTestStore();

    }

    public List<TestType> getTestType (){
        return testTypeStore.getTestTypeList();
    }

    public List<Parameter> getParameterStore (){
        return parameterStore.getParameterList();
    }

    public List<ParameterCategory> getParameterCategoryStore(){
        return parameterCategoryStore.getParameterCategoryList();
    }

    public boolean searchClient (String citizenCardNumber){
        return clientStore.checkExistingClient(citizenCardNumber);
    }

    public boolean validateNhsCode (String nhsCode) {
        return testStore.validateNhsCode(nhsCode);
    }

    public boolean createTest (String citizenCardNumber, String nhsCode, TestType tt, List<Parameter> ppList){
        id = testStore.generateId();
        test = testStore.createTest(citizenCardNumber, id, nhsCode, tt);
        return test != null;
    }

    public boolean saveTest (){
        return testStore.saveTest(test);
    }
}*/
