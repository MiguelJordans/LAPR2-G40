package app.domain.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SampleStoreTest {

    @Test
    public void createSample() {

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        SampleStore sampleStore = new SampleStore();

        try {
            Assert.assertNotNull(sampleStore.createSample(test));
        } catch (Exception e) {

        }

    }

    @Test
    public void validateSample() {

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        SampleStore sampleStore = new SampleStore();

        try {
            sampleStore.createSample(test);
            Assert.assertTrue(sampleStore.validateSample());

        } catch (Exception e) {

        }

    }

    @Test
    public void validateSample2() {

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        SampleStore sampleStore = new SampleStore();

        try {
            sampleStore.createSample(test);
            sampleStore.listAdd();
            Assert.assertFalse(sampleStore.validateSample());


        } catch (Exception e) {

        }

    }

    @Test
    public void saveSample() {

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        SampleStore sampleStore = new SampleStore();

        try {
            sampleStore.createSample(test);
            Assert.assertTrue(sampleStore.saveSample());

        } catch (Exception e) {

        }

    }

    @Test
    public void saveSample2() {

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        SampleStore sampleStore = new SampleStore();

        try {
            sampleStore.createSample(test);
            sampleStore.saveSample();
            Assert.assertFalse(sampleStore.saveSample());

        } catch (Exception e) {

        }

    }

    @Test
    public void getSample() {

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        SampleStore sampleStore = new SampleStore();

        try {
            sampleStore.createSample(test);
            Assert.assertNotNull(sampleStore.getSample(0));

        } catch (Exception e) {

        }

    }

    @Test
    public void getSM() {

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        SampleStore sampleStore = new SampleStore();

        try {
            sampleStore.createSample(test);
            Assert.assertNotNull(sampleStore.getSm());

        } catch (Exception e) {

        }

    }

    @Test
    public void getSampleList() {

        ParameterCategory parameterCategory1 = new ParameterCategory("12346", "cat", "1212");

        List<ParameterCategory> categories2 = new ArrayList<>();
        categories2.add(parameterCategory1);

        TestType bloodTest = new TestType("BL000", "Blood Test", "Needle", categories2);
        app.domain.model.Test test = new app.domain.model.Test("1234567890123456", "100000000000", "999999999999", bloodTest);

        SampleStore sampleStore = new SampleStore();

        try {
            sampleStore.createSample(test);
            List<Sample> sampleList;

            sampleList=sampleStore.getSampleList();

            Assert.assertNotNull(sampleList);

        } catch (Exception e) {

        }

    }

}