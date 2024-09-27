public class Car {
    private final String model;
    private final int year;
    private final String color;
    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }
    public void displayCarInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Manufacture Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("--------------------------");
    }

    // Main method to create Car objects and display their info
    public static void main(String[] args) {
        // Creating two Car objects
        Car car1 = new Car("Pagani", 2020, "Red");
        Car car2 = new Car("Aston Martini", 2018, "Blue");

        car1.displayCarInfo();
        car2.displayCarInfo();
    }
}
