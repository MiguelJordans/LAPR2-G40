package app.domain.model;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;

import java.awt.image.BufferedImage;

public class Sample {

    private final double MIN = 100000000000l;
    private final double MAX = 999999999999l;

    private TestType tt;
    private Barcode barcode;

    public Sample(TestType ts){

        String barcodeText = Double.toString(generateNumber());

        this.tt=tt;

       /* try {
            this.barcode = generateEAN13Barcode(barcodeText);
            generateEAN13BarcodeImage(this.barcode);
        }
        catch (IllegalAccessException e){
            e.printStackTrace();
        }*/

    }

    public Barcode generateEAN13Barcode(String barcodeText) throws Exception  {

         Barcode barcode = BarcodeFactory.createEAN13(barcodeText);

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