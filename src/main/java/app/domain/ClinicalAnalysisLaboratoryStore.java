package app.domain;

import java.util.ArrayList;
import java.util.List;

public class ClinicalAnalysisLaboratoryStore {

    List<ClinicalAnalysisLaboratory> clinicalAnalysisLaboratoryList;
    ClinicalAnalysisLaboratory cal;

    /**
     * Constructor.
     */
    public ClinicalAnalysisLaboratoryStore() {
        this.clinicalAnalysisLaboratoryList = new ArrayList<>();
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
    public ClinicalAnalysisLaboratory CreateClinicalAnalysisLaboratory(String laboratoryID, String name, String address, String phoneNumber, String tinNumber) {
        return this.cal = new ClinicalAnalysisLaboratory(laboratoryID, name, address, phoneNumber, tinNumber);
    }

    /**
     * Validates a Clinical Analysis Laboratory.
     *
     * @param cal the object Clinical Analysis Laboratory
     * @return the validation of the Clinical Analysis Laboratory being created
     */
    public boolean validateClinicalAnalysisLaboratory(ClinicalAnalysisLaboratory cal) {
        if (cal == null || listContain(cal)) {
            return false;
        }
        return true;
    }

    /**
     * Checks if the new object created is already in the list.
     *
     * @param cal the object Clinical Analysis Laboratory
     * @return true if the list contains the Clinical Analysis Laboratory and false if it doesn't
     */
    public boolean listContain(ClinicalAnalysisLaboratory cal) {
        if (this.clinicalAnalysisLaboratoryList.contains(cal)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Saves an instance of Clinical Analysis Laboratory.
     *
     * @return the saving of an instance of a Clinical Analysis Laboratory
     */
    public boolean saveClinicalAnalysisLaboratory() {
        if (validateClinicalAnalysisLaboratory(this.cal)) {
            listAdd(cal);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Adds an instance of Clinical Analysis Laboratory to the list.
     *
     * @param cal the object Clinical Analysis Laboratory
     * @return the addition of the Clinical Analysis Laboratory to the list
     */
    public boolean listAdd(ClinicalAnalysisLaboratory cal) {
        clinicalAnalysisLaboratoryList.add(cal);
        return true;
    }

    /**
     * Replaces the element at the specified position in the list with the specified element.
     *
     * @param i the index of the element to replace
     * @return the element previously at the specified position
     */
    public ClinicalAnalysisLaboratory getClinicalAnalysisLaboratory(int i) {
        return clinicalAnalysisLaboratoryList.get(i);
    }

    /**
     * Gets Clinical Analysis Laboratory from the list.
     *
     * @return the Clinical Analysis Laboratory requested
     */
    public ClinicalAnalysisLaboratory getCal() {
        return cal;
    }
}
