package app.domain.model;

import app.domain.shared.Constants;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;
import net.sourceforge.barbecue.output.OutputException;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BarcodeAdapter1 implements BarcodeAdapter {

    private Barcode barcode;
    private BufferedImage barcodeImage;

    public BarcodeAdapter1() {
      //Object created in order to create a barcode
    }

    public String generateBarcodeandBarcodeImage(String barcodeText,String filename){

        try {

            this.barcode = generateUPCBarcode(barcodeText);

        } catch (Exception e) {
            System.out.println("Barcode couldn't be created! Verify barcodeText!");
        }

        generateBarcodeImage(this.barcode,filename);

        return barcode.getData();

    }

    private void generateBarcodeImage(Barcode barcode,String filename){

        try{
            this.barcodeImage = generateUPCBarcodeImage(barcode);
        } catch (Exception e){
            System.out.println("Barcode image couldn't be created! Verify the barcode!");
        }
        try{
            barcodeImage(barcodeImage,filename);
        } catch (IOException e){
            e.getMessage();
            System.out.println("Image couldn't be created! Please check the integrity of the sample!");
        }

    }

    private Barcode generateUPCBarcode(String barcodeText) throws BarcodeException {

        return BarcodeFactory.createUPCA(barcodeText);
    }

    private BufferedImage generateUPCBarcodeImage(Barcode barcode) throws OutputException {
        return BarcodeImageHandler.getImage(barcode);
    }

    public String getBarcode() {
        return barcode.getData();
    }

    private void barcodeImage(BufferedImage barcodeImage,String filename) throws IOException {

        File outputfile = new File(Constants.PATH+filename+".jpg");

        ImageIO.write(barcodeImage, "jpg", outputfile);

    }

}
