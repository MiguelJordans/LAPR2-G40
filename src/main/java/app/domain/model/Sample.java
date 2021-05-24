package app.domain.model;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;

import java.awt.image.BufferedImage;

public class Sample {

    private final double MIN = 100000000000l; //The number generated must have 12 digits to be in the UPC format
    private final double MAX = 999999999999l;

    private TestType tt;
    private Barcode barcode;

    public Sample(TestType ts,Barcode barcode) {

        this.tt=tt;
        this.barcode=barcode;

     /* try {
            this.barcode = generateEAN13Barcode(barcodeText);
            generateEAN13BarcodeImage(this.barcode);
        }
        catch (IllegalAccessException e){
            e.printStackTrace();
        }*/

    }

}