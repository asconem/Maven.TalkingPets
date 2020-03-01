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
}
