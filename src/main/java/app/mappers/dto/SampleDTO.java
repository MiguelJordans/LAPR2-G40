package app.mappers.dto;

import app.domain.model.Test;

import java.time.LocalDate;

public class SampleDTO {

    private Test tr;
    private String barcode;
    private String date;

    /**
     * Constructor.
     * @param tr the test
     * @param barcode the barcode
     * @param date the date
     */
    public SampleDTO(Test tr, String barcode, String date) {
        this.tr = tr;
        this.barcode = barcode;
        this.date = date;
    }

    /**
     * Gets the barcode.
     * @return the barcode
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * Gets the test.
     * @return the test
     */
    public Test getTr() {
        return tr;
    }

    /**
     * Returns the textual description of the Sample in the format: test, barcode, date.
     * @return the Sample's characteristics
     */
    @Override
    public String toString() {
        return "SampleDTO{" +
                "TestID: " + tr.getTestID() +
                " ,Test description: " + tr.getTt().getDescription() +
                ", Barcode=" + barcode + ", Sample creation date: " + date +
                '}';
    }
}
