package edu.iful.oop.patterns.singleton;

/**
 * Реалызуйте шаблон Singleton таким чином, що б об'єкт цього класу
 * можна було створити лише в одному екземплярі.
 */
public class Singleton {

    // Оголосіть приватну статичну змінну INSTANCE типу Singleton.

    // Змініть режим доступу конструктора з public на private.
    public Singleton() {
        System.out.println("Constructor Instance " + toString());
    }

    public static Singleton getInstance() {
        // Замість створення нового об'єкта Singleton
        // ініціалізуйте (один раз!) змінну INSTANCE і повертайте її значення.
        return new Singleton();
    }
}
