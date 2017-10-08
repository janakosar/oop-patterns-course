package edu.iful.oop.patterns.strategy.behavior;

/**
 * Created by vertigo on 08.10.17.
 */
public class MuteQuack implements QuackBehavior {

    public static final String MUTE_MESSAGE = "";

    @Override
    public String quack() {
        return MUTE_MESSAGE;
    }
}
