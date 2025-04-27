import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calc = new Calculator();
    @Test
    void add() {
        assertEquals(5, calc.add(2,3));
        assertEquals(-4, calc.add(-1,-3));
    }

    @Test
    void dif() {
        assertEquals(5, calc.dif(10,5));
        assertEquals(-4, calc.dif(-1,3));
    }

    @Test
    void div() throws Exception {
        assertEquals(5, calc.div(10,2));
        assertEquals(-5, calc.div(10,-2));
        assertThrows(Exception.class, () -> calc.div(1, 0), "Can not divide zero");
    }

    @Test
    void times() {
        assertEquals(6, calc.times(2,3));
        assertEquals(-25, calc.times(-5,5));
    }

    @Test
    void solver() throws Exception {
        assertEquals(28, calc.solver());
    }
}