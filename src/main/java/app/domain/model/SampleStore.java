package app.domain.model;

import app.domain.shared.Constants;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;

public class SampleStore {

    static List<Sample> list = new ArrayList<>();
    static List<Sample> sampleListTemporary = new ArrayList<>();
    String barcode;
    Sample sm;

    /**
     * Creates a Sample (Calling the Sample constructor)
     *
     * @return the sample created
     */

    public Sample CreateSample(Test tr) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Class<?> eClass = Class.forName(Constants.BC_REFERENCE_API);
        BarcodeAdapter ba = (BarcodeAdapter) eClass.newInstance();

        String barcodeText = generateNumber();
        String filename = Constants.BARCODE_IMAGE + "_" + tr.getTestID() + "_" + barcodeText;

        ba.generateBarcodeandBarcodeImage(barcodeText, filename);

        barcode = ba.getBarcode();

        return this.sm = new Sample(tr, barcode);

    }

    public String generateNumber() {

        String random_bar = RandomStringUtils.randomNumeric(11);


        return random_bar;
    }

    public void createTemporaryList() {
        sampleListTemporary.add(sm);
    }

    /**
     * Validates a test type
     *
     * @param sm the object Sample
     * @return the validation of the Sample being created
     */

    public boolean validateSample(Sample sm) {
        if (sm == null || listContain(sm)) {
            return false;
        }
        return true;
    }

    /**
     * Checks if the new objected created is already in the list
     *
     * @param sm the object Sample
     * @return true if the list contains the Sample and false if it doesn't
     */

    public boolean listContain(Sample sm) {

        if (this.list.contains(sm)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Saves an instance of Sample.
     *
     * @return the saving of an instance of a Sample
     */

    public boolean saveSample() {
        if (validateSample(sm)) {
            listAdd(sm);
            return true;
        } else {
            return false;
        }

    }

    /**
     * Adds an instance of Sample to the list.
     *
     * @param sm - the test type
     * @return the addition of the Test Type to the list
     */

    public boolean listAdd(Sample sm) {
        list.add(sm);
        return true;
    }

    /**
     * Replaces the element of the specified position in the list with the specified element.
     *
     * @param i the index of the element to replace
     * @return the element previously at the specified postion
     */

    public Sample getSample(int i) {
        return list.get(i);
    }

    /**
     * Gets Sample from the list.
     *
     * @return the Sample requested
     */

    public Sample getSm() {
        return sm;
    }

    /**
     * Returns the list of test types already created
     *
     * @return the list of test types already created
     */

    public List<Sample> getSampleList() {
        return list;
    }

    public List<Sample> showList() {
        for (Sample sm1 : list) {
            System.out.println(sm1.toString());
        }
        return list;
    }

       /* public void barcodeImage() throws IOException {

            String filename = Constants.BARCODE_IMAGE+"_"+sm.getTr().getTestCode()+"_"+sa.getBarcodeText();

            File outputfile = new File(Constants.PATH+filename+".jpg");

            ImageIO.write(barcodeImage, "jpg", outputfile);

        }*/

      /*  public String generateFileName(TestType tt){
            String filename = Constants.BARCODE_IMAGE+"_"+tt.getTestCode()+"_"+ba.getBarcodeText();

            return filename;
        }*/

}