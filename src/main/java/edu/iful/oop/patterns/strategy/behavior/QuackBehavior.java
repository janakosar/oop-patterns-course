package edu.iful.oop.patterns.strategy.behavior;

/**
 * Інтерфейс має бути реалізований всіма класами,
 * що здатні літати. Від нього потрібно лише реалізація
 * методу fly()/
 */
public interface QuackBehavior {

    String quack();
}
