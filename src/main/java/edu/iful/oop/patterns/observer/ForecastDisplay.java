package edu.iful.oop.patterns.observer;

/**
 * Відображає прогноз на основі метео-спостережень.
 */
public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.lastPressure = this.currentPressure;
		this.currentPressure = pressure;

		display();
	}

	@Override
	public void display() {
		System.out.print("Прогноз погоди: ");
		if (this.currentPressure > this.lastPressure) {
			System.out.println("Здається, погода налагоджується!");
		} else if (this.currentPressure == this.lastPressure) {
			System.out.println("Змін не передбачається.");
		} else if (this.currentPressure < this.lastPressure) {
			System.out.println("Попереджаємо про погіршення погоди. Можливі опади.");
		}
	}

	public float getCurrentPressure() {
		return this.currentPressure;
	}

	public float getLastPressure() {
		return this.lastPressure;
	}
}
