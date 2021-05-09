package app.controller;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientRegistrationControllerTest {

    @Test
    public void testCreateClientRegistration() {

        ClientRegistrationController cctrl = new ClientRegistrationController();

    }

    @Test
    public void createValidClientRegistration() {

        ClientRegistrationController cctrl = new ClientRegistrationController();
        cctrl.CreateClientRegistration("Jason", "2344@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634","7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void createInvalidClientRegistration() {

        ClientRegistrationController cctrl = new ClientRegistrationController();
        cctrl.CreateClientRegistration("+++++", "2344@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634","7468496874", "7456375876");

    }

    @Test
    public void getCr() {

        ClientRegistrationController cctrl = new ClientRegistrationController();

        cctrl.CreateClientRegistration("Jason", "2344@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634","7468496874", "7456375876");

        String expected = "Client: " + "Jason" + ", Email: " + "2344@gmail.com" + ", Sex: " + "Male" + ", Birth date: " + "23/06/1999" +
                ", Citizen Card Number: " + "5647748895858574" + ", Phone Number: " + "05968742634" +
                ", TIN Number: " + "7468496874" + ", NHS Number: " + "7456375876";
        String verify = (cctrl.getCr());

        Assert.assertEquals(expected, verify);
    }

    @Test (expected = IllegalArgumentException.class)
    public void getInvalidCr() {

        ClientRegistrationController cctrl = new ClientRegistrationController();

        cctrl.CreateClientRegistration("+++++", "2344@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634","7468496874", "7456375876");

        String expected = "Client: " + "+++++" + ", Email: " + "2344@gmail.com" + ", Sex: " + "Male" + ", Birth date: " + "23/06/1999" +
                ", Citizen Card Number: " + "5647748895858574" + ", Phone Number: " + "05968742634" +
                ", TIN Number: " + "7468496874" + ", NHS Number: " + "7456375876";
        String verify = (cctrl.getCr());

        Assert.assertEquals(expected, verify);
    }


    @Test
    public void saveValidClientRegistration() {

        ClientRegistrationController cctrl = new ClientRegistrationController();
        cctrl.CreateClientRegistration("Jason", "2344@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634","7468496874", "7456375876");

        Assert.assertTrue(cctrl.saveClientRegistration());

    }

    @Test (expected = IllegalArgumentException.class)
    public void saveInvalidClientRegistration() {

        ClientRegistrationController cctrl = new ClientRegistrationController();
        cctrl.CreateClientRegistration("--------", "2344@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634","7468496874", "7456375876");

        Assert.assertTrue(cctrl.saveClientRegistration());

    }


}