package app.controller;

import app.domain.model.Company;
import app.domain.model.Test;
import app.domain.stores.TestStore;

import java.util.HashSet;

public class TestValidationController {
    private Company company;
    private TestStore testStore;

    public TestValidationController() {
        this(App.getInstance().getCompany());

    }

    public TestValidationController(Company company) {
        this.company = company;
        testStore = company.getTestStore();

    }

    public HashSet<Test> invalidTests() {
        return testStore.getInvalidTestList();
    }
/*
    public boolean validateTest(String testId){
        LocalDate instant = LocalDate.now();
        return testStore.validateTest(testId,instant);

    }

 */
}
