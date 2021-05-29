package app.domain.model;

import org.junit.Test;

public class ClientUserInformationTest {

    @Test
    public void generateClientUserInformation(){

        ClientUserInformation ci = new ClientUserInformation();

        ci.generateClientUserInformation("Jordao","1201487@isep.ipp.pt","1234567890");

    }

}