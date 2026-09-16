import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayRotationTest {

    @Test
    public void rotateArrayTwiceToTheLeftTest(){
        int[] numbers = {2,3,4,5,6};
        int[] expected = {4,5,6,2,3};
        assertArrayEquals(expected, ArrayRotation.rotateArray(numbers, 2));
    }

    @Test
    public void rotateArrayThriceToTheLeftTest(){
        int[] numbers = {2,3,4,10,5,6};
        int[] expected = {10,5,6,2,3,4};
        assertArrayEquals(expected, ArrayRotation.rotateArray(numbers, 3));
    }

    @Test
    public void rotateArrayFiveTimesToTheLeftTest(){
        int[] numbers = {2,3,4,10,5,6};
        int[] expected = {6,2,3,4,10,5};
        assertArrayEquals(expected, ArrayRotation.rotateArray(numbers, 5));
    }
}
