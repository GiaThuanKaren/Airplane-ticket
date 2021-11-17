
import java.util.Scanner;

public class Airline { // HANG BAY
	// Attribute
	private String airlineId; // ma hang bay
	private String airlineName; // ten hang bay

	public Airline() {

	}

	public Airline(String airlineId, String airlineName) {
		this.airlineId = airlineId;
		this.airlineName = airlineName;
	}

	public Airline(Airline a) {
		airlineId = a.airlineId;
		airlineName = a.airlineName;
	}

	public String getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(String airlineId) {
		this.airlineId = airlineId;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Airline ID: ");
		airlineId = sc.nextLine();
		System.out.println("Enter Airline Name: ");
		airlineName = sc.nextLine();

	}

	public void output() {
		System.out.println("Airline information: ");
		System.out.println("Airline ID: " + airlineId);
		System.out.println("Airline Name: " + airlineName);
	}
}
