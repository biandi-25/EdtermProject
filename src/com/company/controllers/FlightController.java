package com.company.controllers;
import com.company.entities.Flight;
import com.company.repositories.interfaces.IFlightRepositories;
import java.util.List;

public class FlightController {

    private final IFlightRepositories repo;

    public FlightController(IFlightRepositories repo){this.repo=repo;}

    public String createFlight(String flight_time, String from_city, String to_city, int price, String date){
        Flight flight = new Flight(flight_time, from_city, to_city, price, date);
        boolean created= repo.createFlight(flight);
        return  (created ?  "Flight was created!" : "Flight creation was failed!!");
    }
    public String getFlightByFromTo(String from_city, String to_city){
        boolean flight = repo.getFlightByFromTo(from_city, to_city);
        return (flight ? "There is no flights" : "There is flight at this direction");
    }
    public String getFlightByDatePrice(String date, int price){
        Flight flight = repo.getFlightByDatePrice(date, price);
        return (flight == null ? "There is no flights" : flight.toString());
    }
}

