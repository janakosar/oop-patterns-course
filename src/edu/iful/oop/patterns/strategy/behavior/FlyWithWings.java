package edu.iful.oop.patterns.strategy.behavior;

/**
 * Реалізація польоту.
 */
public class FlyWithWings implements FlyBehavior {

    public static final String WINGS_MESSAGE = "Махаю крилами і лечу!";

    @Override
    public String fly() {
        return WINGS_MESSAGE;
    }
}
