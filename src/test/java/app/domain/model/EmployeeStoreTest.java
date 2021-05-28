package app.domain.model;

import app.domain.stores.EmployeeStore;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class EmployeeStoreTest {

    @Test
    public void newEmployee() {
    }

    @Test
    public void validateEmployee() {

        //Arrange
        EmployeeStore store = new EmployeeStore();
        Employee emp = store.newEmployee("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "1234567", "specialistdoctor");
        store.listAdd(emp);

        //Act
        boolean expected = false;
        boolean actual = store.validateEmployee(emp);

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void validateEmployee2() {

        //Arrange
        EmployeeStore store = new EmployeeStore();
        Employee emp = store.newEmployee("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "1234567", "specialistdoctor");
        store.listAdd(emp);

        //Act
        boolean expected = false;
        boolean actual = store.validateEmployee(emp);

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void validateEmployee3() {

        //Arrange
        EmployeeStore store = new EmployeeStore();
        Employee emp = store.newEmployee("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "1234567", "specialistdoctor");

        //Act
        boolean expected = true;
        boolean actual = store.validateEmployee(emp);

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void listContain() {

        //Arrange
        EmployeeStore store = new EmployeeStore();
        Employee emp = store.newEmployee("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "1234567", "specialistdoctor");

        //Act
        boolean expected = false;
        boolean actual = store.listContain(emp);

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void listContain2() {

        //Arrange
        EmployeeStore store = new EmployeeStore();
        Employee emp = store.newEmployee("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "1234567", "specialistdoctor");

        //Act
        boolean expected = false;
        boolean actual = store.listContain(emp);

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void saveEmployee() {
        //Arrange
        EmployeeStore store = new EmployeeStore();
        Employee emp = store.newEmployee("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "1234567", "specialistdoctor");
        store.listAdd(emp);

        //Act
        boolean expected = false;
        boolean actual = store.saveEmployee();

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void saveEmployee2() {
        //Arrange
        EmployeeStore store = new EmployeeStore();
        Employee emp = store.newEmployee("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "1234567", "specialistdoctor");
        store.listAdd(emp);

        //Act
        boolean expected = false;
        boolean actual = store.saveEmployee();

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void saveEmployee3() {
        //Arrange
        EmployeeStore store = new EmployeeStore();
        Employee emp = store.newEmployee("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "1234567", "specialistdoctor");

        //Act
        boolean expected = true;
        boolean actual = store.saveEmployee();

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void listAdd() {
        //Arrange
        EmployeeStore store = new EmployeeStore();
        Employee emp = store.newEmployee("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "1234567", "specialistdoctor");

        //Act
        boolean expected = true;
        boolean actual = store.listAdd(emp);

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void listAdd2() {
        //Arrange
        EmployeeStore store = new EmployeeStore();
        Employee emp = store.newEmployee("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "1234567", "specialistdoctor");

        //Act
        boolean expected = true;
        boolean actual = store.listAdd(emp);

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEmployee() {
        //Arrange
        EmployeeStore store = new EmployeeStore();
        Employee emp = store.newEmployee("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "1234567", "specialistdoctor");
        store.listAdd(emp);

        //Act
        Employee expected = emp;
        Employee actual = store.getEmployee(0);

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEmp() {

        //Arrange
        EmployeeStore store = new EmployeeStore();
        Employee emp = store.newEmployee("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "1234567", "specialistdoctor");

        //Act
        Employee expected = emp;
        Employee actual = store.getEmp();

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void generateUserInformation() {


        String email = "email@hotmail.com";
        String name = "Jordao";
        String role = "SPECIALIST_DOCTOR";

        EmployeeStore store = new EmployeeStore();

        store.generateUserInformation(name,email,role);

    }

    @Test
    public void getEmployeeList() {
        //Arrange
        EmployeeStore store = new EmployeeStore();
        Employee emp = store.newEmployee("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "1234567", "specialistdoctor");
        store.saveEmployee();

        List<Employee> employeeList = store.getEmployeeList();

        Assert.assertNotNull(employeeList);

    }

}