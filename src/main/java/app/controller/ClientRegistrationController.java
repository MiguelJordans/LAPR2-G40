package app.controller;

import app.domain.ClientRegistrationStore;
import app.domain.Company;


public class ClientRegistrationController {

    private Company company;
    private ClientRegistrationStore store;

    public ClientRegistrationController() {
        this(App.getInstance().getCompany());
    }

    public ClientRegistrationController(Company company) {
        this.company = company;
    }

    public void CreateClientRegistration(String name, String email, String sex, String birthdate, String citizenCardNumber, String phoneNumber, String tinNumber, String nhsNumber) {
        store = company.getClientRegistrationStore();
        store.CreateClientRegistration(name, email, sex, birthdate, citizenCardNumber, phoneNumber, tinNumber, nhsNumber);
    }

    public String getCr() {
        return store.getCr().toString();
    }

    public boolean saveClientRegistration() {
        return this.store.saveClientRegistration();
    }

}
