// package doan;

import java.util.Scanner;

public class Client { //KHACH HANG
	// Attribute
	private String clientId; // ma khach hang
	private String clientName; // ten khach hang
	private String phoneNumber; // so dien thoai khach hang
	private String identityCart; // can cuoc cong dan
	private String sex; // gioi tinh khach hang
	
	
	public Client() {
		
	}

	public Client(String clientId, String clientName, String phoneNumber, String identityCart, String sex) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.phoneNumber = phoneNumber;
		this.identityCart = identityCart;
		this.sex = sex;
	}
	
	public Client(Client c) {
		clientId = c.clientId;
		clientName = c.clientName;
		phoneNumber = c.phoneNumber;
		identityCart = c.identityCart;
		sex = c.sex;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getIdentityCart() {
		return identityCart;
	}

	public void setIdentityCart(String identityCart) {
		this.identityCart = identityCart;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Client ID: ");
		clientId = sc.nextLine();
		System.out.println("Enter Client Name: ");
		clientName = sc.nextLine();
		System.out.println("Enter Phone Number: ");
		phoneNumber = sc.nextLine();
		System.out.println("Enter Identity Cart: ");
		identityCart = sc.nextLine();
		System.out.println("Enter Client Sex: ");
		sex = sc.nextLine();
		
	}

	public void output() {
		System.out.println("Staff information: ");
		System.out.println("Staff ID: " + clientId);
		System.out.println("Staff Name: " + clientName);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("IdentityCart: " + identityCart);
		System.out.println("Sex: " + sex);
	}

}
