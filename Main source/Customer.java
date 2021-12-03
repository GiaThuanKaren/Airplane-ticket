// package doan;

import java.util.Scanner;

public class Customer { //KHACH HANG
	// Attribute
	private String customerId; // ma khach hang
	private String customerName; // ten khach hang
	private String phoneNumber; // so dien thoai khach hang
	private String identityCart; // can cuoc cong dan
	private String sex; // gioi tinh khach hang
	
	
	public Customer() {
		
	}

	public Customer(String customerId, String customerName, String phoneNumber, String identityCart, String sex) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.identityCart = identityCart;
		this.sex = sex;
	}
	
	public Customer(Customer c) {
		customerId = c.customerId;
		customerName = c.customerName;
		phoneNumber = c.phoneNumber;
		identityCart = c.identityCart;
		sex = c.sex;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
		System.out.println("Enter Customer ID: ");
		customerId = sc.nextLine();
		System.out.println("Enter Customer Name: ");
		customerName = sc.nextLine();
		System.out.println("Enter Phone Number: ");
		phoneNumber = sc.nextLine();
		System.out.println("Enter Identity Cart: ");
		identityCart = sc.nextLine();
		System.out.println("Enter Customer Sex: ");
		sex = sc.nextLine();
		
	}

	public void output() {
		System.out.println("Customer information: ");
		System.out.println("Customer ID: " + customerId);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("IdentityCart: " + identityCart);
		System.out.println("Sex: " + sex);
	}

}
