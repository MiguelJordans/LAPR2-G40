package app.domain.model;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientTest {

    String datestr = "23-06-1999";
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    Date date;

    {
        try {
            date = dateFormat.parse(datestr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }



    @Test
    public void setName() {

        Client cr = new Client("Jason", "2344@gmail.com", "Male", date,
                "5647748895858574", "05968742634","7468496874", "7456375876");

        String expected = "Waterson";
        cr.setName(expected);

        String verify = cr.getName();
        Assert.assertEquals(expected, verify);

    }

    @Test
    public void setEmail() {

        Client cr = new Client("Jack", "2344@gmail.com", "Male", date,
                "5647748333858574", "05968742634","7468496874", "7456375876");

        String expected = "fish@hotmail.com";
        cr.setEmail(expected);

        String verify = cr.getEmail();
        Assert.assertEquals(expected, verify);

    }

    @Test
    public void setSex() {

        Client cr = new Client("Mary", "2344@gmail.com", "Male", date,
                "5647748895858574", "05968742634","7468496874", "7456375876");

        String expected = "Female";
        cr.setSex(expected);

        String verify = cr.getSex();
        Assert.assertEquals(expected, verify);

    }

    @Test
    public void setBirthdate() {

        Client cr = new Client("Jason", "2344@gmail.com", "Male", date,
                "5647748895858574", "05968742634","7468496874", "7456375876");

        String expected = "11-01-1980";
        try {
            date = dateFormat.parse(expected);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        cr.setBirthdate(date);

        Date verify = cr.getBirthdate();
        Assert.assertEquals(date, verify);

    }

    @Test
    public void setCitizenCardNumber() {

        Client cr = new Client("Jason", "2344@gmail.com", "Male", date,
                "5647748895858574", "05968742634","7468496874", "7456375876");

        String expected = "5647744654343574";
        cr.setCitizenCardNumber(expected);

        String verify = cr.getCitizenCardNumber();
        Assert.assertEquals(expected, verify);

    }

    @Test
    public void setPhoneNumber() {

        Client cr = new Client("Jason", "2344@gmail.com", "Male", date,
                "5647748895858574", "05968742634","7468496874", "7456375876");

        String expected = "05968753648";
        cr.setPhoneNumber(expected);

        String verify = cr.getPhoneNumber();
        Assert.assertEquals(expected, verify);

    }

    @Test
    public void setTinNumber() {

        Client cr = new Client("Jason", "2344@gmail.com", "Male", date,
                "5647748895858574", "05968742634","7468496874", "7456375876");

        String expected = "7468499878";
        cr.setTinNumber(expected);

        String verify = cr.getTinNumber();
        Assert.assertEquals(expected, verify);

    }

    @Test
    public void setNhsNumber() {

        Client cr = new Client("Jason", "2344@gmail.com", "Male", date,
                "5647748895858574", "05968742634","7468496874", "7456375876");

        String expected = "7456311123";
        cr.setNhsNumber(expected);

        String verify = cr.getNhsNumber();
        Assert.assertEquals(expected, verify);

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameBlank() {

        Client cr = new Client("", "2344@gmail.com", "Male", date,
                "5647748895858574", "05968742634","7468496874", "7456375876");

    }


    @Test(expected = IllegalArgumentException.class)
    public void checkNameIsTooBig() {

        Client cr = new Client("The biggest and most unnecessary name you'll ever read", "2344@gmail.com", "Male", date,
                "5647748895858574", "05968742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameIsInvalid() {

        Client cr = new Client("xXVenomShock99Xx", "2344@gmail.com", "Male", date,
                "5647748895858574", "05968742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNameIsInvalid2() {

        Client cr = new Client("++++", "2344@gmail.com", "Male", date,
                "5647748895858574", "05968742634", "7468496874", "7456375876");

    }

    @Test
    public void checkNameIsInvalid3() {

        Client cr = new Client("aaa", "2344@gmail.com", "Male", date,
                "5647748895858574", "05968742634", "7468496874", "7456375876");

    }

    @Test
    public void checkNameIsInvalid4() {

        Client cr = new Client("zzz", "2344@gmail.com", "Male", date,
                "5647748895858574", "05968742634", "7468496874", "7456375876");

    }
    @Test(expected = IllegalArgumentException.class)
    public void checkEmailBlank() {

        Client cr = new Client("Jason", "", "Male", date,
                "5647748895858574", "05968742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkEmailIsInvalid() {

        Client cr = new Client("Jason", "I won't use an email here", "Male", date,
                "5647748895858574", "05968742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkSexBlank() {

        Client cr = new Client("Jason", "someemail@gmail.com", "", date,
                "5647748895858574", "05968742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkSexIsInvalid() {

        Client cr = new Client("Jason", "6664@gmail.com", "Pink Attack Helicopter", date,
                "5647748895858574", "05968742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCitizenCardNumberBlank() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "", "05968742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCitizenCardNumberIsTooBig() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "456789876543234567876543234", "05968742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCitizenCardNumberIsInvalid() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "XXX7748895858574", "05968742634", "7468496874", "7456375876");

    }

    @Test
    public void checkCitizenCardNumberIsInvalid2() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "++++++++++++++++", "05968742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCitizenCardNumberIsInvalid3() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "aaaaaaaaaaaaaaaa", "05968742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCitizenCardNumberIsInvalid4() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "zzzzzzzzzzzzzzzz", "05968742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCitizenCardNumberIsInvalid5() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "AAAAAAAAAAAAAAAA", "05968742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCitizenCardNumberIsInvalid6() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "ZZZZZZZZZZZZZZZZ", "05968742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberBlank() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "5647748895858574", "", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberIsTooBig() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "5647748895858574", "0596874263405968742634", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberIsInvalid() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "5647748895858574", "XXX68742634", "7468496874", "7456375876");

    }

    @Test
    public void checkPhoneNumberIsInvalid2() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "5647748895858574", "+++++++++++", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberIsInvalid3() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "5647748895858574", "aaaaaaaaaaa", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberIsInvalid4() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "5647748895858574", "zzzzzzzzzzz", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberIsInvalid5() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "5647748895858574", "AAAAAAAAAAA", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkPhoneNumberIsInvalid6() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "5647748895858574", "ZZZZZZZZZZZ", "7468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTINNumberBlank() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "5647748895858574", "05968742634", "", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTINNumberIsTooBig() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "5647748895858574", "05968742634", "74684968747468496874", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTINNumberIsInvalid() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "5647748895858574", "05968742634", "XXX8496874", "7456375876");

    }

    @Test
    public void checkTINNumberIsInvalid2() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "5647748895858574", "05968742634", "**********", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTINNumberIsInvalid3() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "5647748895858574", "05968742634", "aaaaaaaaaa", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTINNumberIsInvalid4() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "5647748895858574", "05968742634", "zzzzzzzzzz", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTINNumberIsInvalid5() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "5647748895858574", "05968742634", "AAAAAAAAAA", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkTINNumberIsInvalid6() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "5647748895858574", "05968742634", "ZZZZZZZZZZ", "7456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNHSNumberBlank() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "5647748895858574", "05968742634", "7468496874", "");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNHSNumberIsTooBig() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "5647748895858574", "05968742634", "7468496874", "74563758767456375876");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNHSNumberIsInvalid() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "5647748895858574", "05968742634", "7468496874", "XXX6375876");

    }

    @Test
    public void checkNHSNumberIsInvalid2() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "5647748895858574", "05968742634", "7468496874", "**********");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNHSNumberIsInvalid3() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "5647748895858574", "05968742634", "7468496874", "aaaaaaaaaa");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNHSNumberIsInvalid4() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "5647748895858574", "05968742634", "7468496874", "zzzzzzzzzz");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNHSNumberIsInvalid5() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "5647748895858574", "05968742634", "7468496874", "AAAAAAAAAA");

    }

    @Test(expected = IllegalArgumentException.class)
    public void checkNHSNumberIsInvalid6() {

        Client cr = new Client("Jason", "someemail@gmail.com", "Male", date,
                "5647748895858574", "05968742634", "7468496874", "ZZZZZZZZZZ");

    }

    @Test
    public void testToString() {

        Client cr = new Client("Jason", "2344@gmail.com", "Male", date,
                "5647748895858574", "05968742634","7468496874", "7456375876");

        String expected = "Client: " + "Jason" + ", Email: " + "2344@gmail.com" + ", Sex: " + "Male" + ", Birth date: " + date +
                ", Citizen Card Number: " + "5647748895858574" + ", Phone Number: " + "05968742634" +
                ", TIN Number: " + "7468496874" + ", NHS Number: " + "7456375876";

        String verify = cr.toString();
        Assert.assertEquals(expected, verify);

    }


}