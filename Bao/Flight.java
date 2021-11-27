import java.util.Scanner;

public class Flight { // CHUYEN BAY
    // Attribute
    private String flightId; // ma chuyen bay
    private String routeId; // ma lo trinh
    private String flightRouteId; // ma tuyen bay
    private String planeId; // ma may bay
    private int status; // 1 - san sang, 0 - khong san sang
    private String takeOffTime; // gio cat canh
    private String landingTime; // gio ha canh
    private String takeOffDay; // ngay cat canh
    private String landingDay; // ngay ha canh

    public Flight() {
    }

    public Flight(String flightId, String routeId, String flightRouteId, String planeId, int status, String takeOffTime,
            String landingTime, String takeOffDay, String landingDay) {
        this.flightId = flightId;
        this.routeId = routeId;
        this.flightRouteId = flightRouteId;
        this.planeId = planeId;
        this.status = status;
        this.takeOffTime = takeOffTime;
        this.landingTime = landingTime;
        this.takeOffDay = takeOffDay;
        this.landingDay = landingDay;
    }

    public Flight(Flight f) {
        flightId = f.flightId;
        routeId = f.routeId;
        flightRouteId = f.flightRouteId;
        planeId = f.planeId;
        status = f.status;
        takeOffTime = f.takeOffTime;
        landingTime = f.landingTime;
        takeOffDay = f.takeOffDay;
        landingDay = f.landingDay;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getFlightRouteId() {
        return flightRouteId;
    }

    public void setFlightRouteId(String flightRouteId) {
        this.flightRouteId = flightRouteId;
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

    public String getTakeOffTime() {
        return takeOffTime;
    }

    public void setTakeOffTime(String takeOffTime) {
        this.takeOffTime = takeOffTime;
    }

    public String getTakeOffDay() {
        return takeOffDay;
    }

    public void setTakeOffDay(String takeOffDay) {
        this.takeOffDay = takeOffDay;
    }

    public String getLandingDay() {
        return landingDay;
    }

    public void setLandingDay(String landingDay) {
        this.landingDay = landingDay;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Flight ID: ");
        flightId = sc.nextLine();
        System.out.println("Enter Route ID: ");
        routeId = sc.nextLine();
        System.out.println("Enter Flight Route ID: ");
        flightRouteId = sc.nextLine();
        System.out.println("Enter Plane ID: ");
        planeId = sc.nextLine();
        System.out.println("Enter Status: \n 0: Available \n 1: Non-available \n");
        status = sc.nextInt();
        System.out.println("Enter Take Off Time: ");
        takeOffTime = sc.nextLine();
        System.out.println("Enter Landing Time: ");
        landingTime = sc.nextLine();
        System.out.println("Enter Take Off Day: ");
        takeOffDay = sc.nextLine();
        System.out.println("Enter Landing Day: ");
        landingDay = sc.nextLine();
    }

    public void output() {
        System.out.println("Enter Flight ID: " + flightId);
        System.out.println("Enter Route ID: " + routeId);
        System.out.println("Enter Flight Route ID: " + flightRouteId);
        System.out.println("Enter Plane ID: " + planeId);
        System.out.println("Enter Status: " + status);
        System.out.println("Enter Take Off Time: " + takeOffTime);
        System.out.println("Enter Landing Time: " + landingTime);
        System.out.println("Enter Take Off Day: " + takeOffDay);
        System.out.println("Enter Landing Day: " + LandingDay);
    }
}