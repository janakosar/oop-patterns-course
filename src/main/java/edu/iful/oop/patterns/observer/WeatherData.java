package edu.iful.oop.patterns.observer;

import java.util.*;

/**
 * Клас Метеостанція, що реалізує інтерфейс "Тема для передплати".
 * Надає інформацію про температуру, вологість та атмосферний тиск.
 * Повідомляє своїх передплатників про зміну свого стану.
 */
public class WeatherData implements Subject {
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
	    // ToDo: Ініціалізуйте список Передплатників порожнім списком
        // (використайте, наприклад, ArrayList).
	}

    @Override
	public void registerObserver(Observer o) {
        // ToDo: Додайте нового Передплатника до списку.
	}

    @Override
	public void removeObserver(Observer o) {
		int i = this.observers.indexOf(o);
		if (i >= 0) {
			this.observers.remove(i);
		}
	}

    @Override
	public void notifyObservers() {
        // ToDo: Передайте нові дані метеоспостережень кожному з Передплатників в списку за допомогою метода 'update()'.
	}
	
	public void measurementsChanged() {
        // ToDo: Повідмте своїх Передплатників про зміну даних.
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return this.temperature;
	}
	
	public float getHumidity() {
		return this.humidity;
	}
	
	public float getPressure() {
		return this.pressure;
	}
}
