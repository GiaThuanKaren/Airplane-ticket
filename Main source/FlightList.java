import java.util.Scanner;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.EOFException;
import java.util.Arrays;

public class FlightList {
    Flight[] flightList = new Flight[1];
    int n;
    Scanner sc = new Scanner(System.in);

    public FlightList() {
    }

    public FlightList(Flight[] flightList, int n) {
        this.flightList = flightList;
        this.n = n;
    }

    public FlightList(FlightList fl) {
        flightList = fl.flightList;
        n = fl.n;
    }

    public Flight[] getFlightList() {
        return flightList;
    }

    public void setFlightList(Flight[] flightList) {
        this.flightList = flightList;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void input() {
        System.out.println("How many flight you want to have ?");
        n = sc.nextInt();
        flightList = new Flight[n];
        for (int i = 0; i < n; i++) {
            flightList[i] = new Flight();
            flightList[i].input();
        }
    }

    public void output() {
        for (int i = 0; i < flightList.length; i++) {
            System.out.println("Flight " + (i + 1) + ": ");
            flightList[i].output();
            System.out.println();
        }
    }

    public void writeFile() throws IOException {
        DataOutputStream outStream = new DataOutputStream(new FileOutputStream("flight.txt"));
        for (int i = 0; i < flightList.length; i++) {
            flightList[i].writeFile();
        }
        outStream.close();
    }

    public void readFile() {
        int i = 0;
        try {
            DataInputStream inputStream = new DataInputStream(new FileInputStream("flight.txt"));
            try {
                while (true) { // xin cap phat them
                    String flightId = inputStream.readUTF();
                    String routeId = inputStream.readUTF();
                    String flightRouteId = inputStream.readUTF();
                    String airplaneId = inputStream.readUTF();
                    int status = inputStream.readInt();
                    int numberOfTicket = inputStream.readInt();
                    int numberOfTicketLeft = inputStream.readInt();
                    String takeOffDay = inputStream.readUTF();
                    String landingDay = inputStream.readUTF();
                    flightList[i] = new Flight(flightId, routeId, flightRouteId, airplaneId, status, numberOfTicket,
                            numberOfTicketLeft, takeOffDay, landingDay);
                    flightList[i].output();
                    i++;
                } // while
            } catch (EOFException e) {
                System.out.println(e.getMessage());
            } // close the Stream
            finally {
                n = i;
                inputStream.close();
            }
        } catch (IOException e) {
        }
    }

    public void addFlight() {
        n = flightList.length;
        flightList = Arrays.copyOf(flightList, n + 1);
        flightList[n] = new Flight();
        flightList[n].input();
        n++;
    }

    public void addFlight(Flight f) {
        for (int i = 0; i < flightList.length; i++) {
            if (flightList[i].getFlightId().indexOf(f.getFlightId()) != -1) {
                n = flightList.length;
                flightList = Arrays.copyOf(flightList, n + 1);
                flightList[n] = new Flight(f);
                n++;
                return;
            }
        }
        return;
    }

    public void searchFlight() {
        String k;
        System.out.println("Enter Flight ID you want to find: ");
        k = sc.nextLine();
        System.out.println("Your result is: ");
        for (int i = 0; i < flightList.length; i++) {
            if (flightList[i].getFlightId().indexOf(k) != -1) {
                System.out.println("Your result: ");
                System.out.println("Flight " + (i + 1) + ": ");
                flightList[i].output();
            }
        }
    }

    public Flight searchFlightById(String flightId) {
        for (int i = 0; i < flightList.length; i++) {
            if (flightList[i].getFlightId().indexOf(flightId) != -1) {
                return flightList[i];
            }
        }
        return null;
    }

    public Flight[] searchFlightByStatus(int status) {
        Flight[] f = null;
        int count = 0;
        for (int i = 0; i < flightList.length; i++) {
            if (flightList[i].getStatus() == status) {
                f = new Flight[count + 1];
                f[count] = flightList[i];
                count++;
            }
        }
        return f;
    }

    public Flight[] searchFlightByTakeOffDay(String takeOffDay) {
        Flight[] f = null;
        int count = 0;
        for (int i = 0; i < flightList.length; i++) {
            if (flightList[i].getTakeOffDay().indexOf(takeOffDay) != -1) {
                f = new Flight[count + 1];
                f[count] = flightList[i];
                count++;
            }
        }
        return f;
    }

    public Flight[] searchFlightByLandingDay(String landingDay) {
        Flight[] f = null;
        int count = 0;
        for (int i = 0; i < flightList.length; i++) {
            if (flightList[i].getLandingDay().indexOf(landingDay) != -1) {
                f = new Flight[count + 1];
                f[count] = flightList[i];
                count++;
            }
        }
        return f;
    }

    public void removeFlight() {
        System.out.println("Which flight you want to remove?");
        String k;
        k = sc.nextLine();
        n = flightList.length;
        for (int i = 0; i < flightList.length; i++) {
            if (flightList[i].getFlightId().indexOf(k) != -1) {
                for (int j = i; j < flightList.length - 1; j++) {
                    flightList[j] = flightList[j + 1];
                }
            }
        }
        flightList = Arrays.copyOf(flightList, n - 1);
        n--;
    }

    public void removeFlightById(String flightId) {
        for (int i = 0; i < flightList.length; i++) {
            if (flightList[i].getFlightId().indexOf(flightId) != -1) {
                for (int j = i; j < flightList.length - 1; j++) {
                    flightList[j] = flightList[j + 1];
                }
            }
        }
        flightList = Arrays.copyOf(flightList, n - 1);
        n--;
    }

    public void removeFlight(Flight f) {
        for (int i = 0; i < flightList.length; i++) {
            if (flightList[i].getFlightId().indexOf(f.getFlightId()) != -1) {
                for (int j = i; j < flightList.length; j++) {
                    flightList[j] = flightList[j + 1];
                }
            }
        }
        flightList = Arrays.copyOf(flightList, n - 1);
        n--;
    }

    public void statisticFlightByStatus() {
        int count = 0;
        for (int i = 0; i < flightList.length; i++) {
            if (flightList[i].getStatus() == 1) {
                count++;
            }
        }
        System.out.println("Number of flight have status Ready: " + count);
        System.out.println("Number of flight have status Waiting: " + (flightList.length - count));
    }

}