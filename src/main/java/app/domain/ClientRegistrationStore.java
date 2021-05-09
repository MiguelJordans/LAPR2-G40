package app.domain;

import java.util.ArrayList;
import java.util.List;

public class ClientRegistrationStore {

    List<ClientRegistration> clientRegistrationList;
    ClientRegistration cr;

    public ClientRegistrationStore(){this.clientRegistrationList = new ArrayList<ClientRegistration>();}


    public ClientRegistration CreateClientRegistration(String name, String email, String sex, String birthdate, String citizenCardNumber, String phoneNumber, String tinNumber, String nhsNumber){
        return this.cr = new ClientRegistration(name, email, sex, birthdate, citizenCardNumber, phoneNumber, tinNumber, nhsNumber);
    }

    public boolean validateClientRegistration(ClientRegistration cr){

        if(cr == null||listContain(cr)){
            return false;
        }
        return true;

    }

    public boolean listContain(ClientRegistration cr){
        if(this.clientRegistrationList.contains(cr)){
            return true;
        } else {
            return false;
        }
    }

    public boolean saveClientRegistration(){
        if(validateClientRegistration(this.cr)){
            listAdd(cr);
            return true;
        } else {
            return false;
        }

    }

    public boolean listAdd(ClientRegistration cr){
        clientRegistrationList.add(cr);
        return true;
    }

    public ClientRegistration getClientRegistration(int i) {
        return clientRegistrationList.get(i);
    }

    public ClientRegistration getCr() {
        return cr;
    }
}
