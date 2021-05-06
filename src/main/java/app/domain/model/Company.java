package app.domain.model;

import app.controller.TestTypeController;
import auth.AuthFacade;
import auth.domain.store.ClinicalAnalysisLaboratoryStore;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Paulo Maio <pam@isep.ipp.pt>
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
}
