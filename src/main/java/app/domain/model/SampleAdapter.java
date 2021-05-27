package app.domain.model;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;
import org.apache.commons.lang3.RandomStringUtils;

import java.awt.image.BufferedImage;


public class SampleAdapter {

    private Barcode barcode;
    private BufferedImage barcodeImage;
    private String barcodeText;

    public SampleAdapter() {

    }

    public Barcode generateBarcode(String barcodeText){

        try {
            this.barcodeText=barcodeText;
            this.barcode = generateUPCBarcode(barcodeText);

        } catch (Exception e) {
            System.out.println("Barcode couldn't be created! Verify barcodeText!");
        }

        return barcode;

    }

    public BufferedImage generateBarcodeImage(Barcode barcode){

        try{
            this.barcodeImage = generateUPCBarcodeImage(barcode);
        } catch (Exception e){
            System.out.println("Barcode image couldn't be created! Verify the barcode!");
        }
        return barcodeImage;
    }

    public Barcode generateUPCBarcode(String barcodeText) throws Exception  {

        Barcode barcode = BarcodeFactory.createUPCA(barcodeText);

        return barcode;
    }

    public BufferedImage generateUPCBarcodeImage(Barcode barcode) throws Exception {
        return BarcodeImageHandler.getImage(barcode);
    }

    public Barcode getBarcode() {
        return barcode;
    }

    public String getBarcodeText() {
        return barcodeText;
    }
}
