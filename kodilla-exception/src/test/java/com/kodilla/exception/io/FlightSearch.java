package com.kodilla.exception.io;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    private final Map<String, Boolean> airports;

    public FlightSearch() {
        airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("Paris", true);
        airports.put("London", false);
        airports.put("Berlin", true);
        airports.put("Tokyo", false);
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        String arrivalAirport = flight.getArrivalAirport();
        if (!airports.containsKey(arrivalAirport)) {
            throw new RouteNotFoundException("Flight to " + arrivalAirport + " not found!");
        }
        return airports.get(arrivalAirport);
    }
}

