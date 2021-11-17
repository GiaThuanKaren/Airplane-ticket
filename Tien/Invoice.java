package Doan;

import java.util.Scanner;

public class Invoice {
	private String invoiceID; // Mã hoá đơn
	private String invoiceDate; // Ngày lập hoá đơn
	private int price; // Thành tiền
	private String ticketID; // Mã vé
	Scanner sc = new Scanner(System.in);

	public Invoice() {

	}

	public Invoice(String invoiceID, String invoiceDate, int price, String ticketID) {
		this.invoiceID = invoiceID;
		this.invoiceDate = invoiceDate;
		this.price = price;
		this.ticketID = ticketID;
	}

	public Invoice(Invoice invoice) {
		invoiceID = invoice.invoiceID;
		invoiceDate = invoice.invoiceDate;
		price = invoice.price;
		ticketID = invoice.ticketID;
	}

	public String getInvoiceID() {
		return invoiceID;
	}

	public void setInvoiceID(String invoiceID) {
		this.invoiceID = invoiceID;
	}

	public String getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTicketID() {
		return ticketID;
	}

	public void setTicketID(String ticketID) {
		this.ticketID = ticketID;
	}

	public void input() {
		System.out.println("Enter invoice ID: ");
		invoiceID = sc.nextLine();
		System.out.println("Enter invoice date (dd/mm/yyyy): ");
		invoiceDate = sc.nextLine();
		System.out.println("Enter price: ");
		price = sc.nextInt();
		System.out.println("Enter ticket ID: ");
		ticketID = sc.nextLine();
	}

	public void output() {
		System.out.println("Invoice ID: " + invoiceID);
		System.out.println("Invoice date: " + invoiceDate);
		System.out.println("Price: " + price);
		System.out.println("Ticket ID: " + ticketID);
	}
}
