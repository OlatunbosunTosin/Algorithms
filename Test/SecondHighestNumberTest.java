import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondHighestNumberTest {
    @Test
    public void secondHighestNUmberIsReturned(){
        int [] numbers = {2,7,6,8,1};
        int expected = 7;
        assertEquals(expected, SecondHighestNumber.findSecondHighest(numbers));
    }

    @Test
    public void secondHighestNumberIsReturnedTwo(){
        int [] numbers = {10,7,6,8,9};
        int expected = 9;
        assertEquals(expected, SecondHighestNumber.findSecondHighest(numbers));
    }
}
