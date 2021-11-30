// package DOANOOP;

import java.util.Scanner;

public class Airport { // SAN BAY
	// Attribute
	Scanner in = new Scanner(System.in);
	private String airportID; // Lưu trữ mã sân bay
	private String airportName; // Lưu trữ tên sân bay
	private String city; // Lưu trữ tên thành phố có cái sân bay đó

	public Airport(String airportID, String airportName, String city) {
		this.airportID = airportID;
		this.airportName = airportName;
		this.city = city;
	}

	public Airport(Airport a) {
		airportID = a.airportID;
		airportName = a.airportName;
		city = a.city;
	}

	public String getAirportID() {
		return airportID;
	}

	public void setAirportID(String airportID) {
		this.airportID = airportID;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void input() {
		System.out.println("Enter Airport ID: ");
		airportID = in.nextLine();
		System.out.println("Enter Airport Name: ");
		airportName = in.nextLine();
		System.out.println("Enter Airport City: ");
		airportName = in.nextLine();
	}

	public void output() {
		System.out.println("Airport Information: ");
		System.out.println("Airport ID:" + airportID);
		System.out.println("Airport Name:" + airportName);
		System.out.println("Airport City:" + airportCity);

	}

}
