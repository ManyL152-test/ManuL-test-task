import org.example.EvenNumberChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EvenNumberCheckerTest {

    private EvenNumberChecker evenNumberChecker;

    @BeforeEach
    void setUp() {
        evenNumberChecker = new EvenNumberChecker();
    }

    @Test
    void testIsEven_WhenNumberIsEven() {
        int evenNumber = 4;
        boolean expectedResult = true;
        boolean actualResult = evenNumberChecker.isEven(evenNumber);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void testIsEven_WhenNumberIsOdd() {
        int oddNumber = 5;
        boolean expectedResult = false;
        boolean actualResult = evenNumberChecker.isEven(oddNumber);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
