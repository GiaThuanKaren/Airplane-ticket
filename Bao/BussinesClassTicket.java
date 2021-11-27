import java.util.Scanner;

public class BusinessClassTicket extends FlightTicket { // VE PHO THONG
    // Attribute
    private int chairNumber; // so ghe
    private String waitingRoomId; // ma phong cho
    private String businessClassId; // ma khoang

    public BusinessClassTicket() {
    }

    public BusinessClassTicket(String flightTicketId, String flightId, boolean ticketType, int numberOfTicket,
            int numberOfTicketLeft, int ticketPrice, int chairNumber, String waitingRoomId, String businessClassId) {
        super(flightTicketId, flightId, ticketType, numberOfTicket, numberOfTicketLeft, ticketPrice);
        this.chairNumber = chairNumber;
        this.waitingRoomId = waitingRoomId;
        this.businessClassId = businessClassId;
    }

    public BusinessClassTicket(BusinessClassTicket bct) {
        super((BusinessClassTicket) bct);
        chairNumber = bct.chairNumber;
        waitingRoomId = bct.waitingRoomId;
        businessClassId = bct.businessClassId;
    }

    public int getChairNumber() {
        return chairNumber;
    }

    public void setChairNumber(int chairNumber) {
        this.chairNumber = chairNumber;
    }

    public String getWaitingRoomId() {
        return waitingRoomId;
    }

    public void setWaitingRoomId(String waitingRoomId) {
        this.waitingRoomId = waitingRoomId;
    }

    public String getBusinessClassId() {
        return businessClassId;
    }

    public void setBusinessClassId(String businessClassId) {
        this.businessClassId = businessClassId;
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
        System.out.println("Enter Waiting Room ID: ");
        waitingRoomId = sc.nextString();
        System.out.println("Enter Business Class ID: ");
        businessClassId = sc.nextString();
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
        System.out.println("Enter Waiting Room ID: " + waitingRoomId);
        System.out.println("Enter Business Class ID: " + businessClassId);
    }
}
