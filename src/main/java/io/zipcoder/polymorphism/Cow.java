package io.zipcoder.polymorphism;

public class Cow extends Pet {

    public Cow(String petName) {
        super(petName);
    }

    @Override
    public String speak() {
        return "says moo!";
    }
}
