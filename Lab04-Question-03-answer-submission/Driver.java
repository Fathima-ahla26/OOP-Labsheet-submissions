
public class Driver {

    // Attributes
    private int driverID;
    private String driverName;
    private double baseSalary;
    private int performanceScore;

    // Constructor 1: driverID and driverName
    public Driver(int driverID, String driverName) {
        this.driverID = driverID;
        this.driverName = driverName;
        this.baseSalary = 0;
        this.performanceScore = 1;
    }

    // Constructor 2: driverID, driverName and baseSalary
    public Driver(int driverID, String driverName, double baseSalary) {
        this.driverID = driverID;
        this.driverName = driverName;
        this.baseSalary = baseSalary;
        this.performanceScore = 1;
    }

    // Constructor 3: All four attributes
    public Driver(int driverID, String driverName, double baseSalary, int performanceScore) {
        this.driverID = driverID;
        this.driverName = driverName;
        this.baseSalary = baseSalary;
        setPerformanceScore(performanceScore);
    }

    // Getter for driverID
    public int getDriverID() {
        return driverID;
    }

    // Setter for driverID
    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    // Getter for performanceScore
    public int getPerformanceScore() {
        return performanceScore;
    }

    // Setter for performanceScore with validation
    public void setPerformanceScore(int performanceScore) {
        if (performanceScore >= 1 && performanceScore <= 5) {
            this.performanceScore = performanceScore;
        } else {
            this.performanceScore = 1;
        }
    }

    // Calculate bonus using actual performance score
    public double calculateBonus() {
        return calculateBonus(performanceScore);
    }

    // Calculate bonus using a custom performance score
    public double calculateBonus(int score) {

        double bonusPercentage = 0;

        switch (score) {
            case 1:
                bonusPercentage = 0;
                break;
            case 2:
                bonusPercentage = 10;
                break;
            case 3:
                bonusPercentage = 15;
                break;
            case 4:
                bonusPercentage = 20;
                break;
            case 5:
                bonusPercentage = 25;
                break;
            default:
                bonusPercentage = 0;
        }

        return baseSalary * bonusPercentage / 100;
    }

    // Calculate total salary
    public double calculateTotalSalary() {
        return baseSalary + calculateBonus();
    }

    // Display driver details
    public void displayDetails() {
        System.out.println("Driver ID: " + driverID);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Performance Score: " + performanceScore);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + calculateTotalSalary());
        System.out.println("--------------------------------");
    }
}

