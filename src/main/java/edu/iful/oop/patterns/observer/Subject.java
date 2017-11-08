package edu.iful.oop.patterns.observer;

/**
 * Інтерфейс Subject (Тема) має бути імплементований всіма об'єктами передплати.
 */
public interface Subject {
	/**
	 * Зареєструвати передплатника.
	 *
	 * @param o - об'єкт, що підписується на отримання новин.
     */
	void registerObserver(Observer o);

	/**
	 * Видалити передплатника.
	 *
	 * @param o - об'єкт, що відписується від отримання новин.
     */
	void removeObserver(Observer o);

	/**
	 * Повідомити всіх передвплатників про зміну стану.
     */
	void notifyObservers();
}
