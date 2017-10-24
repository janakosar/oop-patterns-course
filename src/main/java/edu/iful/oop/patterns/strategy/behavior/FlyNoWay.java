package edu.iful.oop.patterns.strategy.behavior;

/**
 * Нелітаюча поведінка
 */
public class FlyNoWay implements FlyBehavior {

    public static final String FLY_MESSAGE = "Не літаю взагалі.";

    @Override
    public String fly() {
        return null;
    }
}
