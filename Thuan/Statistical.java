
import java.util.Scanner;

public class Statistical { // THONG KE
	// Attribute
	private String statisticalId; // ma thong ke
	private String ticketName; // ten hang ve
	private int numberOfTicket; // so luong hang ve
	private int ticketRevenue; // doanh thu ve

	public Statistical() {

	}

	public Statistical(String statisticalId, String ticketName, int numberOfTicket, int ticketRevenue) {
		this.statisticalId = statisticalId;
		this.ticketName = ticketName;
		this.numberOfTicket = numberOfTicket;
		this.ticketRevenue = ticketRevenue;
	}

	public Statistical(Statistical s) {
		statisticalId = s.statisticalId;
		ticketName = s.ticketName;
		numberOfTicket = s.numberOfTicket;
		ticketRevenue = s.ticketRevenue;
	}

	public String getStatisticalId() {
		return statisticalId;
	}

	public void setStatisticalId(String statisticalId) {
		this.statisticalId = statisticalId;
	}

	public String getTicketName() {
		return ticketName;
	}

	public void setTicketName(String ticketName) {
		this.ticketName = ticketName;
	}

	public int getNumberOfTicket() {
		return numberOfTicket;
	}

	public void setNumberOfTicket(int numberOfTicket) {
		this.numberOfTicket = numberOfTicket;
	}

	public int getTicketRevenue() {
		return ticketRevenue;
	}

	public void setTicketRevenue(int ticketRevenue) {
		this.ticketRevenue = ticketRevenue;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Statistical ID: ");
		statisticalId = sc.nextLine();
		System.out.println("Enter Ticket Name: ");
		ticketName = sc.nextLine();
		System.out.println("Enter Number Of Ticket: ");
		numberOfTicket = sc.nextInt();
		System.out.println("Enter Revenue Of Ticket: ");
		ticketRevenue = sc.nextInt();
	}

	public void output() {
		System.out.println("Statistical information: ");
		System.out.println("Statistical ID: " + statisticalId);
		System.out.println("Ticket Name: " + ticketName);
		System.out.println("Number Of Ticket: " + numberOfTicket);
		System.out.println("Revenue Of Ticket: " + ticketRevenue + " " + "VND");
	}

}
