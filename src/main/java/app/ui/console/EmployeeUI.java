package app.ui.console;

import app.controller.RegisterEmployeeController;
import app.domain.Employee;
import app.ui.console.utils.Utils;


public class EmployeeUI implements Runnable {


    private RegisterEmployeeController ctrl;

    public EmployeeUI() {

        this.ctrl = new RegisterEmployeeController();

    }


    @Override
    public void run() {

        boolean count = true;
        boolean exception = false;

        do {

            try {

                String orgRole = Utils.readLineFromConsole("Please enter the employee's organization role, choose between \"employee\" and \"specialistdoctor\"");

                if (orgRole.equals("specialistdoctor")) {
                    String name = Utils.readLineFromConsole("Please enter the name of the employee");
                    String address = Utils.readLineFromConsole("Please enter the address of the employee");
                    String email = Utils.readLineFromConsole("Please enter the email of the employee");
                    String phoneNumber = Utils.readLineFromConsole("Please enter the phone number of the employee");
                    String employeeId = Utils.readLineFromConsole("Please enter the Employee ID of the employee");
                    String socCode = Utils.readLineFromConsole("Please enter the SOC Code of the employee");
                    String doctorIndexNumber = Utils.readLineFromConsole("Please enter the Doctor Index Number");
                    ctrl.Employee(name, address, email, phoneNumber, employeeId, socCode, orgRole, doctorIndexNumber);
                } else {
                    String name = Utils.readLineFromConsole("Please enter the name of the employee");
                    String address = Utils.readLineFromConsole("Please enter the address of the employee");
                    String email = Utils.readLineFromConsole("Please enter the email of the employee");
                    String phoneNumber = Utils.readLineFromConsole("Please enter the phone number of the employee");
                    String employeeId = Utils.readLineFromConsole("Please enter the Employee ID of the employee");
                    String socCode = Utils.readLineFromConsole("Please enter the SOC Code of the employee");
                    ctrl.Employee(name, address, email, phoneNumber, employeeId, socCode, orgRole,"111111");
                }

                exception = false;

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Incorrect input of data (an error has occured)! Please, try again.");
                exception = true;
            }

        } while (exception);

        count = Utils.confirm("Employee created! Do you want to save it?" + ctrl.getEmp());
        if (count) {
            if (ctrl.SaveEmployee()) {
<<<<<<< HEAD
                System.out.println("Client was saved with success!");
                System.out.println("Going to generate a new password.");

=======
                System.out.println("Employee was saved with success!");
>>>>>>> 8f1b4ca68415a3cd92bfee29e722351925694e8a

            }
        }
    }
}