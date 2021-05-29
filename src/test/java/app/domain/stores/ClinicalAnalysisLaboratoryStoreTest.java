package app.domain.stores;

import app.domain.model.ClinicalAnalysisLaboratory;
import app.domain.model.ParameterCategory;
import app.domain.model.TestType;
import app.domain.stores.ClinicalAnalysisLaboratoryStore;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ClinicalAnalysisLaboratoryStoreTest {

    @Test
    public void createClinicalAnalysisLaboratory() {
    }

    @Test
    public void validateClinicalAnalysisLaboratory() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        //Arrange
        ClinicalAnalysisLaboratoryStore store = new ClinicalAnalysisLaboratoryStore();
        ClinicalAnalysisLaboratory cal = store.createClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253",ttList);

        //Act
        boolean expected = true;
        boolean actual = store.validateClinicalAnalysisLaboratory(cal);

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void listContain() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        //Arrange
        ClinicalAnalysisLaboratoryStore store = new ClinicalAnalysisLaboratoryStore();
        ClinicalAnalysisLaboratory cal = store.createClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253",ttList);
        store.listAdd(cal);

        //Act
        boolean expected = true;
        boolean actual = store.listContain(cal);

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void saveClinicalAnalysisLaboratory() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        //Arrange
        ClinicalAnalysisLaboratoryStore store = new ClinicalAnalysisLaboratoryStore();
        ClinicalAnalysisLaboratory cal = store.createClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253",ttList);

        //Act
        boolean expected = true;
        boolean actual = store.saveClinicalAnalysisLaboratory();

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void listAdd() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        //Arrange
        ClinicalAnalysisLaboratoryStore store = new ClinicalAnalysisLaboratoryStore();
        ClinicalAnalysisLaboratory cal = store.createClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253",ttList);

        //Act
        boolean expected = true;
        boolean actual = store.listAdd(cal);

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getClinicalAnalysisLaboratory() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        //Arrange
        ClinicalAnalysisLaboratoryStore store = new ClinicalAnalysisLaboratoryStore();
        ClinicalAnalysisLaboratory cal = store.createClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253",ttList);
        store.listAdd(cal);

        //Act
        ClinicalAnalysisLaboratory expected = cal;
        ClinicalAnalysisLaboratory actual = store.getClinicalAnalysisLaboratory(0);

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCal() {

        List<TestType> ttList = new ArrayList<>();
        List<ParameterCategory> pcList = new ArrayList<>();

        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcList.add(pc);

        TestType tt = new TestType("1abcE","yes","aaa",pcList);
        ttList.add(tt);

        //Arrange
        ClinicalAnalysisLaboratoryStore store = new ClinicalAnalysisLaboratoryStore();
        ClinicalAnalysisLaboratory cal = store.createClinicalAnalysisLaboratory("LAB01", "FirstCal", "3425 Stone Street", "01492235687", "3245681253",ttList);

        //Act
        ClinicalAnalysisLaboratory expected = cal;
        ClinicalAnalysisLaboratory actual = store.getCal();

        //Assert
        Assert.assertEquals(expected, actual);

    }
}