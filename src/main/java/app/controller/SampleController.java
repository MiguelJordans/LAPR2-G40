package app.controller;

import app.domain.stores.ClientStore;
import app.domain.stores.TestStore;
import app.mappers.SampleMapper;
import app.mappers.TestMapper;
import app.mappers.dto.SampleDTO;
import app.mappers.dto.TestDTO;
import app.domain.model.*;
import app.domain.stores.SampleStore;

import java.util.ArrayList;
import java.util.List;

public class SampleController {

    private Company company;
    private SampleStore smStore;
    private TestMapper testMapper;
    private TestMapper testMapper1;
    private SampleMapper sampleMapper;
    private SampleMapper sampleMapper1;

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

    public void createSample(int n) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        smStore = company.getSampleStore();

        for (int i = 0; i < n; i++) {
            this.smStore.createSample(tr);
            this.smStore.saveSample();
        }
    }

    public List<Test> getAvailableTestsList(){

        List<Test> testList = new ArrayList<>();

        for(Test test : getTestList()){

            if(test.getState().equals("CREATED")){
                testList.add(test);
            }

        }
        return testList;
    }

    public List<TestDTO> getAvailableTestListDto() {

        this.testMapper1 = new TestMapper();

        return testMapper1.toDTO(getAvailableTestsList(),getClientName(tr));

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

    public List<SampleDTO> getSampleListDTO(){

        this.sampleMapper = new SampleMapper();

        return sampleMapper.toDTO(getSampleList());

    }

    public List<Sample> getCurrentSampleList(){

        List<Sample> sampleList = new ArrayList<>();

        for(Sample sm : getSampleList()){

            if(sm.getTr().getTestID().equals(tr.getTestID())){
                sampleList.add(sm);
            }
        }

        return sampleList;

    }

    public List<SampleDTO> getCurrentSampleListDTO(){

        this.sampleMapper1 = new SampleMapper();

        return sampleMapper1.toDTO(getCurrentSampleList());

    }

    public void convertDTOintoTest(TestDTO testDTO) {

        for (Test tr1 : this.getTestList()) {
            if (testDTO.getTestID().equals(tr1.getTestID())) {
                this.tr = tr1;
            }
        }

    }

    public ClientStore getClientStore(){
       return this.company.getClientStore();
    }

    public String getClientName(Test test){
        for (Client c : getClientStore().getClientList()){
            if(test.getTinNumber().equalsIgnoreCase(c.getTinNumber())){
                return c.getName();
            }
        }
        return null;
    }


}