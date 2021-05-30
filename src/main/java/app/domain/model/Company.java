package app.domain.model;

import app.domain.stores.*;
import auth.AuthFacade;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Set;

/**
 * @author Paulo Maio <pam@isep.ipp.pt>
 * @author Miguel Jordão <1201487@isep.ipp.pt>
 * @author Mariana Lages <1200902@isep.ipp.pt>
 * @author Lucas Silva <1200759@isep.ipp.pt>
 * @author Daniel Costa <1200581@isep.ipp.pt>
 * @author Marcin Basinski <1200300@isep.ipp.pt>
 */

public class Company {

    private final String designation;
    private final AuthFacade authFacade;

    /**
     * Constructor.
     * @param designation the Company's designation
     */
    public Company(String designation) {
        if (StringUtils.isBlank(designation))
            throw new IllegalArgumentException("Designation cannot be blank.");

        this.designation = designation;
        this.authFacade = new AuthFacade();
    }

    /**
     * Gets the Company's designation.
     * @return the Company's designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Gets the Auth Facade.
     * @return the auth facade
     */
    public AuthFacade getAuthFacade() {
        return authFacade;
    }


    // US03 - ClientRegistration ----------------------------------------------------------------

    ClientStore clientStore = new ClientStore();

    /**
     * Gets the client list.
     * @return the client list
     */
    public List<Client> getClientList() {
        return clientStore.getClientList();
    }

    /**
     * Gets the client store.
     * @return the client store
     */
    public ClientStore getClientStore() {
        return clientStore;
    }


    //US04 - Test -------------------------------------------------------------------------------

    TestStore testStore = new TestStore();

    /**
     * Gets the test list.
     * @return the test list
     */
    public List<Test> getTestList() {
        return testStore.getTestList();
    }

    /**
     * Gets the test store.
     * @return the test store
     */
    public TestStore getTestStore() {
        return testStore;
    }


    //US05 - Sample -----------------------------------------------------------------------------

    SampleStore sampleStore = new SampleStore();

    /**
     * Gets the sample list.
     * @return the sample list
     */
    public List<Sample> getSampleList() {
        return sampleStore.getSampleList();
    }

    /**
     * Gets the sample store.
     * @return the sample store
     */
    public SampleStore getSampleStore() {
        return sampleStore;
    }


    // US07 - Employee --------------------------------------------------------------------------

    EmployeeStore employeeStore = new EmployeeStore();

    SpecialistDoctorStore specialistDoctorStore = new SpecialistDoctorStore();

    /**
     * Gets the employee list.
     * @return the employee list
     */
    public List<Employee> getEmployeeList() {
        return employeeStore.getEmployeeList();
    }

    /**
     * Gets the specialist doctor list.
     * @return the specialist doctor list
     */
    public List<SpecialistDoctor> getSpecialistDoctorList() {
        return specialistDoctorStore.getSpecialistDoctorList();
    }

    /**
     * Gets the employee store.
     * @return the employee store
     */
    public EmployeeStore getEmployeeStore() {
        return employeeStore;
    }

    /**
     * Gets the specialist doctor store.
     * @return the specialist doctor store
     */
    public SpecialistDoctorStore getSpecialistDoctorStore() {
        return specialistDoctorStore;
    }


    // US08 - ClinicalAnalysisLaboratory --------------------------------------------------------

    ClinicalAnalysisLaboratoryStore clinicalAnalysisLaboratoryStore = new ClinicalAnalysisLaboratoryStore();

    /**
     * Gets the clinical analysis laboratory list.
     * @return the clinical analysis laboratory list
     */
    public List<ClinicalAnalysisLaboratory> getClinicalAnalysisLaboratoryList() {
        return clinicalAnalysisLaboratoryStore.getClinicalAnalysisLaboratoryList();
    }

    /**
     * Gets the clinical analysis laboratory store.
     * @return the clinical analysis laboratory store
     */
    public ClinicalAnalysisLaboratoryStore getClinicalAnalysisLaboratoryStore() {
        return clinicalAnalysisLaboratoryStore;
    }


    // US09 - TestType --------------------------------------------------------------------------

    TestTypeStore testTypeStore = new TestTypeStore();

    /**
     * Gets test type list.
     * @return the test type list
     */
    public List<TestType> getTestTypeList() {
        return testTypeStore.getTestTypeList();
    }

    /**
     * Gets the test type store.
     * @return the test type store
     */
    public TestTypeStore getTestTypeStore() {
        return testTypeStore;
    }


    // US10 - Parameter -------------------------------------------------------------------------

    ParameterStore parameterStore = new ParameterStore();

    /**
     * Gets the parameter list.
     * @return the parameter list
     */
    public List<Parameter> getParameterList() {
        return parameterStore.getParameterList();
    }

    /**
     * Gets the parameter store.
     * @return the parameter store
     */
    public ParameterStore getParameterStore() {
        return parameterStore;
    }


    // US11 - ParameterCategory -----------------------------------------------------------------

    ParameterCategoryStore parameterCategoryStore = new ParameterCategoryStore();

    /**
     * Gets the parameter category list.
     * @return the parameter category list
     */
    public List<ParameterCategory> getParameterCategoryList() {
        return parameterCategoryStore.getParameterCategoryList();
    }

    /**
     * Gets parameter category store.
     * @return the parameter category store
     */
    public ParameterCategoryStore getParameterCategoryStore() {
        return parameterCategoryStore;
    }


    // US12 - RecordTestResults (only needs stores which are already defined) ---------------------------------------------------------


    // US15 - ValidateTest -----------------------------------------------------------------

    /**
     * Gets invalid test list
     * @return the invalid test list
     */

    public Set<Test> getInvalidTestList() {
        return testStore.getInvalidTestList();
    }

}