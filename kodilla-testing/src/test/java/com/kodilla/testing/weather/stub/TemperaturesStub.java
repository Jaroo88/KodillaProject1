package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class TemperaturesStub implements Temperatures{
    public Map<String, Double> getTemperatures() {
        Map<String, Double> stubResult = new HashMap<>();
        //DummyData
        stubResult.put("Krakow", 25.5);
        stubResult.put("Warsaw", 23.0);
        stubResult.put("Wroclaw", 24.8);
        stubResult.put("Gdansk", 22.3);
        stubResult.put("Poznan", 24.0);

        return stubResult;
    }
}
