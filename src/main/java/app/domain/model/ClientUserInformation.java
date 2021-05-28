package app.domain.model;

import app.domain.shared.Constants;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ClientUserInformation {

    public ClientUserInformation(){
           //Objected created in order to create the email to the client
    }

    public void generateClientUserInformation(String name,String email,String password)  {

        String filename = Constants.CLIENT_USER_INFORMATION+"_"+name+".txt";
        File clientNotification = new File(Constants.PATH_CLIENT_USER_INFORMATION+filename);

        try(FileWriter fw = new FileWriter(clientNotification)){
            fw.write("CLIENT INFORMATION: \n\nName: "+name+"\nEmail: "+email+"\nPassword: "+password);

        } catch (IOException e){
            System.out.println(e.getMessage());
            System.out.println("File couldn't be created!");
        }
    }
}
