// package DOANOOP;

import java.util.Scanner;

public class Airport { //SAN BAY
	//Attribute
	Scanner in=new Scanner(System.in);
	private String airportID; //Lưu trữ mã sân bay
	private String airportName; // Lưu trữ tên sân bay
	private String city; // Lưu trữ tên thành phố có cái sân bay đó
	
	public Airport(String airportID,String airportName,String city) {
		this.airportID=airportID;
		this.airportName=airportName;
		this.city=city;
	}
	
	public Airport(Airport a) {
		this.airportID=a.airportID;
		this.airportName=a.airportName;
		this.city=a.city;
	}

	public String getairportID() {
		return airportID;
	}

	public void setairportID(String airportID) {
		airportID = airportID;
	}

	public String getairportName() {
		return airportName;
	}

	public void setairportName(String airportName) {
		airportName = airportName;
	}

	public String getcity() {
		return city;
	}

	public void setcity(String city) {
		city = city;
	}
	// Đây là phương thức nhập thông tin của 1 sân bay
	public void Nhap() {
		System.out.println("Nhap Thong Tin San Bay");
		System.out.println("Nhap ma san bay");
		this.airportID=in.nextLine();
		System.out.println("Nhap ten san bay");
		this.airportName=in.nextLine();
		System.out.println("Nhap ten thanh pho");
		this.airportName=in.nextLine();
	}
	
	// Đây là phương thức trả về thông tin của 1 sân bay
	public String Xuat() {
		return "\nairportID: "+this.airportID+
				"\nairportName: "+this.airportName
				+"\ncity: "+this.city+"\n";
	}
	
	
}
