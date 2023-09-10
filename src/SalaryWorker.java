public class SalaryWorker extends Worker {
	// Fields
	double annualSalary;

	// Constructor
	public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB, double annualSalary) {
		super(firstName, lastName, ID, title, YOB, 0);
		this.annualSalary = annualSalary;
	}

	// Override calculateWeeklyPay
	@Override
	public double calculateWeeklyPay(double hoursWorked) {
		return annualSalary / 52.0;
	}

	// Override displayWeeklyPay
	@Override
	public String displayWeeklyPay(double hoursWorked) {
		return String.format("Weekly Pay (as a fraction of yearly salary): $%.2f", calculateWeeklyPay(hoursWorked));
	}
}
