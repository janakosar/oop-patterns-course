package edu.iful.oop.patterns.observer;

/**
 * Розраховує та відображає індекс температури і вологості.
 */
public class HeatIndexDisplay implements Observer, DisplayElement {
	private float heatIndex = 0.0f;
	private WeatherData weatherData;

	public HeatIndexDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

    @Override
	public void update(float temp, float humidity, float pressure) {
        this.heatIndex = computeHeatIndex(temp, humidity);
		display();
	}
	
	private float computeHeatIndex(float temp, float humidity) {
		float temp2 = temp * temp;
        float temp3 = temp2 * temp;
        
        float humidity2 = humidity * humidity;
        float humidity3 = humidity2 * humidity;

        float index = (float) (
                16.923
                + 0.185212 * temp
                + 5.37941 * humidity
                - 0.100254 * temp * humidity
                + 0.00941695 * temp2
                + 0.00728898 * humidity2
                + 0.000345372 * temp2 * humidity
                - 0.000814971 * temp * humidity2
                + 0.0000102102 * temp2 * humidity2
                - 0.000038646 * temp3
                + 0.0000291583 * humidity3
                + 0.00000142721 * temp3 * humidity
                + 0.000000197483 * temp * humidity3
                - 0.0000000218429 * temp3 * humidity2
                + 0.000000000843296 * temp2 * humidity3
                - 0.0000000000481975 * temp3 * humidity3);

        return index;
    }

    @Override
	public void display() {
		System.out.println("Індекс температури і вологості становить " + this.heatIndex);
	}

    public float getHeatIndex() {
        return this.heatIndex;
    }
}
