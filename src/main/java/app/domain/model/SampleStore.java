package app.domain.model;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class SampleStore {

        static List<Sample> list = new ArrayList<>();
        Sample sm;

        private final double MIN = 100000000000l; //The number generated must have 12 digits to be in the UPC format
        private final double MAX = 999999999999l;

        /**
         *
         * Creates a Sample (Calling the Sample constructor)
         *
         * @param tt The test that the actor wished to created a sample of
         *
         * @return the sample created
         */

        public Sample CreateSample(TestType tt){

            String barcodeText = Double.toString(generateNumber());

            try {

                Barcode barcode = generateEAN13Barcode(barcodeText);
                generateEAN13BarcodeImage(barcode);
                return this.sm = new Sample(tt,barcode);

            } catch (Exception e) {
                e.printStackTrace();
            }

            return this.sm = null; //If the barcode isn't correcty generated the object must be null

        }

        /**
         * Validates a test type
         *
         * @param sm the object Sample
         * @return the validation of the Sample being created
         */

        public boolean validateSample(Sample sm){
            if(sm==null||listContain(sm)){
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

        public boolean listContain(Sample sm){

            if(this.list.contains(sm)){
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

        public boolean saveSample(){
            if(validateSample(sm)){
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

        public boolean listAdd(Sample sm){
            list.add(sm);
            return true;
        }

        /**
         * Replaces the element of the specified position in the list with the specified element.
         *
         * @param i the index of the element to replace
         * @return the element previously at the specified postion
         */

        public Sample getSample(int i){
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

    public Barcode generateEAN13Barcode(String barcodeText) throws Exception  {

        Barcode barcode = BarcodeFactory.createUPCA(barcodeText);

        return barcode;
    }

    public BufferedImage generateEAN13BarcodeImage(Barcode barcode) throws Exception {
        return BarcodeImageHandler.getImage(barcode);
    }

    public double generateNumber(){
        double random_bar = Math.floor(Math.random()*(MAX-MIN+1)+MIN);

        return random_bar;
     }

}