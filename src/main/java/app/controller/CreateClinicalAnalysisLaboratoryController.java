package app.controller;

import app.domain.Company;
import auth.AuthFacade;
import app.domain.ClinicalAnalysisLaboratoryStore;

public class CreateClinicalAnalysisLaboratoryController {

    private Company company;
    private AuthFacade authFacade;

    private CreateClinicalAnalysisLaboratoryController app;

    private ClinicalAnalysisLaboratoryStore store = null;

    public CreateClinicalAnalysisLaboratoryController() {
        this(App.getInstance().getCompany());
    }

    public CreateClinicalAnalysisLaboratoryController(Company company) {
        this.company = company;
        this.app = null;
    }

    public boolean doLogin(String email, String pwd) {
        try {
            return this.app.doLogin(email, pwd);
        } catch(IllegalArgumentException exc) {
            return false;
        }
    }

    public ClinicalAnalysisLaboratoryStore CreateClinicalAnalysisLaboratory(String laboratoryID, String name, String address, long phoneNumber, long TINnumber) {
        return store = this.CreateClinicalAnalysisLaboratory(laboratoryID, name, address, phoneNumber, TINnumber);
    }
}
