import org.junit.Test;
import static org.junit.Assert.*;

public class WorkerTest {

    @Test
    public void testCalculateWeeklyPay() {
        Worker worker = new Worker("John", "Doe", "12345", "Mr.", 1990, 15.0);
        assertEquals(600.0, worker.calculateWeeklyPay(40), 0.01);
        assertEquals(725.0, worker.calculateWeeklyPay(50), 0.01);
    }

    @Test
    public void testDisplayWeeklyPay() {
        Worker worker = new Worker("John", "Doe", "12345", "Mr.", 1990, 15.0);
        String expected = "Regular Pay: $600.00\nOvertime Pay: $225.00\nTotal Pay: $825.00";
        assertEquals(expected, worker.displayWeeklyPay(50));
    }
}
