package edu.iful.oop.patterns.observer;

import org.junit.Assert;
import org.junit.Test;

public class ObserverTest {
    @Test
    public void testObserver() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        {
            // First measurement change
            weatherData.setMeasurements(80, 65, 30.4F);
            // Test CurrentDisplay element
            Assert.assertEquals(80, currentDisplay.getTemperature(), 0.01);
            Assert.assertEquals(65, currentDisplay.getHumidity(), 0.01);

            // Test StatisticsDisplay element
            Assert.assertEquals(80, statisticsDisplay.getMaxTemp(), 0.01);
            Assert.assertEquals(80, statisticsDisplay.getMinTemp(), 0.01);
            Assert.assertEquals(80, statisticsDisplay.getAvgTemp(), 0.01);
            Assert.assertEquals(1, statisticsDisplay.getNumReadings());

            // Test ForecastDisplay element
            Assert.assertEquals(29.92, forecastDisplay.getLastPressure(), 0.01);
            Assert.assertEquals(30.4, forecastDisplay.getCurrentPressure(), 0.01);

            // Test HeatIndexDisplay element
            Assert.assertEquals(82.95, heatIndexDisplay.getHeatIndex(), 0.01);
        }

        {
            // Second measurement change
            weatherData.setMeasurements(82, 70, 29.2F);
            // Test CurrentDisplay element
            Assert.assertEquals(82, currentDisplay.getTemperature(), 0.01);
            Assert.assertEquals(70, currentDisplay.getHumidity(), 0.01);

            // Test StatisticsDisplay element
            Assert.assertEquals(82, statisticsDisplay.getMaxTemp(), 0.01);
            Assert.assertEquals(80, statisticsDisplay.getMinTemp(), 0.01);
            Assert.assertEquals(81, statisticsDisplay.getAvgTemp(), 0.01);
            Assert.assertEquals(2, statisticsDisplay.getNumReadings());

            // Test ForecastDisplay element
            Assert.assertEquals(30.4, forecastDisplay.getLastPressure(), 0.01);
            Assert.assertEquals(29.2, forecastDisplay.getCurrentPressure(), 0.01);

            // Test HeatIndexDisplay element
            Assert.assertEquals(86.9, heatIndexDisplay.getHeatIndex(), 0.01);
        }

        {
            // Third measurement change
            weatherData.setMeasurements(78, 90, 29.2F);

            // Test CurrentDisplay element
            Assert.assertEquals(78, currentDisplay.getTemperature(), 0.01);
            Assert.assertEquals(90, currentDisplay.getHumidity(), 0.01);

            // Test StatisticsDisplay element
            Assert.assertEquals(82, statisticsDisplay.getMaxTemp(), 0.01);
            Assert.assertEquals(78, statisticsDisplay.getMinTemp(), 0.01);
            Assert.assertEquals(80, statisticsDisplay.getAvgTemp(), 0.01);
            Assert.assertEquals(3, statisticsDisplay.getNumReadings());

            // Test ForecastDisplay element
            Assert.assertEquals(29.2, forecastDisplay.getLastPressure(), 0.01);
            Assert.assertEquals(29.2, forecastDisplay.getCurrentPressure(), 0.01);

            // Test HeatIndexDisplay element
            Assert.assertEquals(83.65, heatIndexDisplay.getHeatIndex(), 0.01);
        }
    }
}
