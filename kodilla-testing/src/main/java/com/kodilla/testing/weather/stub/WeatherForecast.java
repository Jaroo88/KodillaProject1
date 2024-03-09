package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }
    public int averageTemperatures(){
        int sum = 0;
        for (double temperature : temperatures.getTemperatures().values()) {
            sum += temperature;
        }
        int average = sum / temperatures.getTemperatures().size();
        return average;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }


    public double calculateMedianTemperature(Temperatures dataProvider) {
        List<Double> temperatureList = new ArrayList<>(dataProvider.getTemperatures().values());
        Collections.sort(temperatureList);
        int size = temperatureList.size();
        double median;
        if (size % 2 == 0) {
            median = (temperatureList.get(size / 2 - 1) + temperatureList.get(size / 2)) / 2;
        } else {
            median = temperatureList.get(size / 2);
        }
        return median;

    }


}
