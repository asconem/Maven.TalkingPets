package io.zipcoder.polymorphism;

public abstract class Pet {
    private String petName;

    public Pet(String petName) {
        this.petName = petName;
    }

    public String speak() {
        return "";
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
}
