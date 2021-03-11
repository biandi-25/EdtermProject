package com.company;

import com.company.controllers.FlightController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication {

    private final FlightController controller;
    private final Scanner scanner;

    public MyApplication(FlightController controller) {
        this.controller = controller;
        scanner = new Scanner(System.in);
    }
    public void start(){
        while (true){
            System.out.println();
            System.out.println("Welcome to our airline");
            System.out.println("Select option: (1-3)");
            System.out.println("1. Create flights");
            System.out.println("2. Get flights by places");
            System.out.println("3. Get flights by date and price");
            System.out.println("0. Exit");
            System.out.println();
            try{
                System.out.println("Enter the option: (1-9)");
                int option = scanner.nextInt();
                if(option==1){
                    createFlightMenu();
                }
                else if(option==2){
                    getFlightByFromToMenu();
                }
                else if(option==3){
                    getFlightByDatePriceMenu();
                }
                else {
                    break;
                }
            }catch (InputMismatchException e){
                System.out.println("Input must be integer");
                scanner.nextLine();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("***************************************");
        }
    }
    public void createFlightMenu() {
        System.out.println("Please enter flight_time:");
        String flight_time = scanner.next();
        System.out.println("Please enter from_city:");
        String from_city = scanner.next();
        System.out.println("Please enter to_city:");
        String to_city = scanner.next();
        System.out.println("Please enter price:");
        int price = scanner.nextInt();
        System.out.println("Please enter date:");
        String date = scanner.next();
        String response = controller.createFlight(flight_time, from_city, to_city, price, date);
        System.out.println(response);
    }

    public void getFlightByFromToMenu(){
        System.out.println("Please enter city, where you are:");
        String from_city = scanner.next();
        System.out.println("Please enter city, where you want to be:");
        String to_city = scanner.next();
        String response = controller.getFlightByFromTo(from_city, to_city);
        System.out.println(response);
    }
    public void getFlightByDatePriceMenu(){

        System.out.println("Please enter price:");
        int price = scanner.nextInt();
        System.out.println("Please enter date:");
        String date = scanner.next();
        String response = controller.getFlightByDatePrice(date, price);
        System.out.println(response);
    }
}