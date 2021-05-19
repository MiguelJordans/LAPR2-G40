package app.domain.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientRegistrationStoreTest {

    @Test
    public void createClientRegistration() {
    }

    @Test
    public void validateClientRegistration() {

        ClientRegistrationStore store = new ClientRegistrationStore();
        ClientRegistration cr = store.CreateClientRegistration("Jason", "2344@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634","7468496874", "7456375876");

        boolean expected = true;
        boolean verify = store.validateClientRegistration(cr);

        Assert.assertEquals(expected, verify);

    }

    @Test
    public void listContain() {

        ClientRegistrationStore store = new ClientRegistrationStore();
        ClientRegistration cr = store.CreateClientRegistration("Jason", "2344@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634","7468496874", "7456375876");
        store.listAdd(cr);

        boolean expected = true;
        boolean verify = store.listContain(cr);


        Assert.assertEquals(expected, verify);

    }

    @Test
    public void saveClientRegistration() {

        ClientRegistrationStore store = new ClientRegistrationStore();
        ClientRegistration cr = store.CreateClientRegistration("Jason", "2344@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634","7468496874", "7456375876");

        boolean expected = true;
        boolean verify = store.saveClientRegistration();

        Assert.assertEquals(expected, verify);

    }

    @Test
    public void listAdd() {

        ClientRegistrationStore store = new ClientRegistrationStore();
        ClientRegistration cr = store.CreateClientRegistration("Jason", "2344@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634","7468496874", "7456375876");

        boolean expected = true;
        boolean verify = store.listAdd(cr);

        Assert.assertEquals(expected, verify);
    }

    @Test
    public void getClientRegistration() {

        ClientRegistrationStore store = new ClientRegistrationStore();
        ClientRegistration cr = store.CreateClientRegistration("Jason", "2344@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634","7468496874", "7456375876");
        store.listAdd(cr);

        ClientRegistration verify = store.getClientRegistration(0);

        Assert.assertEquals(cr, verify);

    }

    @Test
    public void getCr() {

        ClientRegistrationStore store = new ClientRegistrationStore();
        ClientRegistration cr = store.CreateClientRegistration("Jason", "2344@gmail.com", "Male", "23/06/1999",
                "5647748895858574", "05968742634","7468496874", "7456375876");

        ClientRegistration verify = store.getCr();

        Assert.assertEquals(cr, verify);

    }
}