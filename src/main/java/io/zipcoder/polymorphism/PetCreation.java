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
        System.out.println("Wow, you have " + numOfPets + " pets? I can't wait to hear about them!\n");
        sc.nextLine();
        Pet[] petList = new Pet[numOfPets];

        for (int i = 0; i < numOfPets; i++){
            System.out.println("What kind of pet is this? Type 'dog,' 'cat,' or 'cow.'");
            String petType = sc.nextLine();
            System.out.println("What is the name of this pet?");
            String petName = sc.nextLine();

            if (petType.equalsIgnoreCase("Dog")) {
                petList[i] = new Dog(petName);
            } else if (petType.equalsIgnoreCase("Cat")) {
                petList[i] = new Cat(petName);
            } else if (petType.equalsIgnoreCase("Cow")) {
                petList[i] = new Cow(petName);
            } else {
                System.out.println("Invalid entry.");
            }
        }

        for (int j = 0; j < numOfPets; j++) {
            System.out.println(petList[j].getPetName() + " " + petList[j].speak());
        }
    }
}
