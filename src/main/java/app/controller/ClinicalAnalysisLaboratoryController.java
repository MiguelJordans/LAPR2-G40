package app.controller;

import app.domain.model.Company;
import app.domain.model.ClinicalAnalysisLaboratoryStore;

public class ClinicalAnalysisLaboratoryController {

    private Company company;
    private ClinicalAnalysisLaboratoryStore store;

    /**
     * Creates an empty Clinical Analysis Laboratory controller.
     */
    public ClinicalAnalysisLaboratoryController() {
        this(App.getInstance().getCompany());
    }

    /**
     * Instance of a Clinical Analysis Laboratory.
     *
     * @param company the company that administrates the system
     */
    public ClinicalAnalysisLaboratoryController(Company company) {
        this.company = company;
    }

    /**
     * Creates a Clinical Analysis Laboratory.
     *
     * @param laboratoryID the Clinical Analysis Laboratory's laboratory ID
     * @param name the Clinical Analysis Laboratory's name
     * @param address the Clinical Analysis Laboratory's address
     * @param phoneNumber the Clinical Analysis Laboratory's phone number
     * @param tinNumber the Clinical Analysis Laboratory's TIN number
     */
    public void CreateClinicalAnalysisLaboratory(String laboratoryID, String name, String address, String phoneNumber, String tinNumber) {
        store = company.getClinicalAnalysisLaboratoryStore();
        store.CreateClinicalAnalysisLaboratory(laboratoryID, name, address, phoneNumber, tinNumber);
    }

    /**
     * Transforms into string.
     *
     * @return the Clinical Analysis Laboratory's info in string format
     */
    public String getCAL() {
        return store.getCal().toString();
    }

    /**
     * Saves an instance of Clinical Analysis Laboratory.
     *
     * @return the saving of an instance of a Clinical Analysis Laboratory
     */
    public boolean saveClinicalAnalysisLaboratory() {
        return this.store.saveClinicalAnalysisLaboratory();
    }
}
