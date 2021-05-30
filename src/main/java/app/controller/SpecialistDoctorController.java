package app.controller;

import app.domain.model.*;
import app.domain.stores.SpecialistDoctorStore;

public class SpecialistDoctorController {

    private Company company;
    private SpecialistDoctorStore store;

    /**
     * Creates an empty Register Employee controller.
     */

    public SpecialistDoctorController() {
        this(App.getInstance().getCompany());
    }

    /**
     * Instance of a New Employee.
     *
     * @param company - the company that administrates the system
     */

    public SpecialistDoctorController(Company company) {
        this.company = company;
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

    public void SpecialistDoctor(String name, String address, String email, String phoneNumber, String socCode, String orgRole, String doctorIndexNumber) {
        store = company.getSpecialistDoctorStore();
        store.newSpecialistDoctor(name, address, email, phoneNumber, socCode, orgRole, doctorIndexNumber);
    }


    /**
     * Transforms into string.
     *
     * @return the Employee's info in string format
     */

    public SpecialistDoctor getSp() {
        return store.getSD();
    }

    /**
     * Saves an instance of an Employee.
     *
     * @return the saving of an Employee
     */

    public boolean saveSpecialistDoctor() {
        return this.store.saveEmployee();
    }

    public void generateUserInformation(String name, String email, String role) {

        store.generateUserInformation(name, email, role, company);

    }


}
