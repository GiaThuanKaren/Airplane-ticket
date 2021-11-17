import java.util.Scanner;

public class Plane { // MAY BAY
    // Attribute
    private String planeId; // ma may bay
    private String type; // loai may bay
    private String description; // mo ta cua may bay

    public Plane() {
    }

    public Plane(String planeId, String type, String description) {
        this.planeId = planeId;
        this.type = type;
        this.description = description;
    }

    public Plane(Plane p) {
        planeId = p.planeId;
        type = p.type;
        description = p.description;
    }

    public String getPlaneId() {
        return planeId;
    }

    public void setPlaneId(String planeId) {
        this.planeId = planeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Plane ID: ");
        planeId = sc.nextLine();
        System.out.println("Enter Type: ");
        type = sc.nextLine();
        System.out.println("Enter Description: ");
        description = sc.nextLine();
    }

    public void output() {
        System.out.println("Plane information: ");
        System.out.println("Plane ID: " + planeId);
        System.out.println("Plane Type: " + type);
        System.out.println("Plane Description: " + description);
    }
}
