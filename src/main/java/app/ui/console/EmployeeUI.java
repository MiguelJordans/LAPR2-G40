package app.ui.console;

import app.controller.RegisterEmployeeController;
import app.controller.SpecialistDoctorController;
import app.domain.model.OrgRole;
import app.domain.shared.Constants;
import app.ui.console.utils.Utils;

public class EmployeeUI implements Runnable {


    private RegisterEmployeeController ctrl;
    private SpecialistDoctorController ctrl1;
    private OrgRole orgRoles;

    public EmployeeUI() {

        this.ctrl = new RegisterEmployeeController();

        this.ctrl1= new SpecialistDoctorController();

        this.orgRoles = new OrgRole();

    }

    String orgRole=null;

    @Override
    public void run() {

        boolean count = true;
        boolean exception = false;
        boolean m = true;

        do {
            do {

                try {

                    System.out.println("\n\n");
                    orgRoles.orgRoles();

                    orgRole = Utils.readLineFromConsole("Please enter the employee's organization role: ");

                    if (orgRole.equals(Constants.ROLE_SPECIALIST_DOCTOR) || orgRole.equals(Constants.ROLE_RECEPTIONIST) || orgRole.equals(Constants.ROLE_MEDICAL_LAB_TECHNICIAN) || orgRole.equals(Constants.ROLE_CLINICAL_CHEMISTRY_TECHNOLOGIST)||orgRole.equals(Constants.ROLE_LABORATORY_COORDINATOR)) {
                        m=false;
                    }
                    else {
                        System.out.println("Please choose a valid role!");
                    }

                    String name = Utils.readLineFromConsole("Please enter the name of the employee: ");
                    String address = Utils.readLineFromConsole("Please enter the address of the employee: ");
                    String email = Utils.readLineFromConsole("Please enter the email of the employee: ");
                    String phoneNumber = Utils.readLineFromConsole("Please enter the phone number of the employee: ");
                    String socCode = Utils.readLineFromConsole("Please enter the SOC Code of the employee: ");

                    if (orgRole.equals(Constants.ROLE_SPECIALIST_DOCTOR)) {
                        String doctorIndexNumber = Utils.readLineFromConsole("Please enter the Doctor Index Number: ");
                        ctrl1.SpecialistDoctor(name, address, email, phoneNumber, socCode, orgRole, doctorIndexNumber);
                    } else {
                        ctrl.Employee(name, address, email, phoneNumber, socCode, orgRole);
                    }

                    exception = false;

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println("Incorrect input of data (an error has occured)! Please, try again.");
                    exception = true;
                }

            }while (m);

        } while (exception);

        if(orgRole.equals(Constants.ROLE_SPECIALIST_DOCTOR)){
            count = Utils.confirm("Specialist doctor created! Do you want to save it(s/n)? " + ctrl1.getSp().toString());
            if (count && ctrl1.saveSpecialistDoctor()) {

                    System.out.println("Save successful!");
                    ctrl1.generateUserInformation(this.ctrl.getEmp().getName(),this.ctrl.getEmp().getEmail(),this.ctrl.getEmp().getOrgRole());

            }
        } else

        count = Utils.confirm(ctrl.getEmp().getOrgRole()+" created! Do you want to save it(s/n)? " + ctrl.getEmp().toString());
        if (count && ctrl.SaveEmployee()) {
                System.out.println("Save successful!");
                ctrl.generateUserInformation(this.ctrl.getEmp().getName(),this.ctrl.getEmp().getEmail(),this.ctrl.getEmp().getOrgRole());

        }
    }
}