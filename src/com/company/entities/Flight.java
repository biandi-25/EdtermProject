package com.company.entities;

public class Flight {
    private int id;
    private String name;
    private String surname;
    private String flight_time;
    private String from_city;
    private String to_city;
    private int price;
    private String date;

    public Flight(String name, String surname, String flight_time, int price, String date)
    {
        setName(name);
        setSurname(surname);
        setFlight_time(flight_time);
        setFrom_city(from_city);
        setTo_city(to_city);
        setPrice(price);
        setDate(date);
    }
    public Flight(int id, String name, int price, String date)
    {
        setId(id);
        setName(name);
        setSurname(surname);
        setFlight_time(flight_time);
        setFrom_city(from_city);
        setTo_city(to_city);
        setPrice(price);
        setDate(date);
    }

    public int getId() {        return id;    }
    public void setId(int id) {        this.id = id;    }
    public String getName() {        return name;    }
    public void setName(String name) {        this.name = name;    }
    public String getSurname() {        return surname;    }
    public void setSurname(String surname) {        this.surname = surname;    }
    public String getFlight_time() {        return flight_time;    }
    public void setFlight_time(String flight_time) {        this.flight_time = flight_time;    }
    public String getFrom_city() {        return from_city;    }
    public void setFrom_city(String from_city) {        this.from_city = from_city;    }
    public String getTo_city() {        return to_city;    }
    public void setTo_city(String to) {        this.to_city = to_city;    }
    public int getPrice() {        return price;    }
    public void setPrice(int price) {        this.price = price;    }
    public String getDate() {        return date;    }
    public void setDate(String date) {        this.date = date;    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", flight_time='" + flight_time + '\'' +
                ", from_city='" + from_city + '\'' +
                ", to_city='" + to_city + '\'' +
                ", price=" + price +
                ", date='" + date + '\'' +
                '}';
    }
}
