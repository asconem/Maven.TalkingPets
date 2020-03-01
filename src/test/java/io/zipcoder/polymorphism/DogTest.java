package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void testSpeak() {
        Dog newDog = new Dog("Spot");
        String expected = "says woof!";
        String actual = newDog.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInstanceOf() {
        Dog newDog = new Dog("Spot");
        Assert.assertTrue(newDog instanceof Pet);
    }

    @Test
    public void testGetName() {
        Dog newDog = new Dog("Spot");
        String expected = "Spot";

        Assert.assertEquals(expected, newDog.getName());
    }

    @Test
    public void testSetName() {
        Dog newDog = new Dog("Spot");
        newDog.setName("Fido");
        String expected = "Fido";

        Assert.assertEquals(expected, newDog.getName());
    }
}
