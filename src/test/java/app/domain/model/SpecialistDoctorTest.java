package app.domain.model;

import org.junit.Assert;
import org.junit.Test;

public class SpecialistDoctorTest {

    @Test
    public void createSpecialistDoctor(){
        SpecialistDoctor sp = new SpecialistDoctor("Jordao", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC001","1234567", "specialistdoctor","123456");
    }

    @Test
    public void createSpecialistDoctorNotNull(){
        SpecialistDoctor sp = new SpecialistDoctor("Jordao", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC001","1234567", "specialistdoctor","123456");

        Assert.assertNotNull(sp);
    }

    @Test
    public void createSpecialistDoctorNull(){
        SpecialistDoctor sp = null;

        Assert.assertNull(sp);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDoctorIndexNumberBlank() {
        SpecialistDoctor sp = new SpecialistDoctor("Jordao", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC001","1234567", "specialistdoctor","");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDoctorIndexNumberNotValid() {
        SpecialistDoctor sp = new SpecialistDoctor("Jordao", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC001","1234567", "specialistdoctor","1231231231231231231");
    }

    @Test
    public void setDoctorIndexNumber() {

        SpecialistDoctor sp = new SpecialistDoctor("Jordao", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC001","1234567", "specialistdoctor","123456");

        String expected = "999999";

        sp.setDoctorIndexNumber(expected);

    }

    @Test
    public void getDoctorIndexNumber() {

        SpecialistDoctor sp = new SpecialistDoctor("Jordao", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC001","1234567", "specialistdoctor","123456");

        String expected = "123456";

        String actual = sp.getDoctorIndexNumber();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testToString() {

        SpecialistDoctor sp = new SpecialistDoctor("Jordao", "3425 Stone Street", "dasc@gmail.com", "01492235687", "DASC001","1234567", "specialistdoctor","123456");

        String expected = "Employee{name='Jordao', address='3425 Stone Street', phoneNumber='01492235687', email='dasc@gmail.com', orgRole='specialistdoctor', employeeId='DASC001', socCode='1234567'}SpecialistDoctor{doctorIndexNumber='123456'}";

        String actual = sp.toString();

        Assert.assertEquals(expected,actual);

    }
}