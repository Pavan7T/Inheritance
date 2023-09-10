import org.junit.Test;
import static org.junit.Assert.*;

public class SalaryWorkerTest {

    @Test
    public void testCalculateWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("Jane", "Doe", "54321", "Ms.", 1985, 60000);
        assertEquals(1153.85, salaryWorker.calculateWeeklyPay(0), 0.01);
    }

    @Test
    public void testDisplayWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("Jane", "Doe", "54321", "Ms.", 1985, 60000);
        String expected = "Weekly Pay (as a fraction of yearly salary): $1153.85";
        assertEquals(expected, salaryWorker.displayWeeklyPay(0));
    }
}
