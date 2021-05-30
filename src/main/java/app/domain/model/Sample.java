package app.domain.model;

import java.time.LocalDate;

public class Sample {

    private Test tr;
    private String barcode;
    private LocalDate date;

    public Sample(Test tr,String barcode) {

        this.tr=tr;
        this.barcode=barcode;
        this.date= LocalDate.now();

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

    public LocalDate getDate() {
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