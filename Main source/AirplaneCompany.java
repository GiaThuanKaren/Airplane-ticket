// package com.company;

import java.util.Scanner;

public class AirplaneCompany { //HANG MAY BAY
    private String airplaneCompanyID;// mã hãng máy bay
    private String airplaneCompanyName;// tên hãng máy bay
    Scanner sc = new Scanner(System.in);

    public AirplaneCompany() {

    }

    public AirplaneCompany(String airplaneCompanyID, String airplaneCompanyName) {
        this.airplaneCompanyID = airplaneCompanyID;
        this.airplaneCompanyName = airplaneCompanyName;
    }

    public AirplaneCompany(AirplaneCompany airplaneCompany) {
        airplaneCompany.airplaneCompanyID = this.airplaneCompanyID;
        airplaneCompany.airplaneCompanyName = this.airplaneCompanyName;
    }

    public String getAirplaneCompanyID() {
        return airplaneCompanyID;
    }

    public void setAirplaneCompanyID(String airplaneCompanyID) {
        this.airplaneCompanyID = airplaneCompanyID;
    }

    public String getAirplaneCompanyName() {
        return airplaneCompanyName;
    }

    public void setAirplaneCompanyName(String airplaneCompanyName) {
        this.airplaneCompanyName = airplaneCompanyName;
    }

    public void input() {
        System.out.println("Enter airplane company ID: ");
        airplaneCompanyID = sc.nextLine();
        System.out.println("Enter airplane company name: ");
        airplaneCompanyName = sc.nextLine();
    }

    public void output() {
        System.out.println("Airplane ID: " + airplaneCompanyID);
        System.out.println("Airplane name: " + airplaneCompanyName);
    }
}
