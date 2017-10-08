package edu.iful.oop.patterns.singleton;


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
