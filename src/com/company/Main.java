package com.company;

import com.company.controllers.FlightController;
import com.company.data.PostgresDB;
import com.company.data.interfaces.IDB;
import com.company.repositories.FlightRepositories;
import com.company.repositories.interfaces.IFlightRepositories;

public class Main {

    public static void main(String[] args) {
        IDB idb = new PostgresDB();
        IFlightRepositories repositories = new FlightRepositories(idb);
        FlightController controller = new FlightController(repositories);
        MyApplication application = new MyApplication(controller);
        application.start();

    }
}
