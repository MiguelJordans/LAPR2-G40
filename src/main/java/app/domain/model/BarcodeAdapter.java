package app.domain.model;


public interface BarcodeAdapter {

    /**
     * Generates the barcode and the barcode image.
     * @param barcodeText the barcode text
     * @param filename the filename
     * @return the barcode and barcode image
     */
    String generateBarcodeandBarcodeImage(String barcodeText,String filename);

    /**
     * Gets the barcode.
     * @return the barcode
     */
    String getBarcode();

}
