package edu.iful.oop.patterns.strategy.behavior;

/**
 * Мовчазне крякання.
 */
public class MuteQuack implements QuackBehavior {

    public static final String MUTE_MESSAGE = "";

    @Override
    public String quack() {
        return MUTE_MESSAGE;
    }
}
