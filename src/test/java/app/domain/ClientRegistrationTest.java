package app.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientRegistrationTest {

    @Test
    public void setName() {

        ClientRegistration cr = new ClientRegistration("Jason", "2344@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634","7468496874", "7456375876");

        String expected = "Waterson";
        cr.setName(expected);

        String verify = cr.getName();
        Assert.assertEquals(expected, verify);

    }

    @Test
    public void setEmail() {

        ClientRegistration cr = new ClientRegistration("Jack", "2344@gmail.com", "Male", "29/01/1989",
                "5647748333858574", "05968742634","7468496874", "7456375876");

        String expected = "fish@hotmail.com";
        cr.setEmail(expected);

        String verify = cr.getEmail();
        Assert.assertEquals(expected, verify);

    }

    @Test
    public void setSex() {

        ClientRegistration cr = new ClientRegistration("Mary", "2344@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634","7468496874", "7456375876");

        String expected = "Female";
        cr.setSex(expected);

        String verify = cr.getSex();
        Assert.assertEquals(expected, verify);

    }

    @Test
    public void setBirthdate() {

        ClientRegistration cr = new ClientRegistration("Jason", "2344@gmail.com", "Male", "23/06/1999",
            "5647748895858574", "05968742634","7468496874", "7456375876");

        String expected = "11/01/1980";
        cr.setBirthdate(expected);

        String verify = cr.getBirthdate();
        Assert.assertEquals(expected, verify);

    }

    @Test
    public void setCitizenCardNumber() {

        ClientRegistration cr = new ClientRegistration("Jason", "2344@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634","7468496874", "7456375876");

        String expected = "5647744654343574";
        cr.setCitizenCardNumber(expected);

        String verify = cr.getCitizenCardNumber();
        Assert.assertEquals(expected, verify);

    }

    @Test
    public void setPhoneNumber() {

        ClientRegistration cr = new ClientRegistration("Jason", "2344@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634","7468496874", "7456375876");

        String expected = "05968753648";
        cr.setPhoneNumber(expected);

        String verify = cr.getPhoneNumber();
        Assert.assertEquals(expected, verify);

    }

    @Test
    public void setTinNumber() {

        ClientRegistration cr = new ClientRegistration("Jason", "2344@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634","7468496874", "7456375876");

        String expected = "7468499878";
        cr.setTinNumber(expected);

        String verify = cr.getTinNumber();
        Assert.assertEquals(expected, verify);

    }

    @Test
    public void setNhsNumber() {

        ClientRegistration cr = new ClientRegistration("Jason", "2344@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634","7468496874", "7456375876");

        String expected = "7456311123";
        cr.setNhsNumber(expected);

        String verify = cr.getNhsNumber();
        Assert.assertEquals(expected, verify);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameBlank() {

        ClientRegistration cr = new ClientRegistration("", "2344@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634","7468496874", "7456375876");

    }


    @Test(expected = IllegalArgumentException.class)
    public void checkNameIsTooBig() {

        ClientRegistration cr = new ClientRegistration("The biggest and most unnecessary name you'll ever read", "2344@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameIsInvalid() {

        ClientRegistration cr = new ClientRegistration("xXVenomShock99Xx", "2344@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkEmailBlank() {

        ClientRegistration cr = new ClientRegistration("Jason", "", "Male", "23/06/1999",
                "5647748895858574", "05968742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkEmailIsInvalid() {

        ClientRegistration cr = new ClientRegistration("Jason", "I won't use an email here", "Male", "23/06/1999",
                "5647748895858574", "05968742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkSexBlank() {

        ClientRegistration cr = new ClientRegistration("Jason", "someemail@gmail.com", "", "23/06/1999",
                "5647748895858574", "05968742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkSexIsInvalid() {

        ClientRegistration cr = new ClientRegistration("Jason", "6664@gmail.com", "Pink Attack Helicopter", "23/06/1999",
                "5647748895858574", "05968742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCitizenCardNumberBlank() {

        ClientRegistration cr = new ClientRegistration("Jason", "someemail@gmail.com", "Male", "23/06/1999",
                "", "05968742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCitizenCardNumberIsTooBig() {

        ClientRegistration cr = new ClientRegistration("Jason", "someemail@gmail.com", "Male", "23/06/1999",
                "456789876543234567876543234", "05968742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCitizenCardNumberIsInvalid() {

        ClientRegistration cr = new ClientRegistration("Jason", "someemail@gmail.com", "Male", "23/06/1999",
                "XXX7748895858574", "05968742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberBlank() {

        ClientRegistration cr = new ClientRegistration("Jason", "someemail@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberIsTooBig() {

        ClientRegistration cr = new ClientRegistration("Jason", "someemail@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "0596874263405968742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberIsInvalid() {

        ClientRegistration cr = new ClientRegistration("Jason", "someemail@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "XXX68742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTINNumberBlank() {

        ClientRegistration cr = new ClientRegistration("Jason", "someemail@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634", "", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTINNumberIsTooBig() {

        ClientRegistration cr = new ClientRegistration("Jason", "someemail@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634", "74684968747468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTINNumberIsInvalid() {

        ClientRegistration cr = new ClientRegistration("Jason", "someemail@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634", "XXX8496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNHSNumberBlank() {

        ClientRegistration cr = new ClientRegistration("Jason", "someemail@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634", "7468496874", "");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNHSNumberIsTooBig() {

        ClientRegistration cr = new ClientRegistration("Jason", "someemail@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634", "7468496874", "74563758767456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNHSNumberIsInvalid() {

        ClientRegistration cr = new ClientRegistration("Jason", "someemail@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634", "7468496874", "XXX6375876");

    }

    @Test
    public void testToString() {

        ClientRegistration cr = new ClientRegistration("Jason", "2344@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634","7468496874", "7456375876");

        String expected = "Client: " + "Jason" + ", Email: " + "2344@gmail.com" + ", Sex: " + "Male" + ", Birth date: " + "23/06/1999" +
                ", Citizen Card Number: " + "5647748895858574" + ", Phone Number: " + "05968742634" +
                ", TIN Number: " + "7468496874" + ", NHS Number: " + "7456375876";

        String verify = cr.toString();
        Assert.assertEquals(expected, verify);

    }


}