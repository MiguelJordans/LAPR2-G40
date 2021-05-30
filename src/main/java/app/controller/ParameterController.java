package app.controller;

import app.mappers.ParameterCategoryMapper;
import app.mappers.dto.ParameterCategoryDTO;
import app.domain.model.*;
import app.domain.stores.ParameterStore;

import java.util.List;

public class ParameterController {

    private Company company;
    private ParameterStore store;
    private ParameterCategoryMapper parameterCategoryMapper;

    private ParameterCategory pc;

    /**
     * Creates an empty Parameter controller.
     */

    public ParameterController() {
        this(App.getInstance().getCompany());
    }

    /**
     * Instance of a Parameter.
     *
     * @param company - the company that administrates the system
     */

    public ParameterController(Company company) {
        this.company = company;
    }

    public void addCategory(ParameterCategoryDTO parameterCategoryDTO) {
        convertDTOintoCategory(parameterCategoryDTO);
    }

    /**
     * Creates a Parameter(Calling the Parameter constructor implemented in the parameterStore)
     *
     * @param description the parameter's description
     * @param code        the parameter's code
     * @param name        the parameter's name
     */

    public void createParameter(String description, String code, String name) {
        store = company.getParameterStore();
        store.createParameter(description, code, name, pc);
    }

    /**
     * Transforms into string.
     *
     * @return the Parameter's info in string format
     */

    public String getPP() {
        return store.getPp().toString();
    }

    /**
     * Saves an instance of Parameter.
     *
     * @return the saving of an instance of a Parameter.
     */

    public boolean saveParameter() {
        return this.store.saveParameter();
    }

    /**
     * Returns the list of parameters already created
     *
     * @return the list of parameters already created
     */

    public List<Parameter> getParameterList() {
        return store.getParameterList();
    }

    public List<ParameterCategory> getCategoryList() {
        return this.company.getParameterCategoryList();
    }

    public List<ParameterCategoryDTO> getCategoryListDto() {

        this.parameterCategoryMapper = new ParameterCategoryMapper();

        return parameterCategoryMapper.toDTO(getCategoryList());

    }

    public void convertDTOintoCategory(ParameterCategoryDTO parameterCategoryDTO) {

        for (ParameterCategory pt : this.getCategoryList()) {
            if (parameterCategoryDTO.getCode().equals(pt.getCode())) {
                this.pc = pt;
            }
        }
    }

}