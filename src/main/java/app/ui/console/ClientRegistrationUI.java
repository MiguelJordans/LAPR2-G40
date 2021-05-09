package app.ui.console;

import app.controller.ClientRegistrationController;
import app.ui.console.utils.Utils;

public class ClientRegistrationUI implements Runnable{

    private ClientRegistrationController ctrl;

    public ClientRegistrationUI() {
        this.ctrl = new ClientRegistrationController();
    }

    @Override
    public void run() {
        boolean count = true;
        boolean exception = false;
        do {
            try {
                String name = Utils.readLineFromConsole("Please enter the name of the client");
                String email = Utils.readLineFromConsole("Please enter the name of the client");
                String sex = Utils.readLineFromConsole("Please enter the sex of the client");
                String birthdate = Utils.readLineFromConsole("Please enter the birth date of the client");
                String citizenCardNumber = Utils.readLineFromConsole("Please enter the citizen card number of the client");
                String phoneNumber = Utils.readLineFromConsole("Please enter the phone number of the client");
                String tinNumber = Utils.readLineFromConsole("Please enter the TIN number of the client");
                String nhsNumber = Utils.readLineFromConsole("Please enter the NHS number of the client");
                ctrl.CreateClientRegistration(name, email, sex, birthdate, citizenCardNumber, phoneNumber, tinNumber, nhsNumber);
                exception = false;

            } catch (Exception e){
                e.printStackTrace();
                System.out.println("Incorrect input of data (an error has occured)! Please, try again.");
                exception = true;
            }
        } while (exception);

        count = Utils.confirm("Client created! Do you want to save it?" + ctrl.getCr());
        if (count) {
            if (ctrl.saveClientRegistration()) {
                System.out.println("Client was saved with success!");
            }
        }
    }

}
