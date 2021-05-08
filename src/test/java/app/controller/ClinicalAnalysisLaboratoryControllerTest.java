package app.controller;

import app.domain.Company;
import org.junit.Assert;
import org.junit.Test;

public class ClinicalAnalysisLaboratoryControllerTest {

    Company company = App.getInstance().getCompany();

    @Test
    public void testCreateClinicalAnalysisLaboratory() {

        ClinicalAnalysisLaboratoryController ctrl = new ClinicalAnalysisLaboratoryController();
    }

    @Test
    public void testCreateClinicalAnalysisLaboratoryWithTestType() {

        ClinicalAnalysisLaboratoryController ctrl = new ClinicalAnalysisLaboratoryController(company);
    }

    @Test
    public void createValidClinicalAnalysisLaboratory() {

        ClinicalAnalysisLaboratoryController ctrl = new ClinicalAnalysisLaboratoryController();
        ctrl.CreateClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");
    }

    @Test(expected = IllegalArgumentException.class)
    public void createInvalidClinicalAnalysisLaboratory() {

        ClinicalAnalysisLaboratoryController ctrl = new ClinicalAnalysisLaboratoryController();
        ctrl.CreateClinicalAnalysisLaboratory("LAB01", "+++++", "3425 Stone Street", "01492235687", "3245681253");
    }

    @Test
    public void saveClinicalAnalysisLaboratory() {

        ClinicalAnalysisLaboratoryController ctrl = new ClinicalAnalysisLaboratoryController();
        ctrl.CreateClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");

        Assert.assertTrue(ctrl.saveClinicalAnalysisLaboratory());
    }

    @Test(expected = IllegalArgumentException.class)
    public void saveInvalidClinicalAnalysisLaboratory() {

        ClinicalAnalysisLaboratoryController ctrl = new ClinicalAnalysisLaboratoryController();
        ctrl.CreateClinicalAnalysisLaboratory("LAB01", "+++++", "3425 Stone Street", "01492235687", "3245681253");

        Assert.assertTrue(ctrl.saveClinicalAnalysisLaboratory());
    }

    @Test
    public void getClinicalAnalysisLaboratory() {

        //Arrange
        ClinicalAnalysisLaboratoryController ctrl = new ClinicalAnalysisLaboratoryController();

        //Act
        ctrl.CreateClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");

        String expected = "LaboratoryID: " + "LAB01" + ", Name: " + "FirstCal" + ", Address: " + "3425 Stone Street" + ", Phone number: " + "01492235687" + ", TIN number: " + "3245681253";
        String actual = (ctrl.getCAL());

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getInvalidCLinicalAnalysisLaboratory() {

        ClinicalAnalysisLaboratoryController ctrl = new ClinicalAnalysisLaboratoryController();

        ctrl.CreateClinicalAnalysisLaboratory("LAB01", "+++++", "3425 Stone Street", "01492235687", "3245681253");

        String expected = "LaboratoryID: " + "LAB01" + ", Name: " + "+++++" + ", Address: " + "3425 Stone Street" + ", Phone number: " + "01492235687" + "TIN number: " + "3245681253";
        String actual = (ctrl.getCAL());

        Assert.assertEquals(expected, actual);
    }
}