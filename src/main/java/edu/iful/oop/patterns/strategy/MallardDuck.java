package edu.iful.oop.patterns.strategy;

import edu.iful.oop.patterns.strategy.behavior.FlyWithWings;
import edu.iful.oop.patterns.strategy.behavior.Quack;

/**
 * Клас Дика качкаю
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        // Ініціалізуйте поведінку дикої качки:
        // дика качка вміє літати і крякати.
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }
}
