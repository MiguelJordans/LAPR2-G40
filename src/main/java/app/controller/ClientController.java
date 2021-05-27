package app.controller;

import app.domain.model.Client;
import app.domain.model.ClientStore;
import app.domain.model.Company;

import java.util.Date;


public class ClientController {

    private Company company;
    private ClientStore store;

    /**
     * Creates an empty Client controller.
     */

    public ClientController() {
        this(App.getInstance().getCompany());
    }

    /**
     * Instance of a Client.
     *
     * @param company - the company that administrates the system.
     */

    public ClientController(Company company) {
        this.company = company;
    }

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

    public void CreateClient(String name, String email, String sex, Date birthdate, String citizenCardNumber, String phoneNumber, String tinNumber, String nhsNumber) {
        store = company.getClientStore();
        store.CreateClient(name, email, sex, birthdate, citizenCardNumber, phoneNumber, tinNumber, nhsNumber);
    }

    /**
     * Transforms into string.
     *
     * @return the Client's info in string format
     */

    public Client getCr() {
        return store.getCr();
    }

    /**
     * Saves an instance of Client.
     *
     * @return the saving of an instance of a Client.
     */

    public boolean saveClient() {
        return this.store.saveClient();
    }

    public void generateUserInformation(String name, String email,String role) {

        store.generateUserInformation(name,email,role);

    }
}
