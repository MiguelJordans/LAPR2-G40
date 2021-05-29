package app.domain.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ClinicalAnalysisLaboratoryTest {

    //  Gets --------------------------------------------------------------------

    @Test
    public void getLaboratoryID(){

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        //Arrange
        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "143 Fore St", "01492235687", "3245681253",ttList);

        //Act
        String expected = "LAB01";

        //Assert
        String actual = cal.getLaboratoryID();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getName(){

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        //Arrange
        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "143 Fore St", "01492235687", "3245681253",ttList);

        //Act
        String expected = "FirstCal";

        //Assert
        String actual = cal.getName();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getAddress(){

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        //Arrange
        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "143 Fore St", "01492235687", "3245681253",ttList);

        //Act
        String expected = "143 Fore St";

        //Assert
        String actual = cal.getAddress();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getPhoneNumber(){

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        //Arrange
        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "143 Fore St", "01492235687", "3245681253",ttList);

        //Act
        String expected = "01492235687";

        //Assert
        String actual = cal.getPhoneNumber();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getTinNumber(){

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        //Arrange
        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "143 Fore St", "01492235687", "3245681253",ttList);

        //Act
        String expected = "3245681253";

        //Assert
        String actual = cal.getTINnumber();
        Assert.assertEquals(expected, actual);

    }


    //  Sets --------------------------------------------------------------------

    @Test
    public void setLaboratoryID() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        //Arrange
        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "143 Fore St", "01492235687", "3245681253",ttList);

        //Act
        String expected = "LAB02";
        cal.setLaboratoryID(expected);

        //Assert
        String actual = cal.getLaboratoryID();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setName() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        //Arrange
        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253",ttList);

        //Act
        String expected = "SecondCal";
        cal.setName(expected);

        //Assert
        String actual = cal.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAddress() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        //Arrange
        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253",ttList);

        //Act
        String expected = "3426 Stone Street";
        cal.setAddress(expected);

        //Assert
        String actual = cal.getAddress();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setPhoneNumber() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        //Arrange
        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253",ttList);

        //Act
        String expected = "08546329165";
        cal.setPhoneNumber(expected);

        //Assert
        String actual = cal.getPhoneNumber();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTinNumber() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        //Arrange
        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253",ttList);

        //Act
        String expected = "7426591354";
        cal.setTinNumber(expected);

        //Assert
        String actual = cal.getTINnumber();
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ClinicalAnalysisLaboratoryNull() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory(null, null,null,null,null,null);
    }


    //  CheckLaboratoryIDRules --------------------------------------------------------------------

    @Test
    public void ValidLaboratoryID() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253",ttList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkLaboratoryIDBlank() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory(" ", "FirstCal", "3425 Stone Street", "01492235687", "3245681253",ttList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkLaboratoryIDNotAlphanumeric() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("1a?.", "FirstCal", "3425 Stone Street", "01492235687", "3245681253",ttList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkLaboratoryIDTooManyChars() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("12aB8c", "FirstCal", "3425 Stone Street", "01492235687", "3245681253",ttList);
    }


    //  CheckNameRules --------------------------------------------------------------------

    @Test
    public void ValidName() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253",ttList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameBlank() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", " ", "3425 Stone Street", "01492235687", "3245681253",ttList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameTooManyChars() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstClinicalAnalysisLaboratory", "3425 Stone Street", "01492235687", "3245681253",ttList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameNotOnlyLetters1() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "651fvs6DN", "3425 Stone Street", "01492235687", "3245681253",ttList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameNotOnlyLetters2() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "++++", "3425 Stone Street", "01492235687", "3245681253",ttList);
    }

    @Test
    public void checkNameNotOnlyLetters3() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "aaa", "3425 Stone Street", "01492235687", "3245681253",ttList);
    }

    @Test
    public void checkNameNotOnlyLetters4() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "zzz", "3425 Stone Street", "01492235687", "3245681253",ttList);
    }


    //  CheckAddressRules --------------------------------------------------------------------

    @Test
    public void ValidAddress() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253",ttList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkAddressBlank() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", " ", "01492235687", "3245681253",ttList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkAddressTooManyChars() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "342892491625416825 Stone Street", "01492235687", "3245681253",ttList);
    }


    //  CheckPhoneNumberRules --------------------------------------------------------------------

    @Test
    public void ValidPhoneNumber() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253",ttList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberBlank() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", " ", "3245681253",ttList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberTooManyChars() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "014922356870", "3245681253",ttList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberNotOnlyNumbers1() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01422dqas35", "3245681253",ttList);
    }

    @Test
    public void checkPhoneNumberNotOnlyNumbers2() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "+++++++++++", "3245681253",ttList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberNotOnlyNumbers3() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "aaaaaaaaaaa", "3245681253",ttList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberNotOnlyNumbers4() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "zzzzzzzzzzz", "3245681253",ttList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberNotOnlyNumbers5() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "AAAAAAAAAAA", "3245681253",ttList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberNotOnlyNumbers6() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "ZZZZZZZZZZZ", "3245681253",ttList);
    }


    //  CheckTinNumberRules --------------------------------------------------------------------

    @Test
    public void ValidTinNumber() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253",ttList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTinNumberBlank() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "014922356870", "",ttList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTinNumberTooManyChars() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "32456812530",ttList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTinNumberNotOnlyNumbers1() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "326erFC813",ttList);
    }

    @Test
    public void checkTinNumberNotOnlyNumbers2() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "??????????",ttList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTinNumberNotOnlyNumbers3() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "aaaaaaaaaa",ttList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTinNumberNotOnlyNumbers4() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "AAAAAAAAAA",ttList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTinNumberNotOnlyNumbers5() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "zzzzzzzzzz",ttList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTinNumberNotOnlyNumbers6() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "ZZZZZZZZZZ",ttList);
    }


    //  ToString --------------------------------------------------------------------

    @Test
    public void checkClinicalAnalysisLaboratoryToString() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        //Arrange
        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253",ttList);

        //Act
        String expected = "LaboratoryID: " + "LAB01" + ", Name: " + "FirstCal" + ", Address: " + "3425 Stone Street" + ", Phone number: " + "01492235687" + ", TIN number: " + "3245681253";

        String actual = cal.toString();

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTestList(){
        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "1234567890",ttList);

        List<TestType> testTypeList = cal.getTtList();
    }

    @Test
    public void setTestList(){
        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        ClinicalAnalysisLaboratory cal = new ClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "1234567890",ttList);

        List<TestType> testTypeList = cal.getTtList();

        cal.setTtList(testTypeList);

    }

}