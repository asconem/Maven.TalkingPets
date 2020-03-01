package io.zipcoder.polymorphism;

public class Cat extends Pet {

    public Cat(String petName) {
        super(petName);
    }

    @Override
    public String speak() {
        return "says meow!";
    }
}
