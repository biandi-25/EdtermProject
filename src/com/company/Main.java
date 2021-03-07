package com.company;

import com.company.controllers.FlightController;
import com.company.data.PostgresDB;
import com.company.data.interfaces.IDB;
import com.company.repositories.FlightRepositories;
import com.company.repositories.interfaces.IFlightRepositories;

public class Main {

    public static void main(String[] args) {
        IDB db = new PostgresDB();
        IFlightRepositories repo = new FlightRepositories(db);
        FlightController controller = new FlightController(repo);
        MyApplication app = new MyApplication(controller);
        app.start();
    }
}