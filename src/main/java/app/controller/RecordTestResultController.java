package app.controller;

import app.domain.model.Company;
import app.domain.model.Parameter;
import app.domain.model.Test;
import app.domain.model.TestStore;

import java.util.List;

public class RecordTestResultController {

    private TestStore testStore;
    private Test test;

    public RecordTestResultController() {
        App app = App.getInstance();
        Company company = app.getCompany();
        this.testStore = company.getTestStore();
    }

    private Test getCorrespondingTest(String sampleBarcodeNumber) {
        String testID = "000000000003"; //Buscar teste correspondente através do número do barcode
        List<Test> tests = testStore.getTests();

        for (Test t1 : tests) {
            if(test.getTestID().equals(testID)) {
                this.test = t1;
            }
        }
        return null;
    }

    public List<Parameter> getParameters(String sampleID) {
        getCorrespondingTest(sampleID);

        if(test == null) {
            return null;
        }
        return test.getParamList();
    }

    public boolean addTestParameterResult(String parameterCode, double result) {

        try {
            test.addTestParameterResult(parameterCode, result);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
