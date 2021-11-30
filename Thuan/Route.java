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
		routeID=a.routeID;
		routeName=a.routeName;
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

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public void input() {
		System.out.println("Enter Route ID: ");
		routeID = in.nextLine();
		System.out.println("Enter Route Name: ");
		routeName = in.nextLine();
	}
	
	public void output(){
		System.out.println("Route Information: ");
		System.out.println("Route ID: " + routeID);
		System.out.println("Route Name: " + routeName);
	}
	
	
}
