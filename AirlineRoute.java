import java.util.Scanner;

public class AirlineRoute { // TUYEN BAY
    // Attribute
    private String airlineRouteId; // ma tuyen bay
    private String takeOffAirport; // san bay cat canh
    private String landingAirport; // san bay ha canh
    private String takeOffTime; // thoi gian cat canh
    private String landingTime; // thoi gian ha canh
    private String takeOffDay; // ngay cat canh canh
    private String landingDay; // ngay ha canh

    public AirlineRoute() {
    }

    public AirlineRoute(String airlineRouteId, String takeOffAirport, String ladingAirport, String takeOffTime,
            String landingTime, String takeOffDay, String landingDay) {
        this.airlineRouteId = airlineRouteId;
        this.takeOffAirport = takeOffAirport;
        this.landingAirport = ladingAirport;
        this.takeOffTime = takeOffTime;
        this.landingTime = landingTime;
        this.takeOffDay = takeOffDay;
        this.landingDay = landingDay;
    }

    public AirlineRoute(AirlineRoute a) {
        airlineRouteId = a.airlineRouteId;
        takeOffAirport = a.takeOffAirport;
        landingAirport = a.landingAirport;
        takeOffTime = a.takeOffTime;
        landingTime = a.landingTime;
        takeOffDay = a.takeOffDay;
        landingDay = a.landingDay;
    }

    public String getAirlineRouteId() {
        return airlineRouteId;
    }

    public void setAirlineRouteId(String airlineRouteId) {
        this.airlineRouteId = airlineRouteId;
    }

    public String getTakeOffAirport() {
        return takeOffAirport;
    }

    public void setTakeOffAirport(String takeOffAirport) {
        this.takeOffAirport = takeOffAirport;
    }

    public String getLandingAirport() {
        return landingAirport;
    }

    public void setLandingAirport(String landingAirport) {
        this.landingAirport = landingAirport;
    }

    public String getTakeOffTime() {
        return takeOffTime;
    }

    public void setTakeOffTime(String takeOffTime) {
        this.takeOffTime = takeOffTime;
    }

    public String getLandingTime() {
        return landingTime;
    }

    public void setLandingTime(String landingTime) {
        this.landingTime = landingTime;
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
        System.out.println("Enter Airline Route ID: ");
        airlineRouteId = sc.nextLine();
        System.out.println("Enter Take off Airport: ");
        takeOffAirport = sc.nextLine();
        System.out.println("Enter Landing Airport: ");
        landingAirport = sc.nextLine();
        System.out.println("Enter Take off Time: ");
        takeOffTime = sc.nextLine();
        System.out.println("Enter Landing Time: ");
        landingTime = sc.nextLine();
        System.out.println("Enter Take off Day: ");
        takeOffDay = sc.nextLine();
        System.out.println("Enter Landing Day: ");
        landingDay = sc.nextLine();
    }

    public void output() {
        System.out.println("Airline Route information: ");
        System.out.println("Airline Route ID: " + airlineRouteId);
        System.out.println("Take off Airport: " + takeOffAirport);
        System.out.println("Landing Airport: " + landingAirport);
        System.out.println("Take off Time: " + takeOffTime);
        System.out.println("Landing Time: " + landingTime);
        System.out.println("Take off Day: " + takeOffDay);
        System.out.println("Landing Day: " + landingDay);
    }
}