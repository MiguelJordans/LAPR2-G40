package app.domain.model;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;
import org.apache.commons.lang3.RandomStringUtils;

import java.awt.image.BufferedImage;


public class SampleAdapter {

    private Barcode barcode;
    private BufferedImage barcodeImage;

    private final double MIN = 10000000000l; //The number generated must have 12 digits to be in the UPC format
    private final double MAX = 99999999999l;


    public SampleAdapter() {

        String barcodeText = generateNumber();


       // String barcodeText1 = "11111111111"; //O generate não esta a retornar um número válido

        try {

            this.barcode = generateUPCBarcode(barcodeText);
            this.barcodeImage = generateUPCBarcodeImage(barcode);

        } catch (Exception e) {
            System.out.println("Barcode couldn't be created! Verify barcodeText!");
        }

    }

    public Barcode generateUPCBarcode(String barcodeText) throws Exception  {

        Barcode barcode = BarcodeFactory.createUPCA(barcodeText);

        return barcode;
    }

    public BufferedImage generateUPCBarcodeImage(Barcode barcode) throws Exception {
        return BarcodeImageHandler.getImage(barcode);
    }

    public String generateNumber(){

        String random_bar = RandomStringUtils.randomNumeric(11);


        return random_bar;
    }

    public Barcode getBarcode() {
        return barcode;
    }
}
