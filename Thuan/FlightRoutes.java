package DOANOOP;

import java.util.Scanner;

public class FlightRoutes { // TUYEN BAY
	// Attribute
	private String flightId; // ma tuyen bay
	private String takeOffAirport; // San Bay Cat Canh;
	private String landingAirport;// San Bay Ha Canh;

	public FlightRoutes() {
	}

	public FlightRoutes(String flightId, String takeOffAirport, String landingAirport) {
		this.flightId = flightId;
		this.takeOffAirport = takeOffAirport;
		this.landingAirport = landingAirport;
	}

	public FlightRoutes(FlightRoutes a) {
		takeOffAirport = a.takeOffAirport;
		landingAirport = a.landingAirport;
		flightId = a.flightId;
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
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

	public void Input() {
		System.out.println("Enter  ");
		flightId = in.nextLine();
		System.out.println("Nhap San bay luc khoi hanh");
		takeOffAirport = in.next();
		System.out.println("Nhap san bay luc dap xuong");
		this.landingAirport = in.next();
	}

	public String OutPut() {
		Scanner in = new Scanner(System.in);
		System.out.println("Flight Route Information: ");

	}
}
