package app.domain.stores;

import app.domain.model.Parameter;
import app.domain.model.ParameterCategory;

import java.util.ArrayList;
import java.util.List;

public class ParameterStore {

    List<Parameter> list;
    Parameter pp;

    /**
     * Constructor.
     */

    public ParameterStore() {
        this.list = new ArrayList<>();
    }

    /**
     * Creates a Parameter (Calling the Parameter constructor)
     *
     * @param description the Parameter's description
     * @param code        the Parameter's code
     * @param name        the Parameter's name
     * @return the parameter created
     */

    public Parameter createParameter(String description, String code, String name, List<ParameterCategory> pcList) {

        this.pp = new Parameter(code, description, name, pcList);

        return this.pp;
    }

    /**
     * Validates a parameter
     *
     * @param pp the object Parameter
     * @return the validation of the Parameter being created
     */


    public boolean validateParameter(Parameter pp) {
        if (pp == null || listContain(pp)) {
            return false;
        }
        return true;
    }

    /**
     * Checks if the new objected created is already in the list
     *
     * @param pp the object parameter
     * @return true if the list contains the parameter and false if it doesn't
     */

    public boolean listContain(Parameter pp) {
        if (this.list.contains(pp)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Saves an instance of parameter.
     *
     * @return the saving of an instance of a parameter.
     */

    public boolean saveParameter() {
        if (validateParameter(this.pp)) {
            listAdd(pp);
            return true;
        } else {
            return false;
        }

    }

    /**
     * Adds an instance of parameter to the list.
     *
     * @param pp - the parameter object
     * @return the addition of the parameter to the list
     */

    public boolean listAdd(Parameter pp) {
        list.add(pp);
        return true;
    }

    /**
     * Replaces the element of the specified position in the list with the specified element.
     *
     * @param i the index of the element to replace
     * @return the element previously at the specified postion
     */

    public Parameter getParameter(int i) {
        return list.get(i);
    }

    /**
     * Gets Parameter from the list.
     *
     * @return the parameter requested
     */

    public Parameter getPp() {
        return pp;
    }

    /**
     * Returns the list of parameters already created
     *
     * @return the list of parameters already created
     */

    public List<Parameter> getParameterList() {
        return list;
    }
}