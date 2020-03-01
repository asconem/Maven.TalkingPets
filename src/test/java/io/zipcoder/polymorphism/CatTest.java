package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void testSpeak() {
        Cat newCat = new Cat("Scoops");
        String expected = "says meow!";
        String actual = newCat.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInstanceOf() {
        Cat newCat = new Cat("Scoops");
        Assert.assertTrue(newCat instanceof Pet);
    }

    @Test
    public void testGetName() {
        Cat newCat = new Cat("Scoops");
        String expected = "Scoops";

        Assert.assertEquals(expected, newCat.getName());
    }

    @Test
    public void testSetName() {
        Cat newCat = new Cat("Scoops");
        newCat.setName("Striper");
        String expected = "Striper";

        Assert.assertEquals(expected, newCat.getName());
    }
}
