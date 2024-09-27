import java.util.ArrayList;
class Customer {
    private String name;
    private String email;
    private ArrayList<Double> purchaseHistory;
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new ArrayList<>();
    }
    public void addPurchase(double amount) {
        if (amount > 0) {
            purchaseHistory.add(amount);
            System.out.println("Purchase added: $" + amount);
        } else {
            System.out.println("Invalid purchase amount.");
        }
    }
    public double calculateTotalExpenditure() {
        double total = 0;
        for (double purchase : purchaseHistory) {
            total += purchase;
        }
        return total;
    }
    public void printCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Total Expenditure: $" + calculateTotalExpenditure());
    }
}
class LoyalCustomer extends Customer {
    private double discountRate;
    public LoyalCustomer(String name, String email, double discountRate) {
        super(name, email);
        this.discountRate = discountRate;
    }
    public void addPurchaseWithDiscount(double amount) {
        double discountedAmount = amount * (1 - discountRate / 100);
        addPurchase(discountedAmount);
        System.out.println("Discounted purchase added: $" + discountedAmount);
    }
    @Override
    public void printCustomerDetails() {
        super.printCustomerDetails();
        System.out.println("Discount Rate: " + discountRate + "%");
    }
}
public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Alice Brown", "alice.brown@example.com");
        customer1.addPurchase(100.00);
        customer1.addPurchase(50.00);
        customer1.printCustomerDetails();
        LoyalCustomer loyalCustomer = new LoyalCustomer("Bob Smith", "bob.smith@example.com", 10);
        loyalCustomer.addPurchase(100.00);
        loyalCustomer.addPurchaseWithDiscount(200.00);
        loyalCustomer.printCustomerDetails();
    }
}