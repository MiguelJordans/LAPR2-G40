package app.domain.model;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientStoreTest {

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
    public void createClientRegistration() {
    }

    @Test
    public void validateClientRegistration() {

        ClientStore store = new ClientStore();
        Client cr = store.CreateClient("Jason", "2344@gmail.com", "Male", date,
                "5647748895858574", "05968742634","7468496874", "7456375876");

        boolean expected = true;
        boolean verify = store.validateClient(cr);

        Assert.assertEquals(expected, verify);

    }

    @Test
    public void listContain() {

        ClientStore store = new ClientStore();
        Client cr = store.CreateClient("Jason", "2344@gmail.com", "Male", date,
                "5647748895858574", "05968742634","7468496874", "7456375876");
        store.listAdd(cr);

        boolean expected = true;
        boolean verify = store.listContain(cr);


        Assert.assertEquals(expected, verify);

    }

    @Test
    public void saveClientRegistration() {

        ClientStore store = new ClientStore();
        Client cr = store.CreateClient("Jason", "2344@gmail.com", "Male", date,
                "5647748895858574", "05968742634","7468496874", "7456375876");

        boolean expected = true;
        boolean verify = store.saveClient();

        Assert.assertEquals(expected, verify);

    }

    @Test
    public void listAdd() {

        ClientStore store = new ClientStore();
        Client cr = store.CreateClient("Jason", "2344@gmail.com", "Male", date,
                "5647748895858574", "05968742634","7468496874", "7456375876");

        boolean expected = true;
        boolean verify = store.listAdd(cr);

        Assert.assertEquals(expected, verify);
    }

    @Test
    public void getClient() {

        ClientStore store = new ClientStore();
        Client cr = store.CreateClient("Jason", "2344@gmail.com", "Male", date,
                "5647748895858574", "05968742634","7468496874", "7456375876");
        store.listAdd(cr);

        Client verify = store.getClient(0);

        Assert.assertEquals(cr, verify);

    }

    @Test
    public void getCr() {

        ClientStore store = new ClientStore();
        Client cr = store.CreateClient("Jason", "2344@gmail.com", "Male", date,
                "5647748895858574", "05968742634","7468496874", "7456375876");

        Client verify = store.getCr();

        Assert.assertEquals(cr, verify);

    }
}