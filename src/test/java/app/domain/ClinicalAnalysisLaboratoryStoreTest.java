package app.domain;
import org.junit.Assert;
import org.junit.Test;

public class ClinicalAnalysisLaboratoryStoreTest {

    @Test
    public void createClinicalAnalysisLaboratory() {
    }

    @Test
    public void validateClinicalAnalysisLaboratory1() {

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
    public void validateClinicalAnalysisLaboratory2() {

        //Arrange
        ClinicalAnalysisLaboratoryStore store = new ClinicalAnalysisLaboratoryStore();
        ClinicalAnalysisLaboratory cal = store.CreateClinicalAnalysisLaboratory("LAB02", "SecondLab", "3425 Stone Street", "01492235687", "3245681253");
        store.listAdd(cal);

        //Act
        boolean expected = false;
        boolean actual = store.validateClinicalAnalysisLaboratory(cal);

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void listContain1() {

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
    public void listContain2() {

        //Arrange
        ClinicalAnalysisLaboratoryStore store = new ClinicalAnalysisLaboratoryStore();
        ClinicalAnalysisLaboratory cal = store.CreateClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");

        //Act
        boolean expected = false;
        boolean actual = store.listContain(cal);

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void saveClinicalAnalysisLaboratory1() {

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
    public void saveClinicalAnalysisLaboratory2() {

        //Arrange
        ClinicalAnalysisLaboratoryStore store = new ClinicalAnalysisLaboratoryStore();
        ClinicalAnalysisLaboratory cal = store.CreateClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");
        store.listAdd(cal);

        //Act
        boolean expected = false;
        boolean actual = store.saveClinicalAnalysisLaboratory();

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void listAdd1() {

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
    public void listAdd2() {

        //Arrange
        ClinicalAnalysisLaboratoryStore store = new ClinicalAnalysisLaboratoryStore();
        ClinicalAnalysisLaboratory cal = store.CreateClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253");
        store.listAdd(cal);

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