package com.company.entities;

public class Flight {
    private int id;
    private String name;
    private String surname;
    private String flight_time;
    private String from;
    private String to;
    private int price;
    private String date;

    public Flight(String name, String surname, String flight_time, int price, String date)
    {
        setName(name);
        setSurname(surname);
        setFlight_time(flight_time);
        setFrom(from);
        setTo(to);
        setPrice(price);
        setDate(date);
    }
    public Flight(int id, String name, int price, String date)
    {
        setId(id);
        setName(name);
        setSurname(surname);
        setFlight_time(flight_time);
        setFrom(from);
        setTo(to);
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
    public String getFrom() {        return from;    }
    public void setFrom(String from) {        this.from = from;    }
    public String getTo() {        return to;    }
    public void setTo(String to) {        this.to = to;    }
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
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", price=" + price +
                ", date='" + date + '\'' +
                '}';
    }
}
