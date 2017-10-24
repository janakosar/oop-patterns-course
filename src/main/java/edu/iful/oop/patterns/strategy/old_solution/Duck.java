package edu.iful.oop.patterns.strategy.old_solution;

/**
 * Спробуйте вилучити методи поведінки quack() і fly() у відповідні інтерфейси.
 */
public abstract class Duck {

    public static final String SWIM_MESSAGE = "Всі качки плавають!";
    public static final String DISPLAY_MESSAGE = "Ви бачите на екрані чудову качку";

    public String swim() {
        return SWIM_MESSAGE;
    }
    public String display() {
        return DISPLAY_MESSAGE;
    }

    public abstract void quack();
    public abstract void fly();
}
