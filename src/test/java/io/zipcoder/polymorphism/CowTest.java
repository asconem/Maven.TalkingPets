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
}
