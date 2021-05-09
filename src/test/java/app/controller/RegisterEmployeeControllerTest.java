package app.controller;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegisterEmployeeControllerTest {

    @Test
    public void testRegisterEmployeeController() {

        RegisterEmployeeController emp = new RegisterEmployeeController();
    }



    @Test
    public void employee() {

            RegisterEmployeeController ctrl = new RegisterEmployeeController();
            ctrl.Employee("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001", "1234567", "specialistdoctor", "123456");
    }

    @Test(expected = IllegalArgumentException.class)
    public void employeeInvalid() {

        RegisterEmployeeController ctrl = new RegisterEmployeeController();
        ctrl.Employee("++++++", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001", "1234567", "specialistdoctor", "123456");
    }


    @Test
    public void saveEmployee() {
        RegisterEmployeeController ctrl = new RegisterEmployeeController();
        ctrl.Employee("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001", "1234567", "specialistdoctor", "123456");

        Assert.assertTrue(ctrl.SaveEmployee());
    }

    @Test(expected = IllegalArgumentException.class)
    public void saveInvalidEmployee() {
        RegisterEmployeeController ctrl = new RegisterEmployeeController();
        ctrl.Employee("++++++", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001", "1234567", "specialistdoctor", "123456");

        Assert.assertTrue(ctrl.SaveEmployee());
    }

    @Test
    public void getEmp() {
        RegisterEmployeeController ctrl = new RegisterEmployeeController();

        ctrl.Employee("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001", "1234567", "specialistdoctor", "123456");


        String expected = "name: " + "Daniel" + ", address: " + "3425 Stone Street" + ", email: " + "dasc@gmail.com" + ", Phone number: " + "01492235687" + "employeeId: " + "DASC00001" + ", socCode: " + "1234567" + ", orgRole: " + "specialistdoctor" + ", doctorIndexNumber: " + "123456";
        String actual = (ctrl.getEmp());

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getInvalidEmp() {

        RegisterEmployeeController ctrl = new RegisterEmployeeController();

        ctrl.Employee("++++++", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC00001", "1234567", "specialistdoctor", "123456");


        String expected = "name: " + "++++++" + ", address: " + "3425 Stone Street" + ", email: " + "dasc@gmail.com" + ", Phone number: " + "01492235687" + "employeeId: " + "DASC00001" + ", socCode: " + "1234567" + ", orgRole: " + "specialistdoctor" + ", doctorIndexNumber: " + "123456";
        String actual = (ctrl.getEmp());

        Assert.assertEquals(expected, actual);
    }
}