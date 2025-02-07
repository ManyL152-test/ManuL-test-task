import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator mainClass = new Calculator();
        assertEquals(8, mainClass.add(5, 3));
        assertEquals(10, mainClass.add(7, 3));
        assertEquals(0, mainClass.add(0, 0));
    }
}
