package app.domain.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeUserInformationTest {

    @Test
    public void generateClientUserInformation(){

        EmployeeUserInformation ci = new EmployeeUserInformation();

        ci.generateEmployeeInformation("Jordao","1201487@isep.ipp.pt","1234567890","SPECIALISTDOCTOR");

    }

}