package app.domain.model;

import app.ui.console.GeneratePassword;
import auth.AuthFacade;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SpecialistDoctorStoreTest {

    @Test
    public void newEmployee() {
    }

    @Test
    public void validateEmployee() {

        //Arrange
        SpecialistDoctorStore store = new SpecialistDoctorStore();
        SpecialistDoctor sp = store.newSpecialistDoctor("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "1234567", "specialistdoctor", "123456");
        store.listAdd(sp);

        //Act
        boolean expected = false;
        boolean actual = store.validateSpecialistDoctor(sp);

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void listContain() {

        //Arrange
        SpecialistDoctorStore store = new SpecialistDoctorStore();
        SpecialistDoctor sp = store.newSpecialistDoctor("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "1234567", "specialistdoctor", "123456");

        //Act
        boolean expected = false;
        boolean actual = store.listContain(sp);

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void saveEmployee2() {

        //Arrange
        SpecialistDoctorStore store = new SpecialistDoctorStore();
        SpecialistDoctor sp = store.newSpecialistDoctor("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "1234567", "specialistdoctor", "123456");

        //Act
        boolean expected = true;
        boolean actual = store.saveEmployee();

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void saveEmployee() {

        //Arrange
        SpecialistDoctorStore store = new SpecialistDoctorStore();
        SpecialistDoctor sp = store.newSpecialistDoctor("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "1234567", "specialistdoctor", "123456");
        store.listAdd(sp);

        //Act
        boolean expected = false;
        boolean actual = store.saveEmployee();

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void listAdd() {
        //Arrange
        SpecialistDoctorStore store = new SpecialistDoctorStore();
        SpecialistDoctor sp = store.newSpecialistDoctor("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "1234567", "specialistdoctor", "123456");

        //Act
        boolean expected = true;
        boolean actual = store.listAdd(sp);

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEmployee() {

        //Arrange
        SpecialistDoctorStore store = new SpecialistDoctorStore();
        SpecialistDoctor sp = store.newSpecialistDoctor("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "1234567", "specialistdoctor", "123456");
        store.listAdd(sp);

        //Act
        SpecialistDoctor expected = sp;
        SpecialistDoctor actual = store.getSpecialistDoctor(0);

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEmp() {

        //Arrange
        SpecialistDoctorStore store = new SpecialistDoctorStore();
        SpecialistDoctor sp = store.newSpecialistDoctor("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "1234567", "specialistdoctor", "123456");
        store.listAdd(sp);

        //Act
        SpecialistDoctor expected = sp;
        SpecialistDoctor actual = store.getSD();

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getSpecialistDoctorList() {

        //Arrange
        SpecialistDoctorStore store = new SpecialistDoctorStore();
        SpecialistDoctor sp = store.newSpecialistDoctor("Daniel", "3425 Stone Street", "dasc@gmail.com", "01492235687", "1234567", "specialistdoctor", "123456");
        store.listAdd(sp);

        List<SpecialistDoctor> sdList = store.getSpecialistDoctorList();

        Assert.assertNotNull(sdList);

    }

    @Test
    public void generateUserInformation() {


        String email = "email@hotmail.com";
        String name = "Jordao";
        String role = "SPECIALIST_DOCTOR";

        SpecialistDoctorStore store = new SpecialistDoctorStore();

        store.generateUserInformation(name,email,role);

    }

}
