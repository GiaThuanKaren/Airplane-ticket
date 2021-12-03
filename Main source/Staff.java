// package doan;
import java.util.Scanner;
public class Staff { // NHAN VIEN
	// Attribute
	private String staffId; // ma nhan vien
	private String staffName; // ten nhan vien
	private String phoneNumber; // so dien thoai nhan vien
	private String identityCart ; // can cuoc cong dan

	public Staff() {

	}

	public Staff(String staffId, String staffName, String phoneNumber, String identityCart) {
		this.staffId = staffId;
		this.staffName = staffName;
		this.phoneNumber = phoneNumber;
		this.identityCart = identityCart;
	}

	public Staff(Staff s) {
		staffId = s.staffId;
		staffName = s.staffName;
		phoneNumber = s.phoneNumber;
		identityCart = s.identityCart;
	}

	public String getIdentityCart() {
		return identityCart;
	}

	public void setIdentityCart(String identityCart) {
		this.identityCart = identityCart;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Staff ID: ");
		staffId = sc.nextLine();
		System.out.println("Enter Staff Name: ");
		staffName = sc.nextLine();
		System.out.println("Enter Phone Number: ");
		phoneNumber = sc.nextLine();
		System.out.println("Enter Identity Cart: ");
		identityCart = sc.nextLine();
		
	}

	public void output() {
		System.out.println("Staff information: ");
		System.out.println("Staff ID: " + staffId);
		System.out.println("Staff Name: " + staffName);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("IdentityCart: " + identityCart);
	}

}

