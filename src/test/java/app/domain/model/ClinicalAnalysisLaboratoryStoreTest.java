package app.domain.model;

import org.junit.Assert;
import org.junit.Test;

public class ClinicalAnalysisLaboratoryStoreTest {

    @Test
    public void createClinicalAnalysisLaboratory() {
    }

    @Test
    public void validateClinicalAnalysisLaboratory() {

        //Arrange
        ClinicalAnalysisLaboratoryStore store = new ClinicalAnalysisLaboratoryStore();
        ClinicalAnalysisLaboratory cal = store.CreateClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");

        //Act
        boolean expected = true;
        boolean actual = store.validateClinicalAnalysisLaboratory(cal);

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void listContain() {

        //Arrange
        ClinicalAnalysisLaboratoryStore store = new ClinicalAnalysisLaboratoryStore();
        ClinicalAnalysisLaboratory cal = store.CreateClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");
        store.listAdd(cal);

        //Act
        boolean expected = true;
        boolean actual = store.listContain(cal);

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void saveClinicalAnalysisLaboratory() {

        //Arrange
        ClinicalAnalysisLaboratoryStore store = new ClinicalAnalysisLaboratoryStore();
        ClinicalAnalysisLaboratory cal = store.CreateClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");

        //Act
        boolean expected = true;
        boolean actual = store.saveClinicalAnalysisLaboratory();

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void listAdd() {

        //Arrange
        ClinicalAnalysisLaboratoryStore store = new ClinicalAnalysisLaboratoryStore();
        ClinicalAnalysisLaboratory cal = store.CreateClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");

        //Act
        boolean expected = true;
        boolean actual = store.listAdd(cal);

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getClinicalAnalysisLaboratory() {

        //Arrange
        ClinicalAnalysisLaboratoryStore store = new ClinicalAnalysisLaboratoryStore();
        ClinicalAnalysisLaboratory cal = store.CreateClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");
        store.listAdd(cal);

        //Act
        ClinicalAnalysisLaboratory expected = cal;
        ClinicalAnalysisLaboratory actual = store.getClinicalAnalysisLaboratory(0);

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCal() {

        //Arrange
        ClinicalAnalysisLaboratoryStore store = new ClinicalAnalysisLaboratoryStore();
        ClinicalAnalysisLaboratory cal = store.CreateClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");

        //Act
        ClinicalAnalysisLaboratory expected = cal;
        ClinicalAnalysisLaboratory actual = store.getCal();

        //Assert
        Assert.assertEquals(expected, actual);

    }
}