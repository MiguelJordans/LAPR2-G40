package app.domain.model;

import net.sourceforge.barbecue.Barcode;

public class Sample {

    private TestType tr;
    private Barcode barcode;

    public Sample(TestType tr,Barcode barcode) {

        checkTest(tr);
        checkBarcode(barcode);

        this.tr=tr;
        this.barcode=barcode;

    }

    public void checkTest(TestType tr){
        if(tr==null||tr.equals(null)) throw new NullPointerException("Test is null! Please choose a test that has atrributes!");

    }

    public void checkBarcode(Barcode barcode){
        if (barcode==null||barcode.equals(null)) throw new NullPointerException("Barcode is null! Please verify the creation of the barcode!");
    }

    public Barcode getBarcode() {
        return barcode;
    }

    public TestType getTr() {
        return tr;
    }

    public void setBarcode(Barcode barcode) {
        this.barcode = barcode;
    }

    public void setTr(TestType tr) {
        this.tr = tr;
    }

    @Override
    public String toString() {
        return "Sample {" +
                "Test=" + tr +
                ", Barcode=" + barcode +
                '}';
    }
}