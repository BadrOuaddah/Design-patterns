package org.example.designPatterns.creationalDesignPatterns.Factory;

public class SandwichFactory {
    public static final int CHEESE_BURGER = 1;
    public static final int CHICKEN_BURGER = 2;

    public static Sandwich createSandwich(int idSandwich) {

        switch (idSandwich) {
            case 1:
                return new CheeseBurger(); // cannot be referenced from a static context
            case 2:
                return new ChickenBurger(); // cannot be referenced from a static context
        }
        return null;
    }
}
