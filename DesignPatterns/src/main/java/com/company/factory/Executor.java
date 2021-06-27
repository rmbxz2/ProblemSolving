package com.company.factory;

public class Executor {
    public static void main(String[] args) {

	AbstractFactory factory = new SandwichFactory();
        Sandwich sandwich = factory.createSandwich(SandwichFactory.CHEESE_BURGER);
        sandwich.makeUp();
        Sandwich sandwich2 = factory.createSandwich(4);
        sandwich2.makeUp();
    }
}
