// package com.company;

import java.util.Scanner;

public class InvoiceDetail { //CHI TIET HOA DON
    private String invoiceID;//mã hóa đơn
    private String customerTicketID;//mã vé khách hàng
    private int numberOfTickets;//số lượng vé
    private double price;//giá
    Scanner sc = new Scanner(System.in);

    public InvoiceDetail() {

    }

    public InvoiceDetail(String invoiceID, String customerTicketID, int numberOfTickets, double price) {
        this.invoiceID = invoiceID;
        this.customerTicketID = customerTicketID;
        this.numberOfTickets = numberOfTickets;
        this.price = price;
    }

    public InvoiceDetail(InvoiceDetail invoiceDetail) {
        invoiceDetail.invoiceID = this.invoiceID;
        invoiceDetail.customerTicketID = this.customerTicketID;
        invoiceDetail.numberOfTickets = this.numberOfTickets;
        invoiceDetail.price = this.price;
    }

    public String getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    public String getCustomerTicketID() {
        return customerTicketID;
    }

    public void setCustomerTicketID(String customerTicketID) {
        this.customerTicketID = customerTicketID;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void input() {
        System.out.println("Enter invoice ID: ");
        invoiceID = sc.nextLine();
        System.out.println("Enter customer's ticket ID: ");
        customerTicketID = sc.nextLine();
        System.out.println("Enter number of tickets: ");
        numberOfTickets = sc.nextInt();
        System.out.println("Enter price: ");
        price = sc.nextDouble();
    }

    public void output() {
        System.out.println("Invoice ID: " + invoiceID);
        System.out.println("Customer's ticket ID: " + customerTicketID);
        System.out.println("Number of tickets: " + numberOfTickets);
        System.out.println("Price: " + price);
    }
}
