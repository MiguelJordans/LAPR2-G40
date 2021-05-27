package app.domain.model;

import app.domain.shared.Constants;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;
import org.apache.commons.lang3.RandomStringUtils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BarcodeAdapter1 implements BarcodeAdapter {

    private Barcode barcode;
    private BufferedImage barcodeImage;
    private String barcodeText;

    public BarcodeAdapter1() {

    }

    public String generateBarcodeandBarcodeImage(String barcodeText,String filename){

        try {
            this.barcodeText=barcodeText;
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

    private Barcode generateUPCBarcode(String barcodeText) throws Exception  {

        Barcode barcode = BarcodeFactory.createUPCA(barcodeText);

        return barcode;
    }

    private BufferedImage generateUPCBarcodeImage(Barcode barcode) throws Exception {
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
