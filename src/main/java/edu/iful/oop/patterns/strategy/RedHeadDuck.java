package edu.iful.oop.patterns.strategy;

import edu.iful.oop.patterns.strategy.behavior.FlyWithWings;
import edu.iful.oop.patterns.strategy.behavior.Quack;

/**
 * Ще одна качка із всесвіту качок.
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        // Ініціалізуйте поведінку качки:
        // ця качка вміє літати і крякати.
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
}
