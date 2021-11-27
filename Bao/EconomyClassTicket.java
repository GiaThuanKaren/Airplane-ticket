import java.util.Scanner;

public class EconomyClassTicket extends FlightTicket { // VE PHO THONG
    // Attribute
    private int chairNumber; // so ghe

    public EconomyClassTicket() {
    }

    public EconomyClassTicket(String flightTicketId, String flightId, boolean ticketType, int numberOfTicket,
            int numberOfTicketLeft, int ticketPrice, int chairNumber) {
        super(flightTicketId, flightId, ticketType, numberOfTicket, numberOfTicketLeft, ticketPrice);
        this.chairNumber = chairNumber;
    }

    public EconomyClassTicket(EconomyClassTicket ect) {
        super((EconomyClassTicket) ect);
        chairNumber = ect.chairNumber;
    }

    public int getChairNumber() {
        return chairNumber;
    }

    public void setChairNumber(int chairNumber) {
        this.chairNumber = chairNumber;
    }

    @Override
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
        System.out.println("Enter Chair Number: ");
        chairNumber = sc.nextInt();
    }

    @Override
    public void output() {
        System.out.println("Enter Flight Ticket ID: " + flightTicketId);
        System.out.println("Enter Flight ID: " + flightId);
        System.out.println("Enter Ticket Type: " + ticketType);
        System.out.println("Enter Number Of Ticket: " + numberOfTicket);
        System.out.println("Enter Number Of Ticket Left: " + numberOfTicketLeft);
        System.out.println("Enter Ticket Price: " + ticketPrice);
        System.out.println("Enter Chair Number: " + chairNumber);
    }
}