import java.util.Scanner;

public class Flight { // CHUYEN BAY
    // Attribute
    private String flightId; // ma chuyen bay
    private String planeId; // ma may bay
    private int status; // trang thai cua may bay: san sang - 2, dang cho - 1, khong san sang - 0
    private boolean type; // loai chuyen bay: khu hoi - 1, mot chieu - 0

    public Flight() {
    }

    public Flight(String flightId, String planeId, int status, boolean type) {
        this.flightId = flightId;
        this.planeId = planeId;
        this.status = status;
        this.type = type;
    }

    public Flight(Flight f) {
        flightId = f.flightId;
        planeId = f.planeId;
        status = f.status;
        type = f.type;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getPlaneId() {
        return planeId;
    }

    public void setPlaneId(String planeId) {
        this.planeId = planeId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean getType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Flight ID: ");
        flightId = sc.nextLine();
        System.out.println("Enter Plane ID: ");
        planeId = sc.nextLine();
        System.out.println("Enter Status: ");
        status = sc.nextInt();
        System.out.println("Enter Flight type: ");
        type = sc.nextBoolean();
    }

    public void output() {
        System.out.println("Flight information: ");
        System.out.println("Flight ID: " + flightId);
        System.out.println("Plane ID: " + planeId);
        System.out.println("Status: " + status);
        System.out.println("Flight type: " + type);
    }
}