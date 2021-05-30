package app.domain.stores;

import app.domain.model.BarcodeAdapter;
import app.domain.model.Sample;
import app.domain.model.Test;
import app.domain.shared.Constants;
import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

    public Sample createSample(Test tr) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Class<?> eClass = Class.forName(Constants.BC_REFERENCE_API);
        BarcodeAdapter ba = (BarcodeAdapter) eClass.newInstance();

        String barcodeText = generateNumber();
        String filename = Constants.BARCODE_IMAGE + "_" + tr.getTestID() + "_" + barcodeText;

        ba.generateBarcodeandBarcodeImage(barcodeText, filename);

        barcode = ba.getBarcode();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);

        this.sm = new Sample(tr, barcode,date);

        return this.sm;

    }

    public String generateNumber() {

        return RandomStringUtils.randomNumeric(11);
    }

    /**
     * Validates a test type
     *

     * @return the validation of the Sample being created
     */

    public boolean validateSample() {
        if (sm == null || listContain()) {
            return false;
        }
        return true;
    }

    /**
     * Checks if the new objected created is already in the list
     *

     * @return true if the list contains the Sample and false if it doesn't
     */

    public boolean listContain() {

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
        if (validateSample()) {
            listAdd();
            return true;
        } else {
            return false;
        }

    }

    /**
     * Adds an instance of Sample to the list.
     *
     * @return the addition of the Test Type to the list
     */

    public boolean listAdd() {
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


}