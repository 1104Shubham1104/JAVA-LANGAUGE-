class UniversityBuilding {
private String address;
private int numberOfFloors;
private double totalArea; // in square meters
public UniversityBuilding(String address, int numberOfFloors, double totalArea) {
    this.address = address;
    this.numberOfFloors = numberOfFloors;
    this.totalArea = totalArea;
}
public String getAddress() {
    return address;
}

public int getNumberOfFloors() {
    return numberOfFloors;
}

public double getTotalArea() {
    return totalArea;
}
public void displayBuildingDetails() {
    System.out.println("Address: " + address);
    System.out.println("Number of Floors: " + numberOfFloors);
    System.out.println("Total Area: " + totalArea + " sq.m.");
}
}
class ResidentialBuilding extends UniversityBuilding {
    private int numberOfApartments;
    private double rentPerApartment;
    public ResidentialBuilding(String address, int numberOfFloors, double totalArea, int numberOfApartments, double rentPerApartment) {
        super(address, numberOfFloors, totalArea);
        this.numberOfApartments = numberOfApartments;
        this.rentPerApartment = rentPerApartment;
    }
    public double calculateTotalRent() {
        return numberOfApartments * rentPerApartment;
    }
    @Override
    public void displayBuildingDetails() {
        super.displayBuildingDetails();
        System.out.println("Number of Apartments: " + numberOfApartments);
        System.out.println("Rent per Apartment: Rs." + rentPerApartment);
        System.out.println("Total Rent: Rs." + calculateTotalRent());
    }
}
class CommercialBuilding extends UniversityBuilding {
    private double officeSpaceArea; // in square meters
    private double rentPerSquareMeter; // per month
    public CommercialBuilding(String address, int numberOfFloors, double totalArea, double officeSpaceArea, double rentPerSquareMeter) {
        super(address, numberOfFloors, totalArea);
        this.officeSpaceArea = officeSpaceArea;
        this.rentPerSquareMeter = rentPerSquareMeter;
    }
    public double calculateTotalRent() {
        return officeSpaceArea * rentPerSquareMeter;
    }
    @Override
    public void displayBuildingDetails() {
        super.displayBuildingDetails();
        System.out.println("Office Space Area: " + officeSpaceArea + " sq.m.");
        System.out.println("Rent per Square Meter: $" + rentPerSquareMeter);
        System.out.println("Total Rent: $" + calculateTotalRent());
    }
}
public class Main {
    public static void main(String[] args) {
        ResidentialBuilding residentialBuilding = new ResidentialBuilding(
                "123 University Ave", 10, 5000.0, 50, 1200.0
        );
        residentialBuilding.displayBuildingDetails();
        System.out.println();
        CommercialBuilding commercialBuilding = new CommercialBuilding(
                "456 Business St", 15, 10000.0, 6000.0, 50.0
        );
        commercialBuilding.displayBuildingDetails();
    }
}
