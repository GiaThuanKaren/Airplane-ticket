package Doan;

import java.util.Scanner;

public class Customer {
	private String customerID; // ID khách hàng
	private String customerName;// Tên khách hàng
	private String customerAdd; // Địa chỉ khách hàng
	private String gender; // Giới tính
	Scanner sc = new Scanner(System.in);

	public Customer() {

	}

	public Customer(String customerID, String customerName, String customerAdd, String gender) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerAdd = customerAdd;
		this.gender = gender;
	}

	public Customer(Customer cus) {
		customerID = cus.customerID;
		customerName = cus.customerName;
		customerAdd = cus.customerAdd;
		gender = cus.gender;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAdd() {
		return customerAdd;
	}

	public void setCustomerAdd(String customerAdd) {
		this.customerAdd = customerAdd;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void input() {
		System.out.println("Enter customer ID: ");
		customerID = sc.nextLine();
		System.out.println("Enter customer name: ");
		customerName = sc.nextLine();
		System.out.println("Enter customer address");
		customerAdd = sc.nextLine();
		System.out.println("Enter customer gender");
		gender = sc.nextLine();
	}

	public void output() {
		System.out.println("Customer information");
		System.out.println("ID: " + customerID);
		System.out.println("Name: " + customerName);
		System.out.println("Address: " + customerAdd);
		System.out.println("Gender: " + gender);
	}
}
