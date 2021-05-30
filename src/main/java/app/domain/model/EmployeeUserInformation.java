package app.domain.model;

import app.domain.shared.Constants;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeUserInformation {

    public EmployeeUserInformation() {
        //Creation of the file with the Employee information
    }

    public void generateEmployeeInformation(String name, String email, String password, String role) {

        String filename = Constants.EMPLOYEE_USER_INFORMATION + "_" + name + ".txt";
        File clientNotification = new File(Constants.PATH_EMPLOYEE_USER_INFORMATION + filename);

        try (FileWriter fw = new FileWriter(clientNotification)) {
            fw.write(role + " INFORMATION: \n\nName: " + name + "\nEmail: " + email + "\nPassword: " + password);

        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("File couldn't be created!");
        }
    }
}
