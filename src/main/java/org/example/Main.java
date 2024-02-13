package org.example;

import org.example.designPatterns.creationalDesignPatterns.Builder.Employer;
import org.example.designPatterns.creationalDesignPatterns.Factory.Sandwich;
import org.example.designPatterns.creationalDesignPatterns.Factory.SandwichFactory;
import org.example.designPatterns.creationalDesignPatterns.Singleton;

public class Main {
    public static void main(String[] args) {
        // Singleton
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1 == obj2);

        // Factory
        Sandwich sandwich = SandwichFactory.createSandwich(SandwichFactory.CHEESE_BURGER);
        sandwich.prepare();

        // Builder
        Employer employer = new Employer.Builder().firstName("Ahmed").lastName("Alaoui").birthDate(1).entreeDate(1).departureDate(1).department("IT").salary(10000.00F).build();
        System.out.println(employer);


    }
}