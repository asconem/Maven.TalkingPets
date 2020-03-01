package io.zipcoder.polymorphism;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetCreation {

    public void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome, please enter the amount of pets you have to begin.");
        int numOfPets = sc.nextInt();
        sc.nextLine();
        List<Pet> petList = new ArrayList<>();

        for (int i = 0; i < numOfPets; i++){
            System.out.println("What kind of pet is this?");
            String petType = sc.nextLine();
            System.out.println("What is the name of each of your pets?");
            String petName = sc.nextLine();

            if (petType.equalsIgnoreCase("Dog")) {
                petList.set(i, new Dog(petName));
            } else if (petType.equalsIgnoreCase("Cat")) {
                petList.set(i, new Cat(petName));
            } else if (petType.equalsIgnoreCase("Cow")) {
                petList.set(i, new Cow(petName));
            } else {
                System.out.println("Invalid entry.");
            }
        }

        for (int j = 0; j < numOfPets; j++) {
            System.out.println(petList.get(j).getPetName() + "" + petList.get(j).speak());
        }
    }
}
