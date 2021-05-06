package app.domain.model;

import java.util.ArrayList;
import java.util.List;

public class ClientRegistrationStore {

    List<ClientRegistration> list;
    ClientRegistration cr;

    public ClientRegistrationStore(){this.list = new ArrayList<ClientRegistration>();}


    public ClientRegistration CreateClientRegistration(String name, String email, String sex, String birthdate, long citizenCardNumber, long phoneNumber, long tinNumber, long nhsNumber){
        return this.cr = new ClientRegistration(name, email, sex, birthdate, citizenCardNumber, phoneNumber, tinNumber, nhsNumber);
    }

    public boolean ValidateClientRegistration(ClientRegistration cr){

        if(cr == null||listContain(cr)){
            return false;
        }
        return true;

    }

    public boolean listContain(ClientRegistration cr){
        if(this.list.contains(cr)){
            return true;
        } else {
            return false;
        }
    }

    public boolean SaveClientRegistration(){
        if(ValidateClientRegistration(this.cr)){
            listAdd(cr);
            return true;
        } else {
            return false;
        }

    }

    public boolean listAdd(ClientRegistration cr){
        list.add(cr);
        return true;
    }

}
