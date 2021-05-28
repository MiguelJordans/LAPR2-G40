package app.controller;

import app.domain.model.*;
import app.domain.stores.TestStore;

import java.util.List;

public class RecordTestResultController {

    private SampleStore sampleStore;
    private TestStore testStore;
    private Test test;

    public RecordTestResultController() {
        App app = App.getInstance();
        Company company = app.getCompany();
        this.sampleStore = company.getSampleStore();
        this.testStore = company.getTestStore();
    }

    private boolean getCorrespondingTest(String sampleID) {
        String testID;

        List<Sample> samples = sampleStore.getSampleList();

        testID = "";

        for (Sample sa : samples) {
            if (sa.getBarcode().equals(sampleID)) {
                testID = sa.getTr().getTestID();
            }
        }

        List<Test> tests = testStore.getTestsList();

        for (Test test : tests) {
            if (test.getTestID().equals(testID)) {
                this.test = test;
                return test.compareTestState("SAMPLE_COLLECTED");
            }
        }
        return false;
    }

    public List<TestParameter> getParameters(String sampleID) {
        getCorrespondingTest(sampleID);

        if(test == null) {
            return null;
        }
        return test.getTpList();
    }

    public boolean addTestParameterResult(String parameterCode, double result) {

        try {
            test.addTestParameterResult(parameterCode, result);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public void setState() {
        test.setState("SAMPLE_ANALYSED");
    }
}
