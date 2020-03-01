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
}
