package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class PetCreation {
    Scanner input = new Scanner(System.in);

    public void userInput() {
        System.out.println("Welcome, please enter the amount of pets you have to begin.");
        Integer numOfPets = input.nextInt();
        ArrayList<Pet> petList = new ArrayList<Pet>();
        for (int i = 1; i <= numOfPets; i++) {
            String petType = getTypeOfPet().toLowerCase();
            String petName = getPetName();
            if (petType.equals("dog")) {
                Dog dog = new Dog(petName);
                petList.add(dog);
            }
            if (petType.equals("cat")) {
                Cat cat = new Cat(petName);
                petList.add(cat);
            }
            if (petType.equals("cow")) {
                Cow cow = new Cow(petName);
                petList.add(cow);
            }
            if (petType.equals("pet")) {
                Pet pet = new Pet(petName);
                petList.add(pet);
            }
        }
        for (int i = 1; i <= petList.size(); i++) {
            System.out.println(petList.get(i-1).getName()+ " "+ petList.get(i-1).speak());
        }
    }

    public String getTypeOfPet() {
        System.out.println("What kind of pet is it? Enter cat, dog, or cow.");
        String petType = input.next();
        return petType;
    }

    public String getPetName() {
        System.out.println("What is the name of this pet?");
        String petName = input.next();
        return petName;
    }
}
