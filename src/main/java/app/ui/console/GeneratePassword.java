package app.ui.console;

import org.apache.commons.lang3.RandomStringUtils;

public class GeneratePassword {

    private String password;

    public GeneratePassword(){

    }

    public String password(){

       return password= RandomStringUtils.randomAlphabetic(10);

    }

    public String getPassword(){
        return password;
    }

}
