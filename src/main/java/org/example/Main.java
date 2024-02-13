package org.example;

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



    }
}