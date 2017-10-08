package edu.iful.oop.patterns.strategy.old_solution;

/**
 * Джо працює на компанію, що випускає надзвичайно
 * успішний імітатор качиного ставка. В цій грі подано
 * ставок, де плавають и крякають качки різних видів.
 * Проектувальники системи скористалися стандартним
 * прийомом ООП и визначили суперклас Duck,
 * на основі якого об'являються типи конкретних видів качок.
 */

public abstract class Duck {

    public abstract void swim();
    public abstract void display();

    public abstract void quack();
    public abstract void fly();
}
