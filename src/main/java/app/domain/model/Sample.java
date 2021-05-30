package app.domain.model;

import java.time.LocalDate;

public class Sample {

    private Test tr;
    private String barcode;
    private String date;

    public Sample(Test tr,String barcode,String date) {

        this.tr=tr;
        this.barcode=barcode;
        this.date= date;

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

    public String getDate() {
        return date;
    }

    public void setTr(Test tr) {
        this.tr = tr;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "tr=" + tr +
                ", barcode='" + barcode + '\'' +
                ", date=" + date +
                '}';
    }
}