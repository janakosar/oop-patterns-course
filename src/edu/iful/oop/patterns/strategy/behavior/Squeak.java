package edu.iful.oop.patterns.strategy.behavior;

/**
 * Пищалка замість крякання.
 */
public class Squeak implements QuackBehavior {

    public static final String SQUEAK_MESSAGE = "Я приманка! Всі до мене!";

    @Override
    public String quack() {
        return SQUEAK_MESSAGE;
    }
}
