public class TestFlightList {
    public static void main(String[] args) {
        FlightList fl = new FlightList();
        fl.input();
        try {
            fl.writeFile();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        fl.readFile();
    }
}
