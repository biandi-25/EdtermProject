package com.company.repositories;
import com.company.data.interfaces.IDB;
import com.company.entities.Flight;
import com.company.repositories.interfaces.IFlightRepositories;

import java.sql.*;
public class FlightRepositories {
    private final IDB db;

    public FlightRepositories(IDB db) {
        this.db = db;
    }

    @Override
    public boolean createFlight(Flight flight){
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO flight(flight_time, from, to, price, date) VALUES (?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, flight.getFlight_time());
            st.setString(2, flight.getFrom());
            st.setString(3, flight.getTo());
            st.setInt(4, flight.getPrice());
            st.setString(5, flight.getDate());

            st.execute();
            return true;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }
    @Override
    public Flight getFlightByFromTo(String from, String to) {
        getFlightByFromTo(from, to);
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT id, flight_time, price, date FROM flight WHERE from =? AND to = ? FROM flight)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, from);
            st.setString(2, to);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Flight flight = new Flight(
                        rs.getInt("id"),
                        rs.getString("flight_time"),
                        rs.getInt("price"),
                        rs.getString("date")
                );
                return flight;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
    @Override
    public boolean getFlightByDatePrice(String date, int price) {
        Connection con = null;
        try {
            con = db.getConnection();
            PreparedStatement preparedStatement=con.prepareStatement( "Select id, flight_time, from, to, date FROM flight WHERE date = ? and price = ?");
            preparedStatement.setString(1, date);
            preparedStatement.setInt(2,price);
            preparedStatement.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
        return false;
    }
}
