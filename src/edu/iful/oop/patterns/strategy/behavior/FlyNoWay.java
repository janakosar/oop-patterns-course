package edu.iful.oop.patterns.strategy.behavior;

/**
 * Created by vertigo on 08.10.17.
 */
public class FlyNoWay implements FlyBehavior {

    public static final String FLY_MESSAGE = "Не літаю взагалі.";

    @Override
    public String fly() {
        return null;
    }
}
