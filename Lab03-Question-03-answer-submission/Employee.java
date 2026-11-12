
public class Employee {

    private String employeeName;
    private double basicSalary;
    private int performanceRating;

    // Constructor
    public Employee(String employeeName, double basicSalary, int performanceRating) {
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;

        if (performanceRating >= 1 && performanceRating <= 5) {
            this.performanceRating = performanceRating;
        } else {
            this.performanceRating = 1;
            System.out.println("Invalid rating! Default rating set to 1.");
        }
    }

    // Calculate bonus
    public double calculateBonus() {
        double bonusPercentage = 0;

        switch (performanceRating) {
            case 5:
                bonusPercentage = 20;
                break;
            case 4:
                bonusPercentage = 15;
                break;
            case 3:
                bonusPercentage = 10;
                break;
            case 2:
                bonusPercentage = 5;
                break;
            case 1:
                bonusPercentage = 0;
                break;
        }

        return basicSalary * bonusPercentage / 100;
    }

    // Calculate total salary
    public double calculateTotalSalary() {
        return basicSalary + calculateBonus();
    }

    // Display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Performance Rating: " + performanceRating);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}

