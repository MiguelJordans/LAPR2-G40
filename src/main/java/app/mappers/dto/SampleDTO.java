package app.mappers.dto;

import app.domain.model.Test;

public class SampleDTO {

    private Test tr;
    private String barcode;

    public SampleDTO(Test tr,String barcode){

        this.tr=tr;
        this.barcode=barcode;

    }

    public String getBarcode() {
        return barcode;
    }

    public Test getTr() {
        return tr;
    }

    @Override
    public String toString() {
        return "SampleDTO{" +
                "tr=" + tr +
                ", barcode='" + barcode + '\'' +
                '}';
    }

}
