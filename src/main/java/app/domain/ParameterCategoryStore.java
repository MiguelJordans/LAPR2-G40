package app.domain;

import java.util.ArrayList;
import java.util.List;

public class ParameterCategoryStore {

    static List<ParameterCategory> list = new ArrayList<ParameterCategory>();
    ParameterCategory pc;

    public ParameterCategoryStore(){}

    public ParameterCategory CreateParameterCategory(String description,String code,String nhsld){
        return this.pc = new ParameterCategory(code,description,nhsld);
    }

    public boolean validateParameterCategory(ParameterCategory pc){
        if(pc==null||listContain(pc)){
            return false;
        }
        return true;
    }

    public boolean listContain(ParameterCategory pc){
        if(this.list.contains(pc)){
            return true;
        } else {
            return false;
        }
    }

    public boolean saveParameterCategory(){
        if(validateParameterCategory(this.pc)){
            listAdd(pc);
            return true;
        } else {
            return false;
        }

    }

    public boolean listAdd(ParameterCategory c){
        list.add(pc);
        return true;
    }

    public ParameterCategory getParameterCategory(int i){
        return list.get(i);
    }

    public ParameterCategory getPc() {
        return pc;
    }

    public List<ParameterCategory> getParameterCategoryList() {
        return this.list;
    }

}

