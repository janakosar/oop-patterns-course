package edu.iful.oop.patterns.strategy.behavior;

import edu.iful.oop.patterns.strategy.behavior.QuackBehavior;

/**
 * Created by vertigo on 08.10.17.
 */
public class Quack implements QuackBehavior {

    public static final String QUACK_MESSAGE = "Кря! Кря!";

    @Override
    public String quack() {
        return QUACK_MESSAGE;
    }
}
