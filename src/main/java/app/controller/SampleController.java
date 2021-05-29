package app.controller;

import app.domain.mappers.TestMapper;
import app.domain.mappers.dto.TestDTO;
import app.domain.model.*;
import app.domain.stores.SampleStore;

import java.util.ArrayList;
import java.util.List;

public class SampleController {

    private Company company;
    private SampleStore smStore;
    private TestMapper testMapper;

    static List<Sample> sampleListTemporary;

    private Test tr;

    /**
     * Creates an empty Test Type controller
     */

    public SampleController() {
        this(App.getInstance().getCompany());
    }

    /**
     * Instance of a Test Type
     *
     * @param company the company that administrates the system
     */


    public SampleController(Company company) {
        this.company = company;
    }

    public void addTest(TestDTO trDto){
        convertDTOintoTest(trDto);
    }

    /**
     * Creates a test type (Calling the TestType constructor implemented in the TestTypeStore)
     */

    public void CreateSample(int n) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        smStore = company.getSampleStore();

        for (int i = 0; i < n; i++) {
            this.smStore.createSample(tr);
            this.smStore.saveSample();
        }
    }

    /**
     * Transforms into string.
     *
     * @return the Test Type's info in string format
     */

    public Sample getSm() {
        return smStore.getSm();
    }

    /**
     * Saves an instance Test type.
     *
     * @return the saving of an instance of a Test Type
     */

    public List<Test> getCreatedTests (){

        List<Test> testList = new ArrayList<>();

        for(Test test : company.getTestList()){
            if(test.getState().equals("SAMPLE_COLLECTED")||test.getState().equals("SAMPLE_ANALYSED")||test.getState().equals("DIAGNOSTIC_MADE")||test.getState().equals("VALIDATED"))
                testList.add(test);
        }

        return testList;

    }


    public boolean saveSample() {
        return this.smStore.saveSample();
    }

    public boolean saveSamples() {
        for (Sample sm1 : sampleListTemporary) {
            smStore.getSampleList().add(sm1);
        }
        return true;
    }

    /**
     * Returns the list of test type already created
     *
     * @return the list of test type already created
     */

    public List<Sample> getSampleList() {
        return smStore.getSampleList();
    }

    public List<Test> getTestList() {
        return this.company.getTestList();
    }

    public List<TestDTO> getTestListDto() {

        this.testMapper = new TestMapper();

        return testMapper.toDTO(getTestList());

    }

    public void convertDTOintoTest(TestDTO testDTO) {

        for (Test tr1 : this.getTestList()) {
            if (testDTO.getTestID().equals(tr1.getTestID())) {
                this.tr = tr1;
            }
        }

    }

}