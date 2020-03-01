package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CowTest {
    @Test
    public void testSpeak() {
        Cow newCow = new Cow("Bessie");
        String expected = "says moo!";
        String actual = newCow.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInstanceOf() {
        Cow newCow = new Cow("Bessie");
        Assert.assertTrue(newCow instanceof Pet);
    }

    @Test
    public void testGetName() {
        Cow newCow = new Cow("Bessie");
        String expected = "Bessie";

        Assert.assertEquals(expected, newCow.getName());
    }

    @Test
    public void testSetName() {
        Cow newCow = new Cow("Bessie");
        newCow.setName("Crouton");
        String expected = "Crouton";

        Assert.assertEquals(expected, newCow.getName());
    }
}
