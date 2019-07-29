import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class TestDatabaseAdmin {
DatabaseAdmin databaseAdmin;

@Before
public void before() {
    databaseAdmin = new DatabaseAdmin("Alien", "NYEGGS", 80000);
}

    @Test
    public void hasName() {
        assertEquals("Alien", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("NYEGGS", databaseAdmin.getNinumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(80000, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        this.databaseAdmin.raiseSalary(10000);
        assertEquals(90000, databaseAdmin.getSalary());
    }

    @Test
    public void canPayBonus() {
        this.databaseAdmin.payBonus();
        assertEquals(800, databaseAdmin.payBonus(),0.01);
    }

}