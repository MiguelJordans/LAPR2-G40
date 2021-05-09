package app.domain;

import org.junit.Assert;
import org.junit.Test;

public class ClinicalAnalysisLaboratoryTest {

    //  Gets --------------------------------------------------------------------

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
    public void getAddress(){

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
    public void setTinNumber() {

        //Arrange
        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");

        //Act
        String expected = "7426591354";
        cal.setTinNumber(expected);

        //Assert
        String actual = cal.getTINnumber();
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ClinicalAnalysisLaboratoryNull() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory(null, null,null,null,null);
    }


    //  CheckLaboratoryIDRules --------------------------------------------------------------------

    @Test
    public void ValidLaboratoryID() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");
    }

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

    @Test
    public void ValidName() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameBlank() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", " ", "3425 Stone Street", "01492235687", "3245681253");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameTooManyChars() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstClinicalAnalysisLaboratory", "3425 Stone Street", "01492235687", "3245681253");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameNotOnlyLetters1() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "651fvs6DN", "3425 Stone Street", "01492235687", "3245681253");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameNotOnlyLetters2() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "++++", "3425 Stone Street", "01492235687", "3245681253");
    }

    @Test
    public void checkNameNotOnlyLetters3() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "aaa", "3425 Stone Street", "01492235687", "3245681253");
    }

    @Test
    public void checkNameNotOnlyLetters4() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "zzz", "3425 Stone Street", "01492235687", "3245681253");
    }


    //  CheckAddressRules --------------------------------------------------------------------

    @Test
    public void ValidAddress() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkAddressBlank() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", " ", "01492235687", "3245681253");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkAddressTooManyChars() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "342892491625416825 Stone Street", "01492235687", "3245681253");
    }


    //  CheckPhoneNumberRules --------------------------------------------------------------------

    @Test
    public void ValidPhoneNumber() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberBlank() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", " ", "3245681253");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberTooManyChars() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "014922356870", "3245681253");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberNotOnlyNumbers1() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01422dqas35", "3245681253");
    }

    @Test
    public void checkPhoneNumberNotOnlyNumbers2() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "+++++++++++", "3245681253");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberNotOnlyNumbers3() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "aaaaaaaaaaa", "3245681253");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberNotOnlyNumbers4() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "zzzzzzzzzzz", "3245681253");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberNotOnlyNumbers5() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "AAAAAAAAAAA", "3245681253");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberNotOnlyNumbers6() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "ZZZZZZZZZZZ", "3245681253");
    }


    //  CheckTinNumberRules --------------------------------------------------------------------

    @Test
    public void ValidTinNumber() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTinNumberBlank() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "014922356870", " ");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTinNumberTooManyChars() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "32456812530");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTinNumberNotOnlyNumbers1() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "326erFC813");
    }

    @Test
    public void checkTinNumberNotOnlyNumbers2() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "??????????");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTinNumberNotOnlyNumbers3() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "aaaaaaaaaa");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTinNumberNotOnlyNumbers4() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "AAAAAAAAAA");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTinNumberNotOnlyNumbers5() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "zzzzzzzzzz");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTinNumberNotOnlyNumbers6() {

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "ZZZZZZZZZZ");
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
}