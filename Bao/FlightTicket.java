import java.util.Scanner;

public class FlightTicket { // VE CHUYEN BAY
    // Attribute
    private String flightTicketId; // Ma ve
    private String flightId; // ma chuyen bay
    private int ticketType; // loai ve (0 - Khu hoi, 1 - mot chieu)
    private int numberOfTicket; // tong so luong ve
    private int numberOfTicketLeft; // so luong ve con lai

    private int ticketPrice; // gia ve

    public FlightTicket() {
    }

    public FlightTicket(String flightTicketId, String flightId, int ticketType, int numberOfTicket,
            int numberOfTicketLeft, int ticketPrice) {
        this.flightTicketId = flightTicketId;
        this.flightId = flightId;
        this.ticketType = ticketType;
        this.numberOfTicket = numberOfTicket;
        this.numberOfTicketLeft = numberOfTicketLeft;
        this.ticketPrice = ticketPrice;
    }

    public FlightTicket(FlightTicket ft) {
        flightTicketId = ft.flightTicketId;
        flightId = ft.flightId;
        ticketType = ft.ticketType;
        numberOfTicket = ft.numberOfTicket;
        numberOfTicketLeft = ft.numberOfTicketLeft;
        ticketPrice = ft.ticketPrice;
    }

    public String getFlightTicketId() {
        return flightTicketId;
    }

    public void setFlightTicketId(String flightTicketId) {
        this.flightTicketId = flightTicketId;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public int getTicketType() {
        return ticketType;
    }

    public void setTicketType(int ticketType) {
        this.ticketType = ticketType;
    }

    public int getNumberOfTicket() {
        return numberOfTicket;
    }

    public void setNumberOfTicket(int numberOfTicket) {
        this.numberOfTicket = numberOfTicket;
    }

    public int getNumberOfTicketLeft() {
        return numberOfTicketLeft;
    }

    public void setNumberOfTicketLeft(int numberOfTicketLeft) {
        this.numberOfTicketLeft = numberOfTicketLeft;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Flight Ticket ID: ");
        flightTicketId = sc.nextLine();
        System.out.println("Enter Flight ID: ");
        flightId = sc.nextLine();
        System.out.println("Enter Ticket Type: \n 0: Round Tip \n 1: One Way");
        ticketType = sc.nextInt();
        System.out.println("Enter Number Of Ticket: ");
        numberOfTicket = sc.nextInt();
        System.out.println("Enter Number Of Ticket Left: ");
        numberOfTicketLeft = sc.nextInt();
        System.out.println("Enter Ticket Price: ");
        ticketPrice = sc.nextInt();
    }

    public void output() {
        System.out.println("Enter Flight Ticket ID: " + flightTicketId);
        System.out.println("Enter Flight ID: " + flightId);
        System.out.println("Enter Ticket Type: " + ticketType);
        System.out.println("Enter Number Of Ticket: " + numberOfTicket);
        System.out.println("Enter Number Of Ticket Left: " + numberOfTicketLeft);
        System.out.println("Enter Ticket Price: " + ticketPrice);
    }
}