package app.domain.model;

public class Sample {

    private Test tr;
    private String barcode;

    public Sample(Test tr,String barcode) {

        this.tr=tr;
        this.barcode=barcode;

    }

    public String getBarcode() {
        return barcode;
    }

    public Test getTr() {
        return tr;
    }

    public void setBarcode(String barcode) {

        this.barcode = barcode;
    }

    public void setTr(Test tr) {
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