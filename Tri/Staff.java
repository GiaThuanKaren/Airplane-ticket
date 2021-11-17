
import java.util.Scanner;

public class Staff { // NHAN VIEN
	// Attribute
	private String staffId; // ma nhan vien
	private String staffName; // ten nhan vien
	private String phoneNumber; // so dien thoai nhan vien

	public Staff() {

	}

	public Staff(String staffId, String staffName, String phoneNumber) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.phoneNumber = phoneNumber;
	}

	public Staff(Staff s) {
		staffId = s.staffId;
		staffName = s.staffName;
		phoneNumber = s.phoneNumber;
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
	}

	public void output() {
		System.out.println("Staff information: ");
		System.out.println("Staff ID: " + staffId);
		System.out.println("Staff Name: " + staffName);
		System.out.println("Phone Number: " + phoneNumber);
	}

}
