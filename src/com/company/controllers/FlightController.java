package com.company.controllers;
import com.company.entities.Flight;
import com.company.repositories.interfaces.IFlightRepositories;
import java.util.List;

public class FlightController {

    private final IFlightRepositories repo;

    public FlightController(IFlightRepositories repo){this.repo=repo;}

    public String createFlight(String flight_time, String from, String to, int price, String date){
        Flight flight = new Flight(flight_time, from, to, price, date);
        boolean created= repo.createFlight(flight);
        return  (created ?  "Flight was created!" : "Flight creation was failed!!");
    }
    public String getFlightByFromTo(String from, String to){
        Flight flight = repo.getFlightByFromTo(from, to);
        return (flight == null ? "There is no flights" : flight.toString());
    }
    public String getFlightByDatePrice(String date, int price){
        Flight flight = repo.getFlightByDatePrice(date, price);
        return (flight == null ? "There is no flights" : flight.toString());
    }







}
