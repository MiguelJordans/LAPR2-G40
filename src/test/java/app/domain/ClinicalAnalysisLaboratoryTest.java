package app.domain;

import org.junit.Assert;
import org.junit.Test;

public class ClinicalAnalysisLaboratoryTest {

    //  Sets --------------------------------------------------------------------

    @Test
    public void setLaboratoryID() {

        //Arrange
        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "143 Fore St", "01492235687", "3245681253");

        //Act
        String expected = "LAB02";
        cal.setLaboratoryID(expected);

        //Assert
        String actual = cal.getLaboratoryID();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setName() {

        //Arrange
        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");

        //Act
        String expected = "SecondCal";
        cal.setName(expected);

        //Assert
        String actual = cal.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAddress() {

        //Arrange
        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");

        //Act
        String expected = "3426 Stone Street";
        cal.setAddress(expected);

        //Assert
        String actual = cal.getAddress();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setPhoneNumber() {

        //Arrange
        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");

        //Act
        String expected = "08546329165";
        cal.setPhoneNumber(expected);

        //Assert
        String actual = cal.getPhoneNumber();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTINnumber() {

        //Arrange
        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");

        //Act
        String expected = "7426591354";
        cal.setTINnumber(expected);

        //Assert
        String actual = cal.getTINnumber();
        Assert.assertEquals(expected, actual);
    }

    //  CheckLaboratoryIDRules --------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void checkLaboratoryIDBlank() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory(" ", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkLaboratoryIDNotAlphanumeric() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("1a?.", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkLaboratoryIDTooManyChars() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("12aB8c", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");
    }

    //  CheckNameRules --------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void checkNameBlank() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", " ", "3425 Stone Street", "01492235687", "3245681253");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameTooManyChars() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstClinicalAnalysisLaboratory", "3425 Stone Street", "01492235687", "3245681253");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameNotOnlyLetters() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "651fvs6ef", "3425 Stone Street", "01492235687", "3245681253");
    }

    //  CheckAddressRules --------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void checkAddressBlank() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", " ", "01492235687", "3245681253");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkAddressTooManyChars() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "342892491625416825 Stone Street", "01492235687", "3245681253");
    }

    //  CheckPhoneNumberRules --------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberBlank() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", " ", "3245681253");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberTooManyChars() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "014922356870", "3245681253");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberNotOnlyNumbers() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01422dqas35", "3245681253");
    }

    //  CheckTINNumberRules --------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void checkTINNumberBlank() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "014922356870", "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTINNumberTooManyChars() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "32456812530");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTINNumberNotOnlyNumbers() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "326erfc813");
    }

    //  ToString --------------------------------------------------------------------

    @Test
    public void checkClinicalAnalysisLaboratoryToString() {

        //Arrange
        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");

        //Act
        String expected = "LaboratoryID: " + "LAB01" + ", Name: " + "FirstCal" + ", Address: " + "3425 Stone Street" + ", Phone number: " + "01492235687" + ", TIN number: " + "3245681253";

        String actual = cal.toString();

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getName(){

        //Arrange
        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "143 Fore St", "01492235687", "3245681253");

        //Act
        String expected = "FirstCal";

        //Assert
        String actual = cal.getName();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getLaboratoryID(){

        //Arrange
        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "143 Fore St", "01492235687", "3245681253");

        //Act
        String expected = "LAB01";

        //Assert
        String actual = cal.getLaboratoryID();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getAdress(){

        //Arrange
        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "143 Fore St", "01492235687", "3245681253");

        //Act
        String expected = "143 Fore St";

        //Assert
        String actual = cal.getAddress();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getPhoneNumber(){

        //Arrange
        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "143 Fore St", "01492235687", "3245681253");

        //Act
        String expected = "01492235687";

        //Assert
        String actual = cal.getPhoneNumber();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getTinNumber(){

        //Arrange
        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "143 Fore St", "01492235687", "3245681253");

        //Act
        String expected = "3245681253";

        //Assert
        String actual = cal.getTINnumber();
        Assert.assertEquals(expected, actual);

    }
}