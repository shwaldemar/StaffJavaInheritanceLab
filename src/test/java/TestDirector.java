import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class TestDirector {
    Director director;

    @Before
    public void before() {
        director = new Director(
                "Voldemort",
                "NYSHALLNOTBENAMED",
                200000,
                "Muggle Destruction",
                1000000);
    }

    @Test
    public void hasName() {
        assertEquals("Voldemort", director.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("NYSHALLNOTBENAMED", director.getNinumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(200000, director.getSalary());
    }

    @Test
    public void hasBudget() {
        assertEquals(1000000, director.getBudget(), 0.01);
    }

    @Test
    public void canGetRaise() {
        director.raiseSalary(100000);
        assertEquals(300000, director.getSalary());
    }

    @Test
    public void cannotAddNegativeRaise() {
        director.raiseSalary(-100000);
        assertEquals(200000, director.getSalary());
    }

    @Test
    public void canChangeName() {
        director.setName("Simon");
        assertEquals("Simon", director.getName());
    }

    @Test
    public void cantChangeNameToNull() {
        director.setName(null);
        assertEquals("Voldemort", director.getName());
    }

    @Test
    public void bonusIsTwoPercentNotOne() {
        assertEquals(4000, director.payBonus(),0.01);
    }
}
