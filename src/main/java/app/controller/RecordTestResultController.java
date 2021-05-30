package app.controller;

import app.mappers.SampleMapper;
import app.mappers.dto.SampleDTO;
import app.domain.model.*;
import app.domain.stores.SampleStore;
import app.domain.stores.TestStore;

import java.util.List;

public class RecordTestResultController {

    private Company company;
    private SampleStore sampleStore;
    private TestStore testStore;
    private Test test;

    private SampleMapper sampleMapper;


    public RecordTestResultController(){this(App.getInstance().getCompany());}

    /**
     * Constructor.
     */
    public RecordTestResultController(Company company) {
        App app = App.getInstance();
        this.company = app.getCompany();
        this.sampleStore = company.getSampleStore();
        this.testStore = company.getTestStore();
    }

    /**
     * Gets the corresponding test using the sample barcode number
     * @param sampleID the sample barcode number
     * @return the corresponding test
     */
    private boolean getCorrespondingTest(String sampleID) {
        String testID;

        List<Sample> samples = sampleStore.getSampleList();

        testID = "";

        for (Sample sa : samples) {
            if (sa.getBarcode().equals(sampleID)) {
                testID = sa.getTr().getTestID();
            }
        }

        List<Test> tests = testStore.getTestList();

        for (Test test1 : tests) {
            if (test1.getTestID().equals(testID)) {
                this.test = test1;
                return test1.compareTestState("SAMPLE_COLLECTED");
            }
        }
        return false;
    }

    /**
     * Gets the test parameter list of the corresponding test.
     * @param sampleID the sample barcode number
     * @return the test parameter list of the corresponding test
     */
    public List<TestParameter> getParameters(String sampleID) {
        getCorrespondingTest(sampleID);

        if (test == null) {
            return null;
        }
        return test.getTpList();
    }

    /**
     * Adds the test parameter result.
     * @param parameterCode the parameter code
     * @param result the value/result of the parameter
     * @return success/failure in adding the test parameter result
     */
    public boolean addTestParameterResult(String parameterCode, double result) {

        try {
            test.addTestParameterResult(parameterCode, result);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * Modifies the state of the test.
     */
    public void setState() {
        test.setState("SAMPLE_ANALYSED");
    }

    /**
     * Gets the sample list.
     * @return the sample list
     */
    public List<Sample> getSampleList() {
        return company.getSampleList();
    }

    /**
     * Gets the sample list (DTO).
     * @return the sample list (DTO)
     */
    public List<SampleDTO> getSampleListDto() {

        this.sampleMapper = new SampleMapper();

        return sampleMapper.toDTO(getSampleList());
    }
}
