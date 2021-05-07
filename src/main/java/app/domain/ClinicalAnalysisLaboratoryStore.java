package app.domain;

import java.util.ArrayList;
import java.util.List;

public class ClinicalAnalysisLaboratoryStore {

    List<ClinicalAnalysisLaboratory> clinicalAnalysisLaboratoryList;
    ClinicalAnalysisLaboratory cal;

    public ClinicalAnalysisLaboratoryStore() {
        this.clinicalAnalysisLaboratoryList = new ArrayList<ClinicalAnalysisLaboratory>();
    }

    public ClinicalAnalysisLaboratory CreateClinicalAnalysisLaboratory(String laboratoryID, String name, String address, long phoneNumber, long TINnumber){
        return this.cal = new ClinicalAnalysisLaboratory(laboratoryID, name, address, phoneNumber, TINnumber);
    }

    public boolean validateClinicalAnalysisLaboratory(ClinicalAnalysisLaboratory cal){
        if (cal == null || listContain(cal)){
            return false;
        }
        return true;
    }

    public boolean listContain(ClinicalAnalysisLaboratory cal){
        if (this.clinicalAnalysisLaboratoryList.contains(cal)){
            return true;
        } else {
            return false;
        }
    }

    public boolean saveClinicalAnalysisLaboratory() {
        if (validateClinicalAnalysisLaboratory(this.cal)) {
            listAdd(cal);
            return true;
        } else {
            return false;
        }
    }

    public boolean listAdd(ClinicalAnalysisLaboratory cal){
        clinicalAnalysisLaboratoryList.add(cal);
        return true;
    }

    public ClinicalAnalysisLaboratory getClinicalAnalysisLaboratory(int i) {
        return clinicalAnalysisLaboratoryList.get(i);
    }

    public ClinicalAnalysisLaboratory getCal() {
        return cal;
    }
}
