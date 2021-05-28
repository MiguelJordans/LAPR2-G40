package app.ui.console;

import app.controller.ClientController;
import app.domain.stores.ClientStore;
import app.ui.console.utils.Utils;

import java.util.Date;


public class ClientUI implements Runnable{

    private ClientController ctrl;
    private ClientStore clientStore;

    public ClientUI() {

        this.ctrl = new ClientController();
    }

    @Override
    public void run() {
        boolean count = true;
        boolean exception = false;
        do {
            try {
                String name = Utils.readLineFromConsole("Please enter the name of the client: ");
                String email = Utils.readLineFromConsole("Please enter the email1 of the client: ");
                String sex = Utils.readLineFromConsole("Please enter the sex of the client: ");
                Date birthdate = Utils.readDateFromConsole("Please enter the birth date of the client: ");
                String citizenCardNumber = Utils.readLineFromConsole("Please enter the citizen card number of the client: ");
                String phoneNumber = Utils.readLineFromConsole("Please enter the phone number of the client: ");
                String tinNumber = Utils.readLineFromConsole("Please enter the TIN number of the client: ");
                String nhsNumber = Utils.readLineFromConsole("Please enter the NHS number of the client: ");
                ctrl.CreateClient(name, email, sex, birthdate, citizenCardNumber, phoneNumber, tinNumber, nhsNumber);
                exception = false;

            } catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Incorrect input of data (an error has occured)! Please, try again.");
                exception = true;
            }
        } while (exception);

        count = Utils.confirm("Client created! Do you want to save it(s/n)?" + ctrl.getCr().toString());
        if (count) {
            if (ctrl.saveClient()) {
                System.out.println("Save successful!");
                ctrl.generateUserInformation(this.ctrl.getCr().getName(),this.ctrl.getCr().getEmail(),"client");
            }
        }
    }

}
