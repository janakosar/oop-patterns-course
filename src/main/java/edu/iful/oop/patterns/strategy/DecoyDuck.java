package edu.iful.oop.patterns.strategy;

import edu.iful.oop.patterns.strategy.behavior.FlyNoWay;
import edu.iful.oop.patterns.strategy.behavior.Squeak;

/**
 * Качка примнка
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        // Ініціалізуйте поведінку качки-приманки:
        // ця качка не літатє і пищить.
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }
}