package app.controller;

import app.domain.Company;
import app.domain.ClinicalAnalysisLaboratoryStore;

public class ClinicalAnalysisLaboratoryController {

    private Company company;
    private ClinicalAnalysisLaboratoryStore store;

    public ClinicalAnalysisLaboratoryController() {
        this(App.getInstance().getCompany());
    }

    public ClinicalAnalysisLaboratoryController(Company company) {
        this.company = company;
    }

    public void CreateClinicalAnalysisLaboratory(String laboratoryID, String name, String address, String phoneNumber, String TINnumber) {
        store = company.getClinicalAnalysisLaboratoryStore();
        store.CreateClinicalAnalysisLaboratory(laboratoryID, name, address, phoneNumber, TINnumber);
    }

    public String getCAL() {
        return store.getCal().toString();
    }

    public boolean saveClinicalAnalysisLaboratory() {
        return this.store.saveClinicalAnalysisLaboratory();
    }
}
