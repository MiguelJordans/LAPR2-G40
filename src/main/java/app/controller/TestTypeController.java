package app.controller;

import app.domain.mappers.ParameterCategoryMapper;
import app.domain.mappers.dto.ParameterCategoryDTO;
import app.domain.model.*;
import app.domain.stores.TestTypeStore;

import java.util.ArrayList;
import java.util.List;

public class TestTypeController {

    private Company company;
    private TestTypeStore store;
    private ParameterCategoryMapper parameterCategoryMapper;

    private List<ParameterCategory> pcList=new ArrayList<>();

    /**
     * Creates an empty Test Type controller
     */

    public TestTypeController() {
        this(App.getInstance().getCompany());
    }

    /**
     * Instance of a Test Type
     *
     * @param company the company that administrates the system
     */


    public TestTypeController(Company company) {
        this.company = company;
    }

    public void addCategoriesTopcList(ParameterCategoryDTO parameterCategoryDTO) {

        convertDTOintoCategory(parameterCategoryDTO);

    }

    /**
     * Creates a test type (Calling the TestType constructor implemented in the TestTypeStore)
     *
     * @param description      the Test type's description
     * @param testCode         the Test type's test code
     * @param collectingMethod the Test type's collecting method
     */

    public void CreateTestType(String description, String testCode, String collectingMethod) {
        store = company.getTestTypeStore();
        store.createTestType(description, testCode, collectingMethod, pcList);
    }

    /**
     * Transforms into string.
     *
     * @return the Test Type's info in string format
     */

    public String getTT() {
        return store.getTt().toString();
    }

    /**
     * Saves an instance Test type.
     *
     * @return the saving of an instance of a Test Type
     */

    public boolean saveTestType() {
        return this.store.saveTestType();
    }

    /**
     * Returns the list of test type already created
     *
     * @return the list of test type already created
     */

    public List<TestType> getTestTypeList() {
        return store.getTestTypeList();
    }

    public List<ParameterCategoryDTO> getCategoryListDto() {

        this.parameterCategoryMapper = new ParameterCategoryMapper();

        return parameterCategoryMapper.toDTO(getParameterCategoryList());

    }

    public List<ParameterCategory> getParameterCategoryList() {
        return this.company.getParameterCategoryList();
    }

    public void convertDTOintoCategory(ParameterCategoryDTO parameterCategoryDTO) {

        for (ParameterCategory pc : this.getParameterCategoryList()) {
            if (parameterCategoryDTO.getCode().equals(pc.getCode())) {
                pcList.add(pc);
            }
        }
    }
}