// package DOANOOP;

import java.util.Scanner;

public class FlightRoutes { // TUYEN BAY
	// Attribute
	private String flightRouteId; // ma tuyen bay
	private String takeOffAirport; // San Bay Cat Canh;
	private String landingAirport;// San Bay Ha Canh;
	private String takeOffTime; // gio cat canh
	private String landingTime; // gio ha canh

	public FlightRoutes() {
	}

	public FlightRoutes(String flightRouteId, String takeOffAirport, String landingAirport, String takeOffTime, String landingTime) {
		this.flightRouteId = flightRouteId;
		this.takeOffAirport = takeOffAirport;
		this.landingAirport = landingAirport;
		this.takeOffTime = takeOffTime;
		this.landingTime = landingTime;
	}

	public FlightRoutes(FlightRoutes a) {
		takeOffAirport = a.takeOffAirport;
		landingAirport = a.landingAirport;
		flightRouteId = a.flightRouteId;
		takeOffTime = a.takeOffTime;
		landingTime = a.landingTime;
	}

	public String getFlightRouteId() {
		return flightRouteId;
	}

	public void setFlightRouteId(String flightRouteId) {
		this.flightRouteId = flightRouteId;
	}

	public String getTakeOffAirport() {
		return takeOffAirport;
	}

	public void setTakeOffAirport(String takeOffAirport) {
		this.takeOffAirport = takeOffAirport;
	}

	public String getLandingAirport() {
		return landingAirport;
	}

	public void setLandingAirport(String landingAirport) {
		this.landingAirport = landingAirport;
	}

	public String getTakeOffTime() {
		return takeOffTime;
	}

	public void setTakeOffTime(String takeOffTime) {
		this.takeOffTime = takeOffTime;
	}

	public String getLandingTime() {
		return landingTime;
	}

	public void setLandingTime(String landingTime) {
		this.landingTime = landingTime;
	}

	public void input() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Flight Route ID: ");
		flightRouteId = sc.nextLine();
		System.out.println("Enter Take Off Airport: ");
		takeOffAirport = in.nextLine();
		System.out.println("Enter Landing Airport: ");
		landingAirport = in.nextLine();
		System.out.println("Enter Take Off Time:");
		takeOffTime = in.nextLine();
		System.out.println("Enter Landing Time: ");
		landingTime = in.nextLine();
	}

	public void output() {
		System.out.println("Flight Route Information: ");
		System.out.println("Flight Route ID: " + flightRouteId);
		System.out.println("Take Off Airport: " + takeOffAirport);
		System.out.println("Landing Airport: " + landingAirport);
		System.out.println("Take Off Time:" + takeOffTime);
		System.out.println("Landing Time: " + landingTime);
	}
}
