class Student {
private String name;
private int age;
private String regno;
private double cgpa;
private String address;
public Student(String name, int age, String regno, double cgpa, String address) {
    this.name = name;
    this.age = age;
    this.regno = regno;
    this.cgpa = cgpa;
    this.address = address;
}
public void printDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Regno: " + regno);
    System.out.println("CGPA: " + cgpa);
    System.out.println("Address: " + address);
    System.out.println();
}
}
public class Main {
    public static void main(String[] args) {
        // Create two instances of the Student class
        Student student1 = new Student("Akshat", 20, "12345", 3.8, "123 Elm St, Springfield");
        Student student2 = new Student("Harry", 22, "67890", 3.5, "Montecito California");
        student1.printDetails();
        student2.printDetails();
    }
}
