// package DOANOOP;

import java.util.Scanner;

public class Route { //LO TRINH
	//Attribute
	private String routeID; //Ma Lo Trinh
	private String routeName; // Ten Lo Trinh
	
	Scanner in =new Scanner(System.in);
	
	public Route(String routeID,String routeName) {
		this.routeID=routeID;
		this.routeName=routeName;
	}
	
	public Route(Route a) {
		this.routeID=a.routeID;
		this.routeName=a.routeName;
	}

	public String getRouteID() {
		return routeID;
	}

	public void setRouteID(String routeID) {
		this.routeID = routeID;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setrouteName(String routeName) {
		routeName = routeName;
	}
	public void Nhap() {
		System.out.println("Nhap thong tin cho lo trinh");
		System.out.println("Nhap ma lo trinh");
		this.routeID=in.nextLine();
		System.out.println("Nhap ten lo trinh");
		this.routeName=in.nextLine();
	}
	
	public String Xuat() {
		return "Ma Lo Trinh: "+this.routeID
				+"\nTen Lo Trinh: "+this.routeName
				+"\n";
	}
	
	
}
