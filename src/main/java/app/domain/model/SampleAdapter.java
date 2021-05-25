package app.domain.model;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;

import java.awt.image.BufferedImage;

public class SampleAdapter {

    private Barcode barcode;

    private final double MIN = 10000000000l; //The number generated must have 12 digits to be in the UPC format
    private final double MAX = 99999999999l;


    public SampleAdapter() {

       // String barcodeText = Double.toString(generateNumber());

        String barcodeText = "11111111111"; //O generate não esta a retornar um número válido

        try {

            this.barcode = generateUPCBarcode(barcodeText);

        } catch (Exception e) {
            System.out.println("Barcode couldn't be created! Verify barcodeText!");
        }

    }

    public Barcode generateUPCBarcode(String barcodeText) throws Exception  {

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

    public Barcode getBarcode() {
        return barcode;
    }
}
