import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondHighestNumberTest {
    @Test
    public void secondHighestNumberIsReturnedTest(){
        int [] numbers = {2,7,6,8,1};
        int expected = 7;
        assertEquals(expected, SecondHighestNumber.findSecondHighest(numbers));
    }

    @Test
    public void secondHighestNumberIsReturnedTestTwo(){
        int [] numbers = {10,7,9,6,8};
        int expected = 9;
        assertEquals(expected, SecondHighestNumber.findSecondHighest(numbers));
    }

    @Test
    public void arrayWithTwoHighestOccurrence_secondHighestNumberIsReturnedTest(){
        int [] numbers = {10,7,6,8,9,10};
        int expected = 9;
        assertEquals(expected, SecondHighestNumber.findSecondHighest(numbers));
    }

    @Test
    public void arrayOfNegativeAndPositiveNumbers_secondHighestNumberIsReturnedTest(){
        int [] numbers = {10,7,6,8,-15,10,-11};
        int expected = 8;
        assertEquals(expected, SecondHighestNumber.findSecondHighest(numbers));
    }

    @Test
    public void arrayOfNegativeNumbers_secondHighestNumberIsReturnedTest(){
        int [] numbers = {-10,-7,-6,-8,-15,-10,-11};
        int expected = -7;
        assertEquals(expected, SecondHighestNumber.findSecondHighest(numbers));
    }
}
