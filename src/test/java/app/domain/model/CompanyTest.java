package app.domain.model;

import auth.AuthFacade;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CompanyTest {

    @Test
    public void createCompany() {

        Company company = new Company("aaaa");

    }

    @Test(expected = IllegalArgumentException.class)
    public void createCompanyInvalid() {

        Company company = new Company("");

    }

    @Test
    public void createCompanyNull() {

        Company company = null;

        Assert.assertNull(company);

    }

    @Test
    public void getDesignation() {

        Company company = new Company("aaaa");

        String expected = "aaaa";
        String actual = company.getDesignation();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getAuthFacade() {

        Company company = new Company("aaaa");

        AuthFacade expected = company.getAuthFacade();
        AuthFacade actual = company.getAuthFacade();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getAuthFacadeNotNull() {

        Company company = new Company("aaaa");

        AuthFacade expected = company.getAuthFacade();

        Assert.assertNotNull(expected);

    }

    @Test
    public void createTestTypeNull() {

        TestType tt = null;

        Assert.assertNull(tt);

    }

    @Test
    public void createClinicalAnalysisLaboratoryNull() {

        ClinicalAnalysisLaboratory cal = null;

        Assert.assertNull(cal);

    }

    @Test
    public void createParameterNull() {

        Company company = new Company("aaaa");

        Parameter pp = null;

        Assert.assertNull(pp);

    }

    @Test
    public void createParameterCategoryNull() {

        ParameterCategory pc = null;

        Assert.assertNull(pc);

    }


    @Test
    public void testTypeNull() {


        TestTypeStore testTypeStore = null;

        Assert.assertNull(testTypeStore);

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
    public void clinicalAnalysisLaboratoryNull() {

        ClinicalAnalysisLaboratoryStore calstore = null;

        Assert.assertNull(calstore);

    }

    @Test
    public void parameterNull() {

        Parameter pp = null;

        Assert.assertNull(pp);

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
    public void getParameterCategoryStore() {

        Company company = new Company("aaaa");

        ParameterCategoryStore parameterCategoryStore = company.getParameterCategoryStore();

    }

    @Test
    public void getParameterCategoryStoreNull() {

        ParameterCategoryStore parameterCategoryStore = null;

        Assert.assertNull(parameterCategoryStore);

    }

    @Test
    public void getParameterCategoryStoreNotNull() {

        Company company = new Company("aaaa");

        ParameterCategoryStore parameterCategoryStore = company.getParameterCategoryStore();

        Assert.assertNotNull(parameterCategoryStore);

    }

    @Test
    public void getClinicalAnalysisLaboratoryStore() {

        Company company = new Company("aaaa");

        ClinicalAnalysisLaboratoryStore clinicalAnalysisLaboratoryStore = company.getClinicalAnalysisLaboratoryStore();

    }

    @Test
    public void getClinicalAnalysisLaboratoryStoreNotNull() {

        Company company = new Company("aaaa");

        ClinicalAnalysisLaboratoryStore clinicalAnalysisLaboratoryStore = company.getClinicalAnalysisLaboratoryStore();

        Assert.assertNotNull(clinicalAnalysisLaboratoryStore);

    }

    @Test
    public void getClinicalAnalysisLaboratoryStoreNull() {

        Company company = new Company("aaaa");

        company.clinicalAnalysisLaboratoryStore = null;

        ClinicalAnalysisLaboratoryStore clinicalAnalysisLaboratoryStore = company.getClinicalAnalysisLaboratoryStore();

        Assert.assertNull(clinicalAnalysisLaboratoryStore);

    }

    @Test
    public void ParameterCategoryStoreNull() {

        Company company = new Company("aaaa");

        company.parameterCategoryStore = null;

        ParameterCategoryStore parameterCategoryStore = company.getParameterCategoryStore();

        Assert.assertNull(parameterCategoryStore);

    }

    @Test
    public void ParameterStoreNull() {

        ParameterStore parameterStore = null;

        Assert.assertNull(parameterStore);

    }

    @Test
    public void getParameterList() {

        ParameterStore parameterStore = new ParameterStore();

        Company company = new Company("aaa");

        company.getParameterList();

    }

    @Test
    public void getEmployeeStore() {

        Company company = new Company("aaaa");

        EmployeeStore employeeStore = company.getEmployeeStore();


    }
}