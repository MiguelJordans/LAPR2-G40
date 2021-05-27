package app.domain.model;

import app.ui.console.GeneratePassword;
import auth.AuthFacade;

import java.util.ArrayList;
import java.util.List;


public class SpecialistDoctorStore {

    List <SpecialistDoctor> specialistDoctorList;
    SpecialistDoctor sd;

    private GeneratePassword gp = new GeneratePassword();

    private static int employeeN;

    /**
     * Constructor
     */
    public SpecialistDoctorStore(){this.specialistDoctorList = new ArrayList<>();}

    /**
     * Creates an instance of an Employee.
     *
     * @param name                   - the Employee's name
     * @param address                - the Employee's address
     * @param email                  - the Employee's email
     * @param phoneNumber            - the Employee's phone number
     * @param socCode                - the Employee's SOC Code
     * @param orgRole                - the Employee's organization role
     */

    public SpecialistDoctor NewSpecialistDoctor (String name, String address, String email, String phoneNumber, String socCode, String orgRole, String doctorIndexNumber){

        String ID = generateEmployeeID(name);

        return this.sd = new SpecialistDoctor(name, address, email, phoneNumber, ID, socCode, orgRole, doctorIndexNumber);
    }

    /**
     * Validates an instance of an Employee.
     *

     * @return the validation of the Employee being created
     */

    public boolean validateSpecialistDoctor (SpecialistDoctor sd){

        if (sd == null || listContain(sd)){
            return false;
        }
        return true;

    }

    /**
     *
     * Checks if the new object Employee is already in the list.
     *
     *
     *

     * @return true if the list contains the Employee and false if it doesn't
     */

    public boolean listContain(SpecialistDoctor sd){
        if(this.specialistDoctorList.contains(sd)){
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

    public boolean saveEmployee(){
        if(validateSpecialistDoctor(this.sd)){
            listAdd(sd);
            return true;
        } else {
            return false;
        }

    }

    /**
     * Adds an instance of Employee to the list
     *
     *

     * @return the addition of Employee to the list
     */

    public boolean listAdd(SpecialistDoctor sd){
        specialistDoctorList.add(sd);
        return true;
    }


    /**
     * Replaces the element at the specified position in the list with the specified element.
     *
     * @param i - the index of the element to replace
     * @return the element previously at the specified position
     */

    public SpecialistDoctor getSpecialistDoctor(int i){
        return specialistDoctorList.get(i);
    }


    /**
     * Gets Employee from the list.
     *
     *
     * @return the Employee requested
     */

    public SpecialistDoctor getSD (){
        return sd;
    }


    public List<SpecialistDoctor> getSpecialistDoctorList() {
        return this.specialistDoctorList;
    }

    public String generateEmployeeID(String name){

        String employeID;
        StringBuilder chars = new StringBuilder();

        String[] idName = name.split("");

        for(String s : idName){
            chars.append(s.charAt(0));
        }
        employeID = chars + String.format("%05d",employeeN);

        return employeID;
    }

    public void generateUserInformation(String name, String email, String role) {

        gp.password();

        String password = gp.getPassword();

        AuthFacade cc = new AuthFacade();

        if(!cc.existsUser(email)){
            cc.addUserWithRole(name,email,password,role);
        }

        System.out.println("Employee information: "+role+"\nEmail: "+email+"\nPassword: "+password);

    }

}
