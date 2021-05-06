package app.controller;

import app.domain.model.ClientRegistrationStore;
import app.domain.model.Company;
import auth.AuthFacade;


public class CreateClientRegistrationController {

    private Company company;
    private AuthFacade authFacade;

    private CreateClientRegistrationController app;

    private ClientRegistrationStore store = null;

    public CreateClientRegistrationController() {
        this(App.getInstance().getCompany());
    }

    public CreateClientRegistrationController(Company company) {
        this.company = company;
        this.app = null;
    }

    public boolean doLogin(String email, String pwd) {
        try {
            return this.app.doLogin(email, pwd);
        } catch(IllegalArgumentException exc) {
            return false;
        }
    }

    public ClientRegistrationStore CreateClientRegistration(String name, String email, String sex, String birthdate, long citizenCardNumber, long phoneNumber, long tinNumber, long nhsNumber){
        return store = this.CreateClientRegistration(name, email, sex, birthdate, citizenCardNumber, phoneNumber, tinNumber, nhsNumber);
    }

}
