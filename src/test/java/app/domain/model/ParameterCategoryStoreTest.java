package app.domain.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParameterCategoryStoreTest {

    @Test
    public void createParameterCategory() {

        ParameterCategoryStore pc = new ParameterCategoryStore();
        ParameterCategory aa = pc.createParameterCategory("AAA", "aaaaa", "aaa");

    }

    @Test
    public void validateParameterCategory1() {

        ParameterCategoryStore pc = new ParameterCategoryStore();
        ParameterCategory aa = pc.createParameterCategory("AAA", "aaaaa", "aaa");

        boolean expected = true;

        boolean actual = pc.validateParameterCategory(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void validateParameterCategory2() {

        ParameterCategoryStore pc = new ParameterCategoryStore();
        ParameterCategory aa = pc.createParameterCategory("AAA", "aaaaa", "aaa");
        pc.listAdd();

        boolean expected = false;

        boolean actual = pc.validateParameterCategory(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void listContainParameterCategory1() {

        ParameterCategoryStore pc = new ParameterCategoryStore();
        ParameterCategory aa = pc.createParameterCategory("AAA", "aaaaa", "aaa");
        pc.listAdd();

        boolean expected = true;

        boolean actual = pc.listContain(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void listContainParameterCategory2() {

        ParameterCategoryStore pc = new ParameterCategoryStore();
        ParameterCategory aa = pc.createParameterCategory("AAA", "aaaaa", "aaa");

        boolean expected = false;

        boolean actual = pc.listContain(aa);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void saveParameterCategory1() {

        ParameterCategoryStore pc = new ParameterCategoryStore();
        ParameterCategory aa = pc.createParameterCategory("AAA", "aaaaa", "aaa");

        boolean expected = true;

        boolean actual = pc.saveParameterCategory();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void saveParameterCategory2() {

        ParameterCategoryStore pc = new ParameterCategoryStore();
        ParameterCategory aa = pc.createParameterCategory("AAA", "aaaaa", "aaa");
        pc.listAdd();

        boolean expected = false;

        boolean actual = pc.saveParameterCategory();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void listAddParameterCategory1() {
        ParameterCategoryStore pc = new ParameterCategoryStore();
        ParameterCategory aa = pc.createParameterCategory("AAA", "aaaaa", "aaa");

        boolean expected = true;

        boolean actual = pc.listAdd();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void listAddParameterCategory2() {

        ParameterCategoryStore pc = new ParameterCategoryStore();
        ParameterCategory aa = pc.createParameterCategory("AAA", "aaaaa", "aaa");
        pc.listAdd();

        boolean expected = true;

        boolean actual = pc.listAdd();

        Assert.assertEquals(expected, actual);

    }

  @Test
    public void getParameterCategory1() {

        ParameterCategoryStore pc = new ParameterCategoryStore();
        ParameterCategory aa = pc.createParameterCategory("AAA", "aaaaa", "aaa");
        pc.listAdd();

        ParameterCategory expected = pc.getParameterCategory(0);

        ParameterCategory actual = pc.getParameterCategory(0);

        assertEquals(expected, actual);

    }

    @Test
    public void getPC() {

        ParameterCategoryStore pc = new ParameterCategoryStore();
        ParameterCategory aa = pc.createParameterCategory("AAA", "aaaaa", "aaa");

        ParameterCategory expected = aa;

        ParameterCategory actual = pc.getPc();

        assertEquals(expected, actual);

    }

    @Test
    public void getCategoryStoreList(){


        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();

        pcStore.getParameterCategoryList();

    }

    @Test
    public void getCategoryStoreListNull(){


        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = null;
        pcStore.listAdd();

       Assert.assertNull(null);

    }

    @Test
    public void getCategoryStoreListNotNull(){


        ParameterCategoryStore pcStore = new ParameterCategoryStore();
        ParameterCategory pc = new ParameterCategory("aaaaa","aaa","aaa");
        pcStore.listAdd();

        Assert.assertNotNull(pcStore.getParameterCategoryList());

    }

}
