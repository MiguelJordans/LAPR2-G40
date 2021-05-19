package app.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientRegistrationStore {

    List<ClientRegistration> clientRegistrationList;
    ClientRegistration cr;

    /**
     * Constructor.
     */

    public ClientRegistrationStore(){this.clientRegistrationList = new ArrayList<ClientRegistration>();}

    /**
     * Creates a Client.
     *
     * @param name - the Client's name.
     * @param email - the Client's email.
     * @param sex - the Client's sex.
     * @param birthdate - the Client's birth date.
     * @param citizenCardNumber - the Client's citizen card number.
     * @param phoneNumber - the Client's phone number.
     * @param tinNumber - the Client's TIN number.
     * @param nhsNumber - the Client's NHS number.
     */

    public ClientRegistration CreateClientRegistration(String name, String email, String sex, String birthdate, String citizenCardNumber, String phoneNumber, String tinNumber, String nhsNumber){
        return this.cr = new ClientRegistration(name, email, sex, birthdate, citizenCardNumber, phoneNumber, tinNumber, nhsNumber);
    }

    /**
     * Validates a Client Registration.
     *
     * @param cr - the object Client.
     * @return the validation of the Client being created.
     */

    public boolean validateClientRegistration(ClientRegistration cr){

        if(cr == null||listContain(cr)){
            return false;
        }
        return true;

    }

    /**
     * Checks if the new object created is already in the list.
     *
     * @param cr - the object Client.
     * @return true if the list contains the Client and false if it doesn't.
     */

    public boolean listContain(ClientRegistration cr){
        if(this.clientRegistrationList.contains(cr)){
            return true;
        } else {
            return false;
        }
    }

    /**
     * Saves an instance of Client.
     *
     * @return the saving of an instance of a Client.
     */

    public boolean saveClientRegistration(){
        if(validateClientRegistration(this.cr)){
            listAdd(cr);
            return true;
        } else {
            return false;
        }

    }

    /**
     * Adds an instance of Client to the list.
     *
     * @param cr - the object Client.
     * @return the addition of the Client to the list.
     */

    public boolean listAdd(ClientRegistration cr){
        clientRegistrationList.add(cr);
        return true;
    }

    /**
     * Replaces the element at the specified position in the list with the specified element.
     *
     * @param i - the index of the element to replace.
     * @return the element previously at the specified position.
     */

    public ClientRegistration getClientRegistration(int i) {
        return clientRegistrationList.get(i);
    }

    /**
     * Gets Client from the list.
     *
     * @return the Client requested.
     */

    public ClientRegistration getCr() {
        return cr;
    }
}
