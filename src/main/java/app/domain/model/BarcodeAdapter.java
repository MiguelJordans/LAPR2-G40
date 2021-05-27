package app.domain.model;


public interface BarcodeAdapter {

    String generateBarcodeandBarcodeImage(String barcodeText,String filename);

    String getBarcode();

}
