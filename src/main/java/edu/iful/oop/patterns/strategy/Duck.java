package edu.iful.oop.patterns.strategy;

import edu.iful.oop.patterns.strategy.behavior.FlyBehavior;
import edu.iful.oop.patterns.strategy.behavior.QuackBehavior;

/**
 * <p>
 *     Джо працює на компанію, що випускає надзвичайно
 * успішний імітатор качиного ставка. В цій грі подано
 * ставок, де плавають и крякають качки різних видів.
 * Проектувальники системи скористалися стандартним
 * прийомом ООП и визначили суперклас Duck,
 * на основі якого об'являються типи конкретних видів качок.</p>
 *
 * <p>
 *     Необхідно реалізувати шаблон Stategy який:
 *     <ol>
 *         <li>Усуне дублювання коду в під-класах;</li>
 *         <li>Дозволить здійснити зміну поведінки на стадії виконання;</li>
 *         <li>Убезпечить одні класи від зміни поведінки інших.</li>
 *     </ol>
 * </p>
 *
 */

public abstract class Duck {

    public static final String SWIM_MESSAGE = "Всі качки плавають!";
    public static final String DISPLAY_MESSAGE = "Ви бачите на екрані чудову качку";


    // Тут необхідно оголосити дві зсилочні змінні з типами інерфейсів поведінки.
    // Ці змінні наслідуються всіма підкласами Duck.
    // Добавте 'сеттери' для цих полів.
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public String swim() {
        return SWIM_MESSAGE;
    }
    public String display() {
        return DISPLAY_MESSAGE;
    }


    public String performQuack() {
        // Замінити оператор 'return null;' на делегування операції класа поведінки.
        return quackBehavior.quack();
    }

    public String performFly() {
        // Замінити оператор 'return null;' на делегування операції класа поведінки.
        return flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
