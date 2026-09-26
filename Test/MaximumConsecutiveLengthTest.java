import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumConsecutiveLengthTest {

    @Test
    public void returnMax(){
        int[] numbers = {1,2,5,6,7,8,9};
        int expected = 5;
        assertEquals(expected, MaximumConsecutiveLength.findMax(numbers));
    }

    @Test
    public void returnMaxTwo(){
        int[] numbers = {5,6,1,2,3,4};
        int expected = 4;
        assertEquals(expected, MaximumConsecutiveLength.findMax(numbers));
    }

    @Test
    public void returnMaximumConsecutiveLengthTwo(){
        int[] numbers = {5,6,1,2,3,4,10,7};
        int expected = 4;
        assertEquals(expected, MaximumConsecutiveLength.findMax(numbers));
    }

    @Test
    public void returnMaximumConsecutiveLengthThree(){
        int[] numbers = {2,2,3,5,6,7,8};
        int expected = 4;
        assertEquals(expected, MaximumConsecutiveLength.findMax(numbers));
    }
}
