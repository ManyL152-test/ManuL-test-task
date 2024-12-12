import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.example.Main.Sum;

class MainTest {
    @Test
    void testMain() {
        int result = Sum(2, 3);
        Assertions.assertEquals(5, result);
    }
}