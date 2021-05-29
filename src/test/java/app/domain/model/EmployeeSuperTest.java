package app.domain.model;

import org.junit.Assert;
import org.junit.Test;


public class EmployeeSuperTest {

//CheckNameRules

    @Test(expected = IllegalArgumentException.class)
    public void checkNameBlank() {

        Employee emp = new Employee("", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567", "specialistdoctor");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameTooManyChars() {

        Employee emp = new Employee("FirstClinicalAnalysisLaboratory", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567", "specialistdoctor");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameNotOnlyLetters() {

        Employee emp = new Employee("651fvs6ef","3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567", "specialistdoctor");
    }

//CheckDoctorIndexNumber

    @Test(expected = IllegalArgumentException.class)
    public void checkDOCBlank(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","1234567", "specialistdoctor");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDOCSize(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","1234567", "specialistdoctor");
    }

    @Test
    public void checkDOC(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC001","1234567", "employee");

    }

//CheckOrgRole

    @Test(expected = IllegalArgumentException.class)
    public void checkORBlank(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","1234567", "");

    }

    @Test
    public void checkORTypes(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC0001","1234567", "employee");
    }

    @Test
    public void checkORTypes2(){
        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC0001","1234567", "employee");

    }

    @Test (expected = IllegalArgumentException.class)
    public void checkORChar(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","1234567", "1");
    }

//CheckAddressRules

    @Test (expected = IllegalArgumentException.class)
    public void checkAdBlank(){

        Employee emp = new Employee("Daniel", "", "dasc@gmail.com","01492235687", "DASC00001","1234567", "specialistdoctor");
    }

    @Test (expected = IllegalArgumentException.class)
    public void checkAdLength(){

        Employee emp = new Employee("Daniel", "3425 Stone Street 12345678901234567", "dasc@gmail.com","01492235687", "DASC00001","1234567", "specialistdoctor");
    }


//ChekEmailRules

    @Test (expected = IllegalArgumentException.class)
    public void checkEmailBlank(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "","01492235687", "DASC00001","1234567", "specialistdoctor");

    }

    @Test (expected = IllegalArgumentException.class)
    public void checkEmailIsInvalid(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "Not an email","01492235687", "DASC00001","1234567", "specialistdoctor");
    }

//CheckPhoneNumberRules

    @Test (expected = IllegalArgumentException.class)
    public void checkPhoneNumberBlank() {

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","", "DASC00001","1234567", "specialistdoctor");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberTooManyChars() {

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","014922356871234123", "DASC00001","1234567", "specialistdoctor");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberNotOnlyNumbers() {

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","0d149a5b687", "DASC00001","1234567", "specialistdoctor");
    }



//CheckEmployeeIDRules

    @Test (expected = IllegalArgumentException.class)
    public void checkEmpIDBlank() {

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "","1234567", "specialistdoctor");

    }

    @Test
    public void checkEmpIDLength(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC000011234","1234567", "specialistdoctor");

    }


//CheckSOCCode
    @Test (expected = IllegalArgumentException.class)
    public void checkSOCBlank(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","", "specialistdoctor");

    }



    @Test (expected = IllegalArgumentException.class)
    public void checkSOCLength(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","1234567123", "specialistdoctor");

    }

    @Test (expected = IllegalArgumentException.class)
    public void checkSOCIsInvalid(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","a234567", "specialistdoctor");

    }

    @Test
    public void setOrgRole() {
        //Arrange
        Employee emp = new Employee("FirstCal", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC0001","1234567","specialistdoctor");

        //Act
        String expected = "specialistdoctor";
        emp.setOrgRole(expected);

        //Assert
        String actual = emp.getOrgRole();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        //Arrange
        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC0001","1234567", "employee");

        //Act
        String expected = "SecondCal";
        emp.setName(expected);

        //Assert
        String actual = emp.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAddress() {
        //Arrange
        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC0001","1234567", "employee");

        //Act
        String expected = "3426 Stone Street";
        emp.setAddress(expected);

        //Assert
        String actual = emp.getAddress();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setEmail() {
        //Arrange
        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC0001","1234567", "employee");

        //Act
        String expected = "dasc@gmail.com";
        emp.setEmail(expected);

        //Assert
        String actual = emp.getEmail();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setPhoneNumber() {
        //Arrange
        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC0001","1234567", "employee");

        //Act
        String expected = "01492235687";
        emp.setPhoneNumber(expected);

        //Assert
        String actual = emp.getPhoneNumber();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setEmployeeId() {
        //Arrange
        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC0001","1234567", "employee");

        //Act
        String expected = "DASC00001";
        emp.setEmployeeId(expected);

        //Assert
        String actual = emp.getEmployeeId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setSocCode() {
        //Arrange
        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC0001","1234567", "employee");

        //Act
        String expected = "1234567";
        emp.setSocCode(expected);

        //Assert
        String actual = emp.getSocCode();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getName(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC0001","1234567", "employee");

        String expected = "Daniel";

        String actual = emp.getName();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getAdress(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC0001","1234567", "employee");

        String expected = "3425 Stone Street";

        String actual = emp.getAddress();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getEmail(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC0001","1234567", "employee");

        String expected = "dasc@gmail.com";

        String actual = emp.getEmail();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getPhoneNumber(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC0001","1234567", "employee");

        String expected = "01492235687";

        String actual = emp.getPhoneNumber();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getEmployeeId(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC0001","1234567", "employee");

        String expected = "DASC0001";

        String actual = emp.getEmployeeId();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getSocCode(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC0001","1234567", "employee");

        String expected = "1234567";


        String actual = emp.getSocCode();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void EmployeeToString(){

        Employee emp = new Employee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC0001","1234567", "employee");

        String expected = emp.toString();

        String actual = emp.toString();

        Assert.assertEquals(expected, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkOrgRoleBlank() {

        Employee emp = new Employee("AAAAA", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567", "");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkOrgRoleNull() {

        Employee emp = new Employee("AAAAA", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","1234567", "");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkSocRoleBlank() {

        Employee emp = new Employee("AAAAA", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","", "YAH");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkSocRoleTooManyChars() {

        Employee emp = new Employee("AAAAA", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","12345678", "YAH");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkSocRoleInvalid() {

        Employee emp = new Employee("AAAAA", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001","****", "YAH");

    }


}