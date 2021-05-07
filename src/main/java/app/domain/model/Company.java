package app.domain.model;

import auth.AuthFacade;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 *
 * @author Paulo Maio <pam@isep.ipp.pt>
 * @author Miguel Jordão <1201477@isep.ipp.pt>
 * @author Mariana Lages <1200902@isep.ipp.pt>
 * @author Lucas Silva <1200759@isep.ipp.pt>
 * @author Daniel Costa <1200581@isep.ipp.pt>
 * @author Marcin Basinski <1200300@isep.ipp.pt>
 */

public class Company {

    private String designation;
    private AuthFacade authFacade;

    public Company(String designation)
    {
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

    public TestType createTestType(String testCode,String description, String collectingMethod){
        return new TestType(testCode,description,collectingMethod);
    }

    public ClinicalAnalysisLaboratory createClinicalAnalysisLaboratory(String laboratoryID, String name, String address, long phoneNumber, long TINnumber) {
        return new ClinicalAnalysisLaboratory(laboratoryID, name, address, phoneNumber, TINnumber);
    }

    //Test Type

    TestTypeStore testTypeStore = new TestTypeStore();

    private static TestTypeStore testTypeList;

    public static TestTypeStore TestType(){
        return testTypeList = new TestTypeStore();
    }

    //public List<TestType> getTestType(){return testTypeStore.getTt();}

    public boolean addTestType(TestType tt){
        testTypeStore.listAdd(tt);
        return true;
    }

    //public List

    public boolean validateTestType(TestType tt){
        testTypeStore.ValidateTestType(tt);
        return true;
    }

    public boolean saveTestType(TestType tt){
        testTypeStore.saveTestType();
        return true;
    }

    public boolean listContainsTestType(TestType tt){
        testTypeStore.listContain(tt);
        return true;
    }

    public boolean listAdd(TestType tt){
        testTypeStore.listAdd(tt);
        return true;
    }

    public TestType getTestType(int i){
       return testTypeStore.getTestType(i);
    }

    public TestType getTt() {
        return testTypeStore.tt;
    }

    public List<TestType> getTestTypeList() {
        return testTypeStore.getTestTypeList();
    }

    //Clinical Analysis Laboratory

    ClinicalAnalysisLaboratoryStore clinicalAnalysisLaboratoryStore = new ClinicalAnalysisLaboratoryStore();

    private static ClinicalAnalysisLaboratoryStore clinicalAnalysisLaboratoryList;

    public static ClinicalAnalysisLaboratoryStore ClinicalAnalysisLaboratory() {
        return clinicalAnalysisLaboratoryList = new ClinicalAnalysisLaboratoryStore();
    }

    /*
    public List<ClinicalAnalysisLaboratory> getClinicalAnalysisLaboratory() {
        return clinicalAnalysisLaboratoryStore.getCal();
    }
     */

    public boolean addClinicalAnalysisLaboratory(ClinicalAnalysisLaboratory cal) {
        clinicalAnalysisLaboratoryStore.listAdd(cal);
        return true;
    }

    public boolean validateClinicalAnalysisLaboratory(ClinicalAnalysisLaboratory cal){
        clinicalAnalysisLaboratoryStore.validateClinicalAnalysisLaboratory(cal);
        return true;
    }

    public boolean saveClinicalAnalysisLaboratory(ClinicalAnalysisLaboratory cal){
        clinicalAnalysisLaboratoryStore.saveClinicalAnalysisLaboratory();
        return true;
    }

    public boolean listContainsClinicalAnalysisLaboratory(ClinicalAnalysisLaboratory cal){
        clinicalAnalysisLaboratoryStore.listContain(cal);
        return true;
    }

    public boolean listAdd(ClinicalAnalysisLaboratory cal){
        clinicalAnalysisLaboratoryStore.listAdd(cal);
        return true;
    }

    public ClinicalAnalysisLaboratory getClinicalAnalysisLaboratory(int i){
        return clinicalAnalysisLaboratoryStore.getClinicalAnalysisLaboratory(i);
    }

    public ClinicalAnalysisLaboratory getCal() {
        return clinicalAnalysisLaboratoryStore.cal;
    }


}
