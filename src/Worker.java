public class Worker extends Person {
    // Fields
    double hourlyPayRate;

    // Constructor
    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
        this.hourlyPayRate = hourlyPayRate;
    }

    // Methods
    public double calculateWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            return hoursWorked * hourlyPayRate;
        } else {
            return 40 * hourlyPayRate + (hoursWorked - 40) * 1.5 * hourlyPayRate;
        }
    }

    public String displayWeeklyPay(double hoursWorked) {
        double regularPay = Math.min(40, hoursWorked) * hourlyPayRate;
        double overtimePay = Math.max(0, hoursWorked - 40) * 1.5 * hourlyPayRate;

        return String.format("Regular Pay: $%.2f\nOvertime Pay: $%.2f\nTotal Pay: $%.2f",
                regularPay, overtimePay, regularPay + overtimePay);
    }
}
