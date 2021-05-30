package app.domain.model;

public class Sample {

    private Test tr;
    private String barcode;
    private String date;

    /**
     * Constructor.
     * @param tr the test
     * @param barcode the barcode
     * @param date the date
     */
    public Sample(Test tr, String barcode, String date) {
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
     * Gets the date.
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * Modifies the barcode.
     * @param barcode the barcode
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    /**
     * Modifies the test.
     * @param tr the test
     */
    public void setTr(Test tr) {
        this.tr = tr;
    }

    /**
     * Returns the textual description of the Sample in the format: test, barcode, date.
     * @return the Sample's characteristics
     */
    @Override
    public String toString() {
        return "Sample{" +
                "tr=" + tr +
                ", barcode='" + barcode + '\'' +
                ", date=" + date +
                '}';
    }
}