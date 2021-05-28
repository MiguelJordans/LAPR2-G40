package app.controller;

import app.domain.mappers.SampleMapper;
import app.domain.mappers.TestMapper;
import app.domain.mappers.dto.SampleDTO;
import app.domain.mappers.dto.TestDTO;
import app.domain.model.*;

import java.io.IOException;
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

    public void CreateSample(int n) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        smStore = company.getSampleStore();

        for (int i = 0; i < n; i++) {
            //sampleListTemporary.add(smStore.CreateSample(tt)); O controller não esta a conseguir criar a sample deve ter aqui um erro
            this.smStore.createSample(tr);
            //this.smStore.addToTemporaryList();
            this.smStore.saveSample();
            //this.smStore.barcodeImage();

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

        for (Test tr : this.getTestList()) {
            if (testDTO.getTestID() == tr.getTestID()) {
                this.tr = tr;
            }
        }

    }

}