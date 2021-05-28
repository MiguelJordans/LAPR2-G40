package app.domain.stores;

import app.domain.model.ParameterCategory;

import java.util.ArrayList;
import java.util.List;

public class ParameterCategoryStore {

    static List<ParameterCategory> list = new ArrayList<>();
    ParameterCategory pc;

    /**
     * Creates a Parameter Category (Calling the parameter category constructor)
     *
     * @param description the Parameter Category's description
     * @param code the Parameter Category's code
     * @param nhsld the Parameter Category's nhsld
     * @return the parameter category created
     */

    public ParameterCategory createParameterCategory(String description,String code,String nhsld){
        return this.pc = new ParameterCategory(code,description,nhsld);
    }

    /**
     * Validates a parameter category
     *
     * @param pc the object parameter category
     * @return the validation of the parameter category being created
     */

    public boolean validateParameterCategory(ParameterCategory pc){
        if(pc==null||listContain(pc)){
            return false;
        }
        return true;
    }

    /**
     * Checks if the new objected created is already in the list
     *
     * @param pc the object parameter category
     * @return true if the list contains the parameter category and false if it doesn't
     */

    public boolean listContain(ParameterCategory pc){
        if(this.list.contains(pc)){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Saves an instance of parameter category.
     *
     * @return the saving of an instance of parameter category
     */

    public boolean saveParameterCategory(){
        if(validateParameterCategory(this.pc)){
            listAdd();
            return true;
        } else {
            return false;
        }
    }

    /**
     * Adds an instance of parameter category to the list.
     *
     * @return the addition of parameter category to the list
     */

    public boolean listAdd(){
        list.add(pc);
        return true;
    }

    /**
     * Replaces the element of the specified position in the list with the specified element.
     *
     * @param i the index of the element to replace
     * @return the element previously at the specified postion
     */

    public ParameterCategory getParameterCategory(int i){
        return list.get(i);
    }

    /**
     * Gets parameter category from the list.
     *
     * @return the parameter category requested
     */

    public ParameterCategory getPc() {
        return pc;
    }

    /**
     * Returns the list of parameter categories already created
     *
     * @return the list of parameter categories already created
     */

    public List<ParameterCategory> getParameterCategoryList() {
        return this.list;
    }

}

