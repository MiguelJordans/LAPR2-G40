package app.mappers.dto;

import app.domain.model.Test;

import java.time.LocalDate;

public class SampleDTO {

    private Test tr;
    private String barcode;
    private LocalDate date;

    public SampleDTO(Test tr,String barcode,LocalDate date){

        this.tr=tr;
        this.barcode=barcode;
        this.date=date;

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
                "TestID: " + tr.getTestID() +
                " ,Test description: "+tr.getTt().getDescription()+
                ", Barcode=" + barcode+ ", Sample creation date: "+date+
                '}';
    }

}
