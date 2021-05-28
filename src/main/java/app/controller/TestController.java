package app.controller;

import app.domain.model.*;

import java.util.List;

public class TestController {

    ClientStore clientStore;
    TestTypeStore testTypeStore;
    ParameterCategoryStore parameterCategoryStore;
    ParameterStore parameterStore;
    TestStore testStore;
    Test test = null;
    String testID;
    TestType tt;

    public TestController() {

        App app = App.getInstance();
        Company company = app.getCompany();
        clientStore = company.getClientStore();
        testTypeStore = company.getTestTypeStore();
        parameterStore = company.getParameterStore();
        parameterCategoryStore = company.getParameterCategoryStore();
        testStore = company.getTestStore();

    }

    public List<TestType> getTestTypeList() {
        return testTypeStore.getTestTypeList();
    }

    public List<Parameter> getParameterList() {
        return parameterStore.getParameterList();
    }

    public List<ParameterCategory> getParameterCategoryList() {
        return parameterCategoryStore.getParameterCategoryList();
    }

    public void setTt(TestType tt) {
        this.tt = tt;
    }

    public boolean searchClient(String citizenCardNumber) {
        return clientStore.checkExistingClient(citizenCardNumber);
    }

    public boolean validateNhsCode(String nhsCode) {
        return testStore.validateNhsCode(nhsCode);
    }

    public boolean createTest(String citizenCardNumber, String nhsCode, TestType tt, List<Parameter> parameters) {
        testID = testStore.generateTestID();
        test = testStore.createTest(citizenCardNumber, testID, nhsCode, tt);
        test.createTestParameter(testID, parameters);
        return test != null;
    }

    public boolean saveTest() {
        return testStore.saveTest(test);
    }
}
