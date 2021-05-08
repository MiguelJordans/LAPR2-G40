package app.domain;

import auth.AuthFacade;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompanyTest {

    @Test
    public void createCompany(){

        Company company = new Company("aaaa");

    }

    @Test(expected = IllegalArgumentException.class)
    public void createCompanyInvalid(){

        Company company = new Company("");

    }

    @Test
    public void getDesignation(){

        Company company = new Company("aaaa");

        String expected = "aaaa";
        String actual = company.getDesignation();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getAuthFacade(){

        Company company = new Company("aaaa");

        AuthFacade expected =  company.getAuthFacade();
        AuthFacade actual = company.getAuthFacade();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void createTestType() {

        Company company = new Company("aaaa");

        TestType tt = company.createTestType("aaa","aaa","aaa");

    }

   /* @Test
    public void createClinicalAnalysisLaboratory() {

        Company company = new Company("aaaa");

        ClinicalAnalysisLaboratory expected = new ClinicalAnalysisLaboratory("aaa","aaa","aaa",69696969,696969696);

        ClinicalAnalysisLaboratory actual = company.createClinicalAnalysisLaboratory("aaa","aaa","aaa",69696969,696969696);

        Assert.assertEquals(expected,actual);


    }*/

    @Test
    public void createParameter() {

        Company company = new Company("aaaa");

        Parameter pp = company.createParameter("aaaaa","aaa","aaa");

    }

    @Test
    public void createParameterCategory() {

        Company company = new Company("aaaa");

        ParameterCategory pc = company.createParameterCategory("aaaaa","aaa","aaa");

    }

   /* @Test
    public void testType() {

        TestTypeStore testTypeStore = new TestTypeStore();

        TestTypeStore testTypeList;

    }*/

    @Test
    public void addTestType() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();

        TestType tt = company.createTestType("aaa","aaa","aaa");

        boolean expected = true;

        boolean actual = company.testTypeStore.listAdd(tt);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void validateTestType() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();

        TestType tt = company.createTestType("aaa","aaa","aaa");

        boolean expected = true;

        boolean actual = company.testTypeStore.validateTestType(tt);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void saveTestType() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();

        TestType tt = company.createTestType("aaa","aaa","aaa");

        boolean expected = false; // Devia ser true??

        boolean actual = company.testTypeStore.saveTestType();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void listContainsTestType() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();

        TestType tt = company.createTestType("aaa","aaa","aaa");

        boolean expected = false;

        boolean actual = company.testTypeStore.listContain(tt);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void listAdd() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();

        TestType tt = company.createTestType("aaa","aaa","aaa");

        boolean expected = true;

        boolean actual = company.testTypeStore.listAdd(tt);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getTestType() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();

        TestType tt = company.testTypeStore.CreateTestType("aaa","aaa","aaa");
        company.testTypeStore.listAdd(tt);

        TestType expected = tt;

        TestType actual = company.testTypeStore.getTestType(0);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getTt() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();

        TestType tt = company.testTypeStore.CreateTestType("aaa","aaa","aaa");

        TestType expected = tt;

        TestType actual = company.testTypeStore.getTt();

        Assert.assertEquals(expected,actual);


    }

    @Test
    public void getTestTypeStore() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();

        TestTypeStore expected = company.testTypeStore;

        TestTypeStore actual = company.getTestTypeStore();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void clinicalAnalysisLaboratory() {
    }

    @Test
    public void addClinicalAnalysisLaboratory() {
    }

    @Test
    public void validateClinicalAnalysisLaboratory() {
    }

    @Test
    public void saveClinicalAnalysisLaboratory() {
    }

    @Test
    public void listContainsClinicalAnalysisLaboratory() {
    }

    @Test
    public void testTypeListAdd() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();

        TestType tt = company.testTypeStore.CreateTestType("aaa","aaa","aaa");

        Assert.assertTrue(company.listAdd(tt));

    }


    @Test
    public void getClinicalAnalysisLaboratory() {
    }

    @Test
    public void getCal() {
    }

    @Test
    public void parameter() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();

        Parameter pp = company.createParameter("aaa","aaa","aaa");

    }

    @Test
    public void addParameter() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();

        Parameter pp = company.createParameter("aaa","aaa","aaa");

        Assert.assertTrue(company.addParameter(pp));

    }

    @Test
    public void validateParameter() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();

        Parameter pp = company.createParameter("aaa","aaa","aaa");

        Assert.assertTrue(company.validateParameter(pp));

    }

    @Test
    public void saveParameter() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();

        Parameter pp = company.createParameter("aaa","aaa","aaa");

        Assert.assertTrue(company.saveParameter(pp));

    }

    @Test
    public void listContainsParameter() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();

        Parameter pp = company.createParameter("aaa","aaa","aaa");

        Assert.assertTrue(company.listContainsParameter(pp));

    }

    @Test
    public void parameterListAdd() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();

        Parameter pp = company.createParameter("aaa","aaa","aaa");

        Assert.assertTrue(company.parameterListAdd(pp));

    }

    @Test
    public void getParameter() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();

        Parameter pp = company.parameterStore.CreateParameter("aaa","aaa","aaa");
        company.parameterStore.listAdd(pp);

        Parameter expected = pp;

        Parameter actual = company.parameterStore.getParameter(0);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getPP() {

        Company company = new Company("aaaa");
        TestTypeStore testTypeStore = new TestTypeStore();

        Parameter pp = company.parameterStore.CreateParameter("aaa","aaa","aaa");

        Parameter expected = pp;

        Parameter actual = company.parameterStore.getPp();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getParameterStore() {

        Company company = new Company("aaaa");
        ParameterStore parameterStore = new ParameterStore();

        ParameterStore expected = company.parameterStore;

        ParameterStore actual = company.getParameterStore();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void parameterCategory() {

        Company company = new Company("aaaa");

        ParameterCategory pp = company.createParameterCategory("aaaaa","aaa","aaa");

    }

    @Test
    public void addParameterCategory() {

        Company company = new Company("aaaa");

        ParameterCategory pp = company.createParameterCategory("aaaaa","aaa","aaa");

        Assert.assertTrue(company.addParameterCategory(pp));

    }

    @Test
    public void testValidateTestType() {
    }

    @Test
    public void testSaveTestType() {
    }

    @Test
    public void testListContainsTestType() {
    }

    @Test
    public void testListAdd1() {
    }

    @Test
    public void getParameterCategory() {
    }

    @Test
    public void getPC() {
    }

    @Test
    public void getParameterCategoryStore() {
    }
}