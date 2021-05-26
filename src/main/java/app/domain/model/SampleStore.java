package app.domain.model;

import net.sourceforge.barbecue.Barcode;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SampleStore {

        static List<Sample> list = new ArrayList<>();
        static List<Sample> sampleListTemporary = new ArrayList<>();
        SampleAdapter sa = new SampleAdapter();
        BufferedImage barcodeImage;
        Barcode barcode;
        Sample sm;

        /**
         *
         * Creates a Sample (Calling the Sample constructor)
         *
         * @param tt The test that the actor wished to created a sample of
         *
         * @return the sample created
         */

        public Sample CreateSample(TestType tt){

            barcode = sa.getBarcode();

            return this.sm = new Sample(tt,barcode);

        }

        public void createTemporaryList(){
            sampleListTemporary.add(sm);
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

        public List<Sample> showList(){
            for(Sample sm1 : list){
                System.out.println(sm1.toString());
            }
            return list;
        }

        public void barcodeImage() throws IOException {

            try {
                barcodeImage = sa.generateUPCBarcodeImage(barcode);
            } catch (Exception e){
                System.out.println("ERROR : Couldn't create the image!");
            }

            String filename = "BarcodeImage_"+sm.getTr().getTestCode()+"_"+sa.getBarcodeText();

            File outputfile = new File("Barcodes\\"+filename+".jpg");

            ImageIO.write(barcodeImage, "jpg", outputfile);

        }

}