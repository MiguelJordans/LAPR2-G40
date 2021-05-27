package app.domain.model;

import app.ui.console.GeneratePassword;
import auth.AuthFacade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ClientStore {

    List<Client> clientList;
    Client cr;
    private GeneratePassword gp = new GeneratePassword();
    private ClientNotification cn = new ClientNotification();

    /**
     * Constructor.
     */

    public ClientStore(){this.clientList = new ArrayList<Client>();}

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

    public Client CreateClient(String name, String email, String sex, Date birthdate, String citizenCardNumber, String phoneNumber, String tinNumber, String nhsNumber){
        return this.cr = new Client(name, email, sex, birthdate, citizenCardNumber, phoneNumber, tinNumber, nhsNumber);
    }

    /**
     * Validates a Client Registration.
     *
     * @param cr - the object Client.
     * @return the validation of the Client being created.
     */

    public boolean validateClient(Client cr){

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

    public boolean listContain(Client cr){
        if(this.clientList.contains(cr)){
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

    public boolean saveClient(){
        if(validateClient(this.cr)){
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

    public boolean listAdd(Client cr){
        clientList.add(cr);
        return true;
    }

    /**
     * Replaces the element at the specified position in the list with the specified element.
     *
     * @param i - the index of the element to replace.
     * @return the element previously at the specified position.
     */

    public Client getClient(int i) {
        return clientList.get(i);
    }

    /**
     * Gets Client from the list.
     *
     * @return the Client requested.
     */

    public Client getCr() {
        return cr;
    }


    public boolean checkExistingClient(String citizenCardNumber){

        for (Client client : clientList){
            if (client.getCitizenCardNumber().equalsIgnoreCase(citizenCardNumber)) {
                return true;
            }

        }
        return false;
    }

    public List<Client> getClientList() {
        return this.clientList;
    }

    public void generateUserInformation(String name, String email,String role) {

        gp.password();

        String password = gp.getPassword();

        cn.generateClientNotification(name,email,password);

        AuthFacade cc = new AuthFacade();

        if(!cc.existsUser(email)){
            role = role.toUpperCase(Locale.ROOT);
            cc.addUserWithRole(name,email,password,role);
        }

    }
}
