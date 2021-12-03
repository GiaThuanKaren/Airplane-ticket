// package com.company;

import java.util.Scanner;

public class CustomerTicket { // VE - KH
    private String customerTicketID;// mã vé-kh
    private String customerID;// mã khách hàng
    private String ticketID;// mã vé
    private String purchaseDate;// ngày mua vé

    public CustomerTicket() {

    }

    public CustomerTicket(String customerTicketID, String customerID, String ticketID, String purchaseDate) {
        this.customerTicketID = customerTicketID;
        this.customerID = customerID;
        this.ticketID = ticketID;
        this.purchaseDate = purchaseDate;
    }

    public CustomerTicket(CustomerTicket ct) {
        ct.customerTicketID = this.customerTicketID;
        ct.customerID = this.customerID;
        ct.purchaseDate = this.purchaseDate;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer ticket ID: ");
        customerTicketID = sc.nextLine();
        System.out.println("Enter customer ID: ");
        customerID = sc.nextLine();
        System.out.println("Enter ticket ID: ");
        ticketID = sc.nextLine();
        System.out.println("Enter purchase date: ");
        purchaseDate = sc.nextLine();
    }

    public void output() {
        System.out.println("Customer ticket Information: ");
        System.out.println("Customer ticket ID: " + customerTicketID);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Ticket ID: " + ticketID);
        System.out.println("Purchase date: " + purchaseDate);
    }
}
