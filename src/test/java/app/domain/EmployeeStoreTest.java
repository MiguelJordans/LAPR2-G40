package app.domain;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeStoreTest {

    @Test
    public void newEmployee() {
    }

    @Test
    public void validateEmployee() {

        //Arrange
        EmployeeStore store = new EmployeeStore();
        Employee emp = store.NewEmployee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","1234567", "specialistdoctor", "123456");
        store.listAdd(emp);

        //Act
        boolean expected = true;
        boolean actual = store.validateEmployee(emp);

        //Assert
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void validateEmployee2() {

        //Arrange
        EmployeeStore store = new EmployeeStore();
        Employee emp = store.NewEmployee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","1234567", "specialistdoctor", "123456");
        store.listAdd(emp);

        //Act
        boolean expected = false;
        boolean actual = store.validateEmployee(emp);

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void listContain() {

        //Arrange
        EmployeeStore store = new EmployeeStore();
        Employee emp = store.NewEmployee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","1234567", "specialistdoctor", "123456");

        //Act
        boolean expected = true;
        boolean actual = store.listContain(emp);

        //Assert
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void listContain2() {

        //Arrange
        EmployeeStore store = new EmployeeStore();
        Employee emp = store.NewEmployee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","1234567", "specialistdoctor", "123456");

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
        Employee emp = store.NewEmployee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","1234567", "specialistdoctor", "123456");
        store.listAdd(emp);

        //Act
        boolean expected = true;
        boolean actual = store.saveEmployee();

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void saveEmployee2() {
        //Arrange
        EmployeeStore store = new EmployeeStore();
        Employee emp = store.NewEmployee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","1234567", "specialistdoctor", "123456");
        store.listAdd(emp);

        //Act
        boolean expected = false;
        boolean actual = store.saveEmployee();

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void listAdd() {
        //Arrange
        EmployeeStore store = new EmployeeStore();
        Employee emp = store.NewEmployee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","1234567", "specialistdoctor", "123456");

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
        Employee emp = store.NewEmployee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","1234567", "specialistdoctor", "123456");

        //Act
        boolean expected = false;
        boolean actual = store.listAdd(emp);

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEmployee() {
        //Arrange
        EmployeeStore store = new EmployeeStore();
        Employee emp = store.NewEmployee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","1234567", "specialistdoctor", "123456");
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
            Employee emp = store.NewEmployee("Daniel", "3425 Stone Street", "dasc@gmail.com","01492235687", "DASC00001","1234567", "specialistdoctor", "123456");


            //Act
            Employee expected = emp;
            Employee actual = store.getEmp();

            //Assert
            Assert.assertEquals(expected, actual);


    }
}