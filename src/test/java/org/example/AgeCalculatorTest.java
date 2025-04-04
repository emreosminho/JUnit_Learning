package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgeCalculatorTest {
    AgeCalculator ageCal = new AgeCalculator();

    @Test
    void testAgeResult(){
        int expected = 32;
        int actual = ageCal.AgeCal(1993);
        assertEquals(expected, actual);
    }
}
