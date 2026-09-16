import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareOfArrayTest {

    @Test
    public void arrayOfFourNumbersReturnsSquaredArrayTest(){
        int[] numbers = {3,8,6,2};
        int[] expected = {4,9,36,64};
        assertArrayEquals(expected, SquareOfArray.squareArray(numbers));
    }

    @Test
    public void arrayOfFiveNumbersReturnsSquaredArrayTest(){
        int[] numbers = {10,3,8,6,2};
        int[] expected = {4,9,36,64,100};
        assertArrayEquals(expected, SquareOfArray.squareArray(numbers));
    }

    @Test
    public void arrayOfFiveNumbersWith1100_ThrowsExceptionTestTest(){
        int[] numbers = {3,8,6,2,1100};
        assertThrows(IllegalArgumentException.class, () -> SquareOfArray.squareArray(numbers));
    }

    @Test
    public void arrayOfThreeNumbersWithNegative150_ThrowsExceptionTestTest(){
        int[] numbers = {3,-150,6};
        assertThrows(IllegalArgumentException.class, () -> SquareOfArray.squareArray(numbers));
    }

}
