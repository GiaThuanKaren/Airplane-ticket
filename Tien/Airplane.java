// package com.company;

import java.util.Scanner;

public class Airplane { //MAY BAY
    private String airplaneID; //mã máy bay
    private int numberOfSeats;// số lượng ghế
    private String description;//miêu tả
    private String airplaneCompanyID;//mã hãng máy bay
    Scanner sc = new Scanner(System.in);

    public Airplane() {

    }

    public Airplane(String airplaneID, int numberOfSeats, String description, String airplaneCompanyID) {
        this.airplaneID = airplaneID;
        this.numberOfSeats = numberOfSeats;
        this.description = description;
        this.airplaneCompanyID = airplaneCompanyID;
    }

    public Airplane(Airplane airplane) {
        airplane.airplaneID = this.airplaneID;
        airplane.numberOfSeats = this.numberOfSeats;
        airplane.description = this.description;
        airplane.airplaneCompanyID = this.airplaneCompanyID;
    }

    public String getAirplaneID() {
        return airplaneID;
    }

    public void setAirplaneID(String airplaneID) {
        this.airplaneID = airplaneID;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAirplaneCompanyID() {
        return airplaneCompanyID;
    }

    public void setAirplaneCompanyID(String airplaneCompanyID) {
        this.airplaneCompanyID = airplaneCompanyID;
    }

    public void input() {
        System.out.println("Enter airplane ID: ");
        airplaneID = sc.nextLine();
        System.out.println("Enter number of seats: ");
        numberOfSeats = sc.nextInt();
        System.out.println("Enter description: ");
        description = sc.nextLine();
        System.out.println("Enter airplane company ID: ");
        airplaneCompanyID = sc.nextLine();
    }

    public void output() {
        System.out.println("Airplane ID: " + airplaneID);
        System.out.println("Number of seats: " + numberOfSeats);
        System.out.println("Description: " + description);
        System.out.println("Airplane company ID: " + airplaneCompanyID);
    }
}
