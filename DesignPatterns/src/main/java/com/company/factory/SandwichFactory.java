package com.company.factory;

public class SandwichFactory implements AbstractFactory{
    public static final int CHEESE_BURGER = 1;
    public static final int CHICKEN_BURGER = 2;

    public  Sandwich createSandwich(int sandwichType) {

        switch (sandwichType) {
            case CHEESE_BURGER:
                return new CheeseBurger();
            case CHICKEN_BURGER:
                return new ChickenBurger();
            default:
                return new NullBurger();
        }
    }

}
