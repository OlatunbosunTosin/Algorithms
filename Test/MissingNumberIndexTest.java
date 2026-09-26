import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingNumberIndexTest {

    @Test
    public void returnMissingNumberAndIndex(){
        int[] numbers = {1,2,4,5,6};
        int[] expected = {3,2};
        assertArrayEquals(expected, MissingNumberIndex.findMissingNumberIndex(numbers));
    }

    @Test
    public void returnMissingNumberAndIndexTwo(){
        int[] numbers = {4,5,6,8,10};
        int[] expected = {7,3,9,5};
        assertArrayEquals(expected, MissingNumberIndex.findMissingNumberIndex(numbers));
    }

    @Test
    public void returnMissingNumberAndIndexThree(){
        int[] numbers = {1,2,4,5,6,8,10};
        int[] expected = {3,2,7,6,9,8};
        assertArrayEquals(expected, MissingNumberIndex.findMissingNumberIndex(numbers));
    }

    @Test
    public void returnMissingNumberAndIndexFour(){
        int[] numbers = {1,2,5,6,8,10};
        int[] expected = {3,2,4,3,7,6,9,8};
        assertArrayEquals(expected, MissingNumberIndex.findMissingNumberIndex(numbers));
    }
}
