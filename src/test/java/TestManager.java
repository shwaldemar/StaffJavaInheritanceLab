import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class TestManager {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Vlad The Impailer", "NY666KILLS", 100000, "IMPAILING");
    }

    @Test
    public void hasName() {
        assertEquals("Vlad The Impailer", manager.getName());
    }

    @Test
    public void hasDeptName() {
        assertEquals("IMPAILING", manager.getDeptName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("NY666KILLS", manager.getNinumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(100000, manager.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        this.manager.raiseSalary(10000);
        assertEquals(110000, manager.getSalary());
    }

    @Test
    public void canPayBonus() {
        this.manager.payBonus();
        assertEquals(1000, manager.payBonus(),0.01);
    }

}



