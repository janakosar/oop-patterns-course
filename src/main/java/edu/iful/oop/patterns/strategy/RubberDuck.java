package edu.iful.oop.patterns.strategy;

import edu.iful.oop.patterns.strategy.behavior.FlyNoWay;
import edu.iful.oop.patterns.strategy.behavior.MuteQuack;

/**
 * Гумова качечка.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        // Ініціалізуйте поведінку гумової качки:
        // ця качка не літатє і мовчить.
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
}
