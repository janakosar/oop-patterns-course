package edu.iful.oop.patterns.observer;

/**
 * Відображає статистичні дані про метео-спостереження.
 */
public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
    private float avgTemp = 0;

	private float tempSum = 0.0f;
	private int numReadings;
	private WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

    @Override
	public void update(float temp, float humidity, float pressure) {
		this.tempSum += temp;
        this.numReadings++;
        this.avgTemp = this.tempSum / this.numReadings;

		if (temp > this.maxTemp) {
            this.maxTemp = temp;
		}
 
		if (temp < this.minTemp) {
            this.minTemp = temp;
		}

		display();
	}

    @Override
	public void display() {
		System.out.println("Середня/Максимальна/Мінімальна температура = " + (this.tempSum / this.numReadings)
			+ "/" + this.maxTemp + "/" + this.minTemp);
	}

	public float getMaxTemp() {
		return this.maxTemp;
	}

	public float getMinTemp() {
		return this.minTemp;
	}

    public float getAvgTemp() {
        return this.avgTemp;
    }

    public int getNumReadings() {
		return this.numReadings;
	}
}
