package app.controller;

import app.domain.model.ClientRegistrationStore;
import app.domain.model.Company;


public class ClientRegistrationController {

    private Company company;
    private ClientRegistrationStore store;

    /**
     * Creates an empty Client controller.
     */

    public ClientRegistrationController() {
        this(App.getInstance().getCompany());
    }

    /**
     * Instance of a Client.
     *
     * @param company - the company that administrates the system.
     */

    public ClientRegistrationController(Company company) {
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

    public void CreateClientRegistration(String name, String email, String sex, String birthdate, String citizenCardNumber, String phoneNumber, String tinNumber, String nhsNumber) {
        store = company.getClientRegistrationStore();
        store.CreateClientRegistration(name, email, sex, birthdate, citizenCardNumber, phoneNumber, tinNumber, nhsNumber);
    }

    /**
     * Transforms into string.
     *
     * @return the Client's info in string format
     */

    public String getCr() {
        return store.getCr().toString();
    }

    /**
     * Saves an instance of Client.
     *
     * @return the saving of an instance of a Client.
     */

    public boolean saveClientRegistration() {
        return this.store.saveClientRegistration();
    }

}
