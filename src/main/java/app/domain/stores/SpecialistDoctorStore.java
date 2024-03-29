package app.domain.stores;

import app.domain.model.Company;
import app.domain.model.EmployeeUserInformation;
import app.domain.model.SpecialistDoctor;
import app.ui.console.GeneratePassword;
import auth.AuthFacade;

import java.util.ArrayList;
import java.util.List;


public class SpecialistDoctorStore {

    List<SpecialistDoctor> specialistDoctorList;
    SpecialistDoctor sd;

    private final GeneratePassword gp = new GeneratePassword();
    private final EmployeeUserInformation ei = new EmployeeUserInformation();

    private static int employeeN;

    /**
     * Constructor.
     */
    public SpecialistDoctorStore() {
        this.specialistDoctorList = new ArrayList<>();
    }

    /**
     * Creates an instance of an Employee.
     *
     * @param name        - the Employee's name
     * @param address     - the Employee's address
     * @param email       - the Employee's email
     * @param phoneNumber - the Employee's phone number
     * @param socCode     - the Employee's SOC Code
     * @param orgRole     - the Employee's organization role
     */

    public SpecialistDoctor newSpecialistDoctor(String name, String address, String email, String phoneNumber, String socCode, String orgRole, String doctorIndexNumber) {

        String iD = generateEmployeeID(name);

        this.sd = new SpecialistDoctor(name, address, email, phoneNumber, iD, socCode, orgRole, doctorIndexNumber);

        return this.sd;
    }

    /**
     * Validates an instance of an Employee.
     *
     * @return the validation of the Employee being created
     */

    public boolean validateSpecialistDoctor(SpecialistDoctor sd) {

        if (sd == null || listContain(sd)) {
            return false;
        }
        return true;

    }

    /**
     * Checks if the new object Employee is already in the list.
     *
     * @return true if the list contains the Employee and false if it doesn't
     */

    public boolean listContain(SpecialistDoctor sd) {
        if (this.specialistDoctorList.contains(sd)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Saves an instance of Employee
     *
     * @return the saving of an instance of a Employee
     */

    public boolean saveEmployee() {
        if (validateSpecialistDoctor(this.sd)) {
            listAdd(sd);
            return true;
        } else {
            return false;
        }

    }

    /**
     * Adds an instance of Employee to the list
     *
     * @return the addition of Employee to the list
     */

    public boolean listAdd(SpecialistDoctor sd) {
        specialistDoctorList.add(sd);
        return true;
    }


    /**
     * Replaces the element at the specified position in the list with the specified element.
     *
     * @param i - the index of the element to replace
     * @return the element previously at the specified position
     */

    public SpecialistDoctor getSpecialistDoctor(int i) {
        return specialistDoctorList.get(i);
    }


    /**
     * Gets Employee from the list.
     *
     * @return the Employee requested
     */

    public SpecialistDoctor getSD() {
        return sd;
    }


    /**
     * Gets the SpecialistDoctor list
     *
     * @return the SpecialistDoctor list
     */

    public List<SpecialistDoctor> getSpecialistDoctorList() {
        return this.specialistDoctorList;
    }

    /**
     * Generates the SpecialistDoctor ID
     *
     * @param name the name of the Specialist Doctor
     * @return the ID of the Specialist Doctor
     */

    public String generateEmployeeID(String name) {

        String employeID;
        StringBuilder chars = new StringBuilder();

        String[] idName = name.split("");

        for (String s : idName) {
            chars.append(s.charAt(0));
        }
        employeID = chars + String.format("%05d", employeeN);

        return employeID;
    }

    /**
     * Generates the file with the SpecialistDoctor user information
     *
     * @param name    the name of the Specialist Doctor
     * @param email   the email of the Specialist Doctor
     * @param role    the role of the Specialist Doctor
     * @param company the geral company
     */

    public void generateUserInformation(String name, String email, String role, Company company) {

        gp.password();

        String password = gp.getPassword();

        ei.generateEmployeeInformation(name, email, password, role);

        AuthFacade cc = company.getAuthFacade();

        if (!cc.existsUser(email)) {
            cc.addUserWithRole(name, email, password, role);
        }

        System.out.println("Employee information: " + role + "\nEmail: " + email + "\nPassword: " + password);

    }

}
