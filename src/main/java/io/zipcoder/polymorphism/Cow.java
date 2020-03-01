package io.zipcoder.polymorphism;

public class Cow extends Pet {

    public Cow(String name) {

        super(name);
    }

    @Override
    public String speak() {

        return "says moo!";
    }
}
