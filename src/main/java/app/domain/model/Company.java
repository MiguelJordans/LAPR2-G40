package app.domain.model;

import auth.AuthFacade;
import net.sourceforge.barbecue.Barcode;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

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

    public Company(String designation) {
        if (StringUtils.isBlank(designation))
            throw new IllegalArgumentException("Designation cannot be blank.");

        this.designation = designation;
        this.authFacade = new AuthFacade();
    }

    public String getDesignation() {
        return designation;
    }

    public AuthFacade getAuthFacade() {
        return authFacade;
    }

    // US03 - ClientRegistration ----------------------------------------------------------------

    ClientStore clientStore = new ClientStore();

    public List<Client> getClientList() {
        return clientStore.getClientList();
    }

    public ClientStore getClientStore() {
        return clientStore;
    }

    //US04 - Test -------------------------------------------------------------------------------

    private TestStore testStore;

    public TestStore getTestStore() {
        return testStore;
    }


    //US05 - Sample -----------------------------------------------------------------------------

    SampleStore sampleStore = new SampleStore();

    public List<Sample> getSampleList() {
        return sampleStore.getSampleList();
    }

    public SampleStore getSampleStore() {
        return sampleStore;
    }

    // US07 - Employee --------------------------------------------------------------------------

    EmployeeStore employeeStore = new EmployeeStore();

    SpecialistDoctorStore specialistDoctorStore = new SpecialistDoctorStore();

    public List<Employee> getEmployeeList() {
        return employeeStore.getEmployeeList();
    }

    public List<SpecialistDoctor> getSpecialistDoctorList(){
        return specialistDoctorStore.getSpecialistDoctorList();
    }

    public EmployeeStore getEmployeeStore() {
        return employeeStore;
    }

    public SpecialistDoctorStore getSpecialistDoctorStore() { return specialistDoctorStore; }


    // US08 - ClinicalAnalysisLaboratory --------------------------------------------------------


    ClinicalAnalysisLaboratoryStore clinicalAnalysisLaboratoryStore = new ClinicalAnalysisLaboratoryStore();

    public List<ClinicalAnalysisLaboratory> getClinicalAnalysisLaboratoryList() {
        return clinicalAnalysisLaboratoryStore.getClinicalAnalysisLaboratoryList();
    }

    public ClinicalAnalysisLaboratoryStore getClinicalAnalysisLaboratoryStore() {
        return clinicalAnalysisLaboratoryStore;
    }


    // US09 - TestType --------------------------------------------------------------------------

    TestTypeStore testTypeStore = new TestTypeStore();

    public List<TestType> getTestTypeList() {
        return testTypeStore.getTestTypeList();
    }

    public TestTypeStore getTestTypeStore() {
        return testTypeStore;
    }

    // US10 - Parameter -------------------------------------------------------------------------

    ParameterStore parameterStore = new ParameterStore();

    public List<Parameter> getParameterList() {
        return parameterStore.getParameterList();
    }

    public ParameterStore getParameterStore() {
        return parameterStore;
    }


    // US11 - ParameterCategory -----------------------------------------------------------------

    ParameterCategoryStore parameterCategoryStore = new ParameterCategoryStore();

    public List<ParameterCategory> getParameterCategoryList() {
        return parameterCategoryStore.getParameterCategoryList();
    }

    public ParameterCategoryStore getParameterCategoryStore() {
        return parameterCategoryStore;
    }

    // US12 - RecordTestResults (only needs the test store which is already defined) ---------------------------------------------------------


    // US15 - ValidateTest -----------------------------------------------------------------

    public HashSet<Test> getInvalidTestList() {
        return testStore.getInvalidTestList();
    }

    public boolean saveTest(Test t) {
        return testStore.saveTest(t);
    }


}