package Doan;

import java.util.Scanner;

public class UnitPrice {
	private String priceID; // Mã đơn giá
	private String priceName; // Tên đơn giá
	Scanner sc = new Scanner(System.in);

	public UnitPrice() {

	}

	public UnitPrice(String priceID, String priceName) {
		this.priceID = priceID;
		this.priceName = priceName;
	}

	public UnitPrice(UnitPrice unitPrice) {
		priceID = unitPrice.priceID;
		priceName = unitPrice.priceName;
	}

	public String getPriceID() {
		return priceID;
	}

	public void setPriceID(String priceID) {
		this.priceID = priceID;
	}

	public String getPriceName() {
		return priceName;
	}

	public void setPriceName(String priceName) {
		this.priceName = priceName;
	}

	public void input() {
		System.out.println("Enter price ID: ");
		priceID = sc.nextLine();
		System.out.println("Enter price name: ");
		priceID = sc.nextLine();
	}

	public void output() {
		System.out.println("Price ID: " + priceID);
		System.out.println("Price name: " + priceName);
	}
}
