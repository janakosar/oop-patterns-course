package edu.iful.oop.patterns.strategy.behavior;

/**
 * Звичайне крякання.
 */
public class Quack implements QuackBehavior {

    public static final String QUACK_MESSAGE = "Кря! Кря!";

    @Override
    public String quack() {
        return QUACK_MESSAGE;
    }
}
