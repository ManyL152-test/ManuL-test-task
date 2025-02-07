package org.example;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

class EvenNumberTest {

    @Test
    void testIsEven() {
        EvenNumberChecker checker = new EvenNumberChecker();
        assertTrue(checker.isEven(0));
        assertFalse(checker.isEven(1));
        assertTrue(checker.isEven(2));
        assertFalse(checker.isEven(3));
    }
}
