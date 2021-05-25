package app.controller;

import app.domain.model.*;

import java.io.IOException;
import java.util.List;

public class SampleController {

    private Company company;
    private SampleStore smStore;

    static List<Sample> sampleListTemporary;

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

    /**
     * Creates a test type (Calling the TestType constructor implemented in the TestTypeStore)
     */

    public void CreateSample(TestType tt, int n) {

        smStore = company.getSampleStore();

        for (int i = 0; i < n; i++) {
            //sampleListTemporary.add(smStore.CreateSample(tt)); O controller não esta a conseguir criar a sample deve ter aqui um erro
            smStore.CreateSample(tt);
            smStore.saveSample();
           /* try {
                smStore.createTemporaryList();
            } catch (Exception e) {
                System.out.println("Couldn't add the sample to the temporary list!");
            }*/
        }
    }

    /**
     * Transforms into string.
     *
     * @return the Test Type's info in string format
     */

    public String getSm() {
        return smStore.getSm().toString();
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

    public List<Sample> showList(){
         return smStore.showList();

    }

    public void barcodeImage() throws IOException {
        this.smStore.barcodeImage();
    }


}