// package com.company;

import java.util.Scanner;

public class CustomerTicket { //VE - KH
    private String customerTicketID;//mã vé-kh
    private String customerID;//mã khách hàng
    private String ticketID;// mã vé
    private String boardingTime;// giờ lên máy bay
    private int seatNumber;// số ghế
    Scanner sc = new Scanner(System.in);

    public CustomerTicket() {

    }

    public CustomerTicket(String customerTicketID, String customerID, String ticketID, String boardingTime, int seatNumber) {
        this.customerTicketID = customerTicketID;
        this.customerID = customerID;
        this.ticketID = ticketID;
        this.boardingTime = boardingTime;
        this.seatNumber = seatNumber;
    }

    public CustomerTicket(CustomerTicket customerTicket) {
        customerTicket.customerTicketID = this.customerTicketID;
        customerTicket.customerID = this.customerID;
        customerTicket.ticketID = this.ticketID;
        customerTicket.boardingTime = this.boardingTime;
        customerTicket.seatNumber = this.seatNumber;
    }

    public void input() {
        System.out.println("Enter customer ticket ID: ");
        customerTicketID = sc.nextLine();
        System.out.println("Enter customer ID: ");
        customerID = sc.nextLine();
        System.out.println("Enter ticket ID: ");
        ticketID = sc.nextLine();
        System.out.println("Enter boarding time: ");
        boardingTime = sc.nextLine();
        System.out.println("Enter seat number: ");
        seatNumber = sc.nextInt();
    }

    public void output() {
        System.out.println("Customer ticket ID: " + customerTicketID);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Ticket ID: " + ticketID);
        System.out.println("Boarding time: " + boardingTime);
        System.out.println("Seat number: " + seatNumber);
    }
}
