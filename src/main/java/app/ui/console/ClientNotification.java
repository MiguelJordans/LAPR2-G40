package app.ui.console;

import app.domain.shared.Constants;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ClientNotification {

    public ClientNotification(){

    }

    public void generateClientNotification(String name,String email,String password)  {

        String filename = Constants.CLIENT_NOTIFICATION+"_"+name;
        File clientNotification = new File(Constants.PATH_CLIENT+filename);

        try{
            FileWriter fw = new FileWriter(clientNotification);
            fw.write("CLIENT INFORMATION: \n\n Name: "+name+"\nEmail: "+email+"\nPassword: "+password);
            fw.close();
        } catch (IOException e){
            e.getMessage();
            System.out.println("File couldn't be created!");
        }

    }

}
