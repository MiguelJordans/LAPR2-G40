package app.domain.model;

import app.domain.stores.*;
import auth.AuthFacade;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Set;

public class CompanyTest {

    @Test
    public void createCompany() {

        Company company = new Company("aaaa");

        Assert.assertNotNull(company);

    }

    @Test(expected = IllegalArgumentException.class)
    public void createCompanyInvalid() {

        Company company = new Company("");

        Assert.assertNotNull(company);

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

        AuthFacade actual = company.getAuthFacade();

        Assert.assertNotNull(actual);

    }

    @Test
    public void getAuthFacadeNotNull() {

        Company company = new Company("aaaa");

        AuthFacade expected = company.getAuthFacade();

        Assert.assertNotNull(expected);

    }

    @Test
    public void getTestTypeStore() {

        Company company = new Company("aaaa");

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
    public void getParameterStore() {

        Company company = new Company("aaaa");

        ParameterStore expected = company.parameterStore;

        ParameterStore actual = company.getParameterStore();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getParameterCategoryStore() {

        Company company = new Company("aaaa");

        ParameterCategoryStore parameterCategoryStore = company.getParameterCategoryStore();

        Assert.assertNotNull(parameterCategoryStore);

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

        Assert.assertNotNull(clinicalAnalysisLaboratoryStore);

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
        Assert.assertNotNull(company.getParameterList());

    }

    @Test
    public void getEmployeeStore() {

        Company company = new Company("aaaa");

        EmployeeStore employeeStore = company.getEmployeeStore();

        Assert.assertNotNull(employeeStore);


    }

    @Test
    public void getClientStore() {

        Company company = new Company("aaaa");

        ClientStore clientStore = company.getClientStore();

        Assert.assertNotNull(clientStore);


    }

    @Test
    public void getClientList() {

        Company company = new Company("aaaa");

        List<Client> clientList = company.getClientList();

        Assert.assertNotNull(clientList);

    }

    @Test
    public void getTestList() {

        Company company = new Company("aaaa");

        List<app.domain.model.Test> testList = company.getTestList();

        Assert.assertNotNull(testList);

    }

    @Test
    public void getTestStore() {

        Company company = new Company("aaaa");

        TestStore testStore = company.getTestStore();

        Assert.assertNotNull(testStore);


    }

    @Test
    public void getSampleList() {

        Company company = new Company("aaaa");

        List<Sample> sampleList = company.getSampleList();

        Assert.assertNotNull(sampleList);

    }

    @Test
    public void getSampleStore() {

        Company company = new Company("aaaa");

        SampleStore sampleStore = company.getSampleStore();

        Assert.assertNotNull(sampleStore);


    }

    @Test
    public void getSpecialistDoctorStore() {

        Company company = new Company("aaaa");

        SpecialistDoctorStore specialistDoctorStore = company.getSpecialistDoctorStore();

        Assert.assertNotNull(specialistDoctorStore);

    }

    @Test
    public void getEmployeeList() {

        Company company = new Company("aaaa");

        List<Employee> employeeList = company.getEmployeeList();

        Assert.assertNotNull(employeeList);

    }

    @Test
    public void getSpecialistDoctorList() {

        Company company = new Company("aaaa");

        List<SpecialistDoctor> specialistDoctorList = company.getSpecialistDoctorList();

        Assert.assertNotNull(specialistDoctorList);

    }

    @Test
    public void getTestTypeList() {

        Company company = new Company("aaaa");

        List<TestType> testTypeList = company.getTestTypeList();

        Assert.assertNotNull(testTypeList);

    }

    @Test
    public void getClinicalAnalysisLaboratoryList() {

        Company company = new Company("aaaa");

        List<ClinicalAnalysisLaboratory> clinicalAnalysisLaboratoryList = company.getClinicalAnalysisLaboratoryList();

        Assert.assertNotNull(clinicalAnalysisLaboratoryList);

    }

    @Test
    public void getParameterCategoryList() {

        Company company = new Company("aaaa");

        List<ParameterCategory> parameterCategoryList = company.getParameterCategoryList();

        Assert.assertNotNull(parameterCategoryList);

    }

    @Test
    public void getInvalidTestList() {

        Company company = new Company("aaaa");

        Set<app.domain.model.Test> testList = company.getInvalidTestList();

        Assert.assertNotNull(testList);

    }



}