import java.util.ArrayList;

public class InheritanceDemo {
	public static void main(String[] args) {
		// Create workers and salary workers
		Worker worker1 = new Worker("John", "Doe", "12345", "Mr.", 1990, 15.0);
		Worker worker2 = new Worker("Jane", "Doe", "54321", "Ms.", 1985, 17.0);
		Worker worker3 = new Worker("Bob", "Smith", "67890", "Dr.", 1988, 20.0);

		SalaryWorker salaryWorker1 = new SalaryWorker("Alice", "Johnson", "11111", "Prof.", 1980, 60000);
		SalaryWorker salaryWorker2 = new SalaryWorker("James", "Brown", "22222", "Dr.", 1975, 80000);
		SalaryWorker salaryWorker3 = new SalaryWorker("Sara", "Williams", "33333", "Ms.", 1992, 70000);

		// Create an ArrayList to store workers
		ArrayList<Worker> workers = new ArrayList<>();
		workers.add(worker1);
		workers.add(worker2);
		workers.add(worker3);
		workers.add(salaryWorker1);
		workers.add(salaryWorker2);
		workers.add(salaryWorker3);

		// Simulate three weekly pay periods
		for (int week = 1; week <= 3; week++) {
			System.out.println("Week " + week + " Payroll:");

			for (Worker worker : workers) {
				double hoursWorked = (week == 2) ? 50 : 40; // Week 2: 50 hours, other weeks: 40 hours
				System.out.println(worker.formalName() + ": $" + worker.calculateWeeklyPay(hoursWorked));
			}

			System.out.println();
		}
	}
}
