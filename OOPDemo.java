// Abstraction using abstract class
abstract class Vehicle {
    protected String brand;
    protected int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Abstract method
    public abstract void start();

    // Concrete method
    public void showDetails() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

// Inheritance: Car inherits Vehicle
class Car extends Vehicle {
    private String fuelType;

    public Car(String brand, int year, String fuelType) {
        super(brand, year);  // Calling parent constructor
        this.fuelType = fuelType;
    }

    // Runtime Polymorphism: Method overriding
    @Override
    public void start() {
        System.out.println(brand + " car is starting with " + fuelType + " engine.");
    }

    public String getFuelType() {
        return fuelType;
    }
}

// Encapsulation: Rental class hides data using private fields and public getters/setters
class Rental {
    private String customerName;
    private int rentalDays;

    public Rental(String customerName, int rentalDays) {
        this.customerName = customerName;
        this.rentalDays = rentalDays;
    }

    // Getters and Setters
    public String getCustomerName() {
        return customerName;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void printRentalInfo() {
        System.out.println("Customer: " + customerName + ", Days: " + rentalDays);
    }
}

// Compile-time Polymorphism: Method Overloading
class Payment {
    public void calculateBill(int days, int rate) {
        System.out.println("Total bill: Rs." + (days * rate));
    }

    public void calculateBill(int days, int rate, int discount) {
        int bill = days * rate - discount;
        System.out.println("Total bill after discount: Rs." + bill);
    }
}

// Main class to demonstrate all concepts
public class OOPDemo {
    public static void main(String[] args) {
        // Abstraction + Inheritance + Runtime Polymorphism
        Vehicle car = new Car("Toyota", 2022, "Petrol");
        car.start();  // Overridden method
        car.showDetails();

        // Encapsulation
        Rental rental = new Rental("Poorvi", 5);
        rental.printRentalInfo();

        // Modifying encapsulated data
        rental.setRentalDays(7);
        System.out.println("Updated rental days: " + rental.getRentalDays());

        // Compile-time Polymorphism
        Payment pay = new Payment();
        pay.calculateBill(7, 1000);           // Overloaded method 1
        pay.calculateBill(7, 1000, 500);      // Overloaded method 2
    }
}