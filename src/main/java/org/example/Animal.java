package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Animal {
    private String name;
    private boolean isDog;

    // Constructor with parameters
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    // Default constructor
    public Animal() {
        this.name = "Unknown";
        this.isDog = false;
    }

    // Constructor with only name
    public Animal(String name) {
        this.name = name;
        this.isDog = false;
    }

    public String getName() {
        return name;
    }

    public boolean isDog() {
        return isDog;
    }

    @Override
    public String toString() {
        return getName() + " is a dog = " + isDog();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        while (true) {
            System.out.println("Enter the name of the animal (or press enter to finish): ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Is it a dog? Yes or no: ");
            String isDogStr = scanner.nextLine();
            boolean isDog = isDogStr.equalsIgnoreCase("yes");
            Animal animal = new Animal(name, isDog);
            animals.add(animal);
        }

        // Adding objects using overloaded constructors
        animals.add(new Animal());
        animals.add(new Animal("Bella"));
        animals.add(new Animal("Max", true));

        scanner.close();

        System.out.println("Animals entered:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
