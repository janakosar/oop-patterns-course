package edu.iful.oop.patterns.observer;

/**
 * Передплатник має імплементувати цей інтерфейс
 */
public interface Observer {
	/**
	 * Метод, який викликається, коли об'єкт Тема (Subject) сповіщає про зміну свого стану.
	 *
	 * @param temp      - температура.
	 * @param humidity  - вологість.
	 * @param pressure  - атмосферний тиск.
     */
	void update(float temp, float humidity, float pressure);
}
