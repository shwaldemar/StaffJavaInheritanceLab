import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class TestDeveloper {
    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Darth Vader", "NYDARKSIDE", 80000);
    }

    @Test
    public void hasName() {
        assertEquals("Darth Vader", developer.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("NYDARKSIDE", developer.getNinumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(80000, developer.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        this.developer.raiseSalary(10000);
        assertEquals(90000, developer.getSalary());
    }

    @Test
    public void canPayBonus() {
        this.developer.payBonus();
        assertEquals(800, developer.payBonus(),0.01);
    }

}
