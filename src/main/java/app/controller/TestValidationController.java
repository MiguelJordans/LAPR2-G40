package app.controller;

import app.domain.model.Company;
import app.domain.model.Test;
import app.domain.stores.TestStore;

import java.time.LocalDate;
import java.util.Set;

public class TestValidationController {
    private TestStore testStore;
    private Company company;

    public TestValidationController() {
        this(App.getInstance().getCompany());
    }

    public TestValidationController(Company company) {
        testStore = company.getTestStore();
    }

    public Set<Test> invalidTests() {
        return testStore.getInvalidTestList();
    }

    public boolean validateTest(String testId){
        LocalDate instant = LocalDate.now();
        return testStore.validateTest(testId,instant);

    }


}
