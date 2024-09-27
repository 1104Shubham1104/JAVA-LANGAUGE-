// Define the Pen class
class Pen {
    String color;
    int quantity;

    // Default constructor
    Pen() {
        this.color = "Unknown"; // Assign default values
        this.quantity = 0;
    }

    // Parameterized constructor
    Pen(String color, int quantity) {
        this.color = color;
        this.quantity = quantity;
    }

    // Copy constructor
    Pen(Pen p2) {
        this.color = p2.color; // Copy values from the provided Pen object
        this.quantity = p2.quantity;
    }

    // Method to print pen details
    public void getInfo() {
        System.out.println("Color: " + this.color);
        System.out.println("Quantity: " + this.quantity);
    }
}

// Main class to test the Pen class
public class Main {
    public static void main(String[] args) {
        // Create a Pen object using the default constructor
        Pen p1 = new Pen();
        p1.color = "BLACK";
        p1.quantity = 10;

        // Print details of p1
        System.out.println("Pen p1 details:");
        p1.getInfo();

        // Create a Pen object using the parameterized constructor
        Pen p2 = new Pen("RED", 20);
        System.out.println("Pen p2 details:");
        p2.getInfo();

        // Create a Pen object using the copy constructor
        Pen p3 = new Pen(p2);
        System.out.println("Pen p3 (copy of p2) details:");
        p3.getInfo();
    }
}

