import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 должно быть 5");
        assertEquals(-1, calculator.add(-2, 1), "-2 + 1 должно быть -1");
        assertEquals(0, calculator.add(0, 0), "0 + 0 должно быть 0");
    }

    @Test
    void dif() {
        assertEquals(1, calculator.dif(3, 2), "3 - 2 должно быть 1");
        assertEquals(-3, calculator.dif(2, 5), "2 - 5 должно быть -3");
        assertEquals(0, calculator.dif(0, 0), "0 - 0 должно быть 0");
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(6, 3), "6 / 3 должно быть 2");
        assertEquals(-2, calculator.div(-6, 3), "-6 / 3 должно быть -2");
        assertThrows(ArithmeticException.class, () -> calculator.div(1, 0), "Деление на ноль должно выбрасывать исключение");
    }

    @Test
    void times() {
        assertEquals(6, calculator.times(2, 3), "2 * 3 должно быть 6");
        assertEquals(0, calculator.times(0, 5), "0 * 5 должно быть 0");
        assertEquals(-6, calculator.times(-2, 3), "-2 * 3 должно быть -6");
    }

    @Test
    void solver() {
        assertEquals(28, calculator.solver(), "Решение должно быть 28");
    }

    @Test
    void divByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.div(1, 0), "Деление на ноль должно выбрасывать исключение");
    }
}