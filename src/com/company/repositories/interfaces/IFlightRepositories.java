package com.company.repositories.interfaces;


import com.company.entities.Flight;
import java.util.List;
public interface IFlightRepositories {
    boolean createFlight(Flight flight);
    boolean getFlightByFromTo(String from_city, String to_city);
    Flight getFlightByDatePrice(String date, int price);
}