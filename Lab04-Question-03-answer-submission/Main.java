

public class Main {

    public static void main(String[] args) {

        // Object 1: Using constructor with ID and Name
        Driver d1 = new Driver(101, "Ameen");

        // Object 2: Using constructor with ID, Name and Base Salary
        Driver d2 = new Driver(102, "John", 50000);

        // Object 3: Using constructor with all four attributes
        Driver d3 = new Driver(103, "David", 60000, 5);

        // Display first driver
        System.out.println("Driver 1 Details");
        d1.displayDetails();

        // Display second driver
        System.out.println("Driver 2 Details");
        d2.displayDetails();

        // Display third driver
        System.out.println("Driver 3 Details");
        d3.displayDetails();

        // Demonstrate getters and setters
        System.out.println("Testing Getters and Setters");

        d3.setDriverID(104);
        d3.setPerformanceScore(4);

        System.out.println("Updated Driver ID: " + d3.getDriverID());
        System.out.println("Updated Performance Score: " + d3.getPerformanceScore());

        // Demonstrate method overloading
        System.out.println("\nTesting Method Overloading");

        System.out.println("Actual Score Bonus: " + d3.calculateBonus());

        System.out.println("Custom Score Bonus: " + d3.calculateBonus(5));

        System.out.println("Stored Performance Score: " + d3.getPerformanceScore());

        System.out.println("Total Salary: " + d3.calculateTotalSalary());
    }
}
