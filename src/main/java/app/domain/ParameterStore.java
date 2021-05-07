package app.domain;

import java.util.ArrayList;
import java.util.List;

public class ParameterStore {

    List<Parameter> list;
    Parameter pp;

    public ParameterStore(){this.list = new ArrayList<Parameter>();}

    public Parameter CreateParameter(String description,String code,String name){
        return this.pp = new Parameter(code,description,name);
    }

    public boolean validateParameter(Parameter pp){
        if(pp==null||listContain(pp)){
            return false;
        }
        return true;
    }

    public boolean listContain(Parameter pp){
        if(this.list.contains(pp)){
            return true;
        } else {
            return false;
        }
    }

    public boolean saveParameter(){
        if(validateParameter(this.pp)){
            listAdd(pp);
            return true;
        } else {
            return false;
        }

    }

    public boolean listAdd(Parameter pp){
        list.add(pp);
        return true;
    }

    public Parameter getParameter(int i){
        return list.get(i);
    }

    public Parameter getPp() {
        return pp;
    }
}
