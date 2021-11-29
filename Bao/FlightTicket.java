import java.util.Scanner;

public class FlightTicket { // VE CHUYEN BAY
    // Attribute
    private String flightTicketId; // Ma ve
    private String flightId; // ma chuyen bay
    private int ticketType; // loai ve (0 - Khu hoi, 1 - mot chieu)
    private String boardingTime; // gio len may bay
    private int ticketPrice; // gia ve

    public FlightTicket() {
    }

    public FlightTicket(String flightTicketId, String flightId, int ticketType, String boardingTime, int ticketPrice) {
        this.flightTicketId = flightTicketId;
        this.flightId = flightId;
        this.ticketType = ticketType;
        this.boardingTime = boardingTime;
        this.ticketPrice = ticketPrice;
    }

    public FlightTicket(FlightTicket ft) {
        flightTicketId = ft.flightTicketId;
        flightId = ft.flightId;
        ticketType = ft.ticketType;
        boardingTime = ft.boardingTime;
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

    public String getBoardingTime() {
        return boardingTime;
    }

    public void setBoardingTime(String boardingTime) {
        this.boardingTime = boardingTime;
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
        System.out.println("Enter Boarding Time: ");
        boardingTime = sc.nextLine();
        System.out.println("Enter Ticket Price: ");
        ticketPrice = sc.nextInt();
    }

    public void output() {
        System.out.println("Flight Ticket Information: ");
        System.out.println("Flight Ticket ID: " + flightTicketId);
        System.out.println("Flight ID: " + flightId);
        System.out.println("Ticket Type: " + ticketType);
        System.out.println("Boarding Time: " + boardingTime);
        System.out.println("Ticket Price: " + ticketPrice);
    }
}