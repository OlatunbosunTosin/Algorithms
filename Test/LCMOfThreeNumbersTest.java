import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LCMOfThreeNumbersTest {

    @Test
    public void findLCMOfThreeNumbersTest(){
        int expected = LCMOfThreeNumbers.findLCM(2,8,12);
        int actual = 24;
        assertEquals(actual,expected);
    }

    @Test
    public void findLCMOfThreeNumbersTestTwo(){
        int expected = LCMOfThreeNumbers.findLCM(7,6,5);
        int actual = 210;
        assertEquals(actual,expected);
    }
}
