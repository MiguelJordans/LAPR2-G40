package app.domain.model;

public class Sample {

    private Test tr;
    private String barcode;

    public Sample(Test tr,String barcode) {

        checkTest(tr);
        checkBarcode(barcode);

        this.tr=tr;
        this.barcode=barcode;

    }

    public void checkTest(Test tr){
        if(tr==null||tr.equals(null)) throw new NullPointerException("Test is null! Please choose a test that has atrributes!");

    }

    public void checkBarcode(String barcode){
        if (barcode==null||barcode.equals(null)) throw new NullPointerException("Barcode is null! Please verify the creation of the barcode!");
    }

    public String getBarcode() {
        return barcode;
    }

    public Test getTr() {
        return tr;
    }

    public void setBarcode(String barcode) {
        checkBarcode(barcode);
        this.barcode = barcode;
    }

    public void setTr(Test tr) {
        checkTest(tr);
        this.tr = tr;
    }

    @Override
    public String toString() {
        return "Sample {" +
                " Test ID=" + tr.getTestID() +
                ", Barcode=" + barcode +
                '}';
    }
}