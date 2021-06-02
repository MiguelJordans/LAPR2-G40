package app.controller;

import app.mappers.TestTypeMapper;
import app.mappers.dto.TestTypeDTO;
import app.domain.model.Company;
import app.domain.stores.ClinicalAnalysisLaboratoryStore;
import app.domain.model.TestType;

import java.util.ArrayList;
import java.util.List;

public class ClinicalAnalysisLaboratoryController {

    private Company company;
    private ClinicalAnalysisLaboratoryStore store;
    private TestTypeMapper testTypeMapper;

    private List<TestType> ttList = new ArrayList<>();

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

    public void addTestTypesToTtList(TestTypeDTO testTypeDTO) {
        convertDTOintoTestType(testTypeDTO);
    }

    /**
     * Creates a Clinical Analysis Laboratory.
     *
     * @param laboratoryID the Clinical Analysis Laboratory's laboratory ID
     * @param name         the Clinical Analysis Laboratory's name
     * @param address      the Clinical Analysis Laboratory's address
     * @param phoneNumber  the Clinical Analysis Laboratory's phone number
     * @param tinNumber    the Clinical Analysis Laboratory's TIN number
     */
    public void createClinicalAnalysisLaboratory(String laboratoryID, String name, String address, String phoneNumber, String tinNumber) {
        store = company.getClinicalAnalysisLaboratoryStore();
        store.createClinicalAnalysisLaboratory(laboratoryID, name, address, phoneNumber, tinNumber, ttList);
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

    public List<TestTypeDTO> getTestTypeListDto() {
        this.testTypeMapper = new TestTypeMapper();

        return testTypeMapper.toDTO(getTestTypeList());
    }

    public List<TestType> getTestTypeList() {
        return this.company.getTestTypeList();
    }

    public void convertDTOintoTestType(TestTypeDTO testTypeDTO) {

        for (TestType tt : this.getTestTypeList()) {
            if (testTypeDTO.getTestCode() == tt.getTestCode())
                ttList.add(tt);
        }

    }

    public void addTestTypeList(){

        this.company.addTestTypelist();

    }

}
