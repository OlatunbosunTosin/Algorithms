import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NumberBaseConversionSystemTest {

    @Test
    public void Convert5fromBase10ToBase4(){
        int expected = numberBaseConversionSystem.convert(5,10,4);
        int actual = 11;
        assertEquals(actual,expected);
    }

    @Test
    public void Convert8fromBase10ToBase2(){
        int expected = numberBaseConversionSystem.convert(8,10,2);
        int actual = 1000;
        assertEquals(actual,expected);
    }

    @Test
    public void Convert45fromBase10ToBase2(){
        int expected = numberBaseConversionSystem.convert(45,10,2);
        int actual = 101101;
        assertEquals(actual,expected);
    }

    @Test
    public void Convert1101fromBase2ToBase5(){
        int expected = numberBaseConversionSystem.convert(1101,2,5);
        int actual = 23;
        assertEquals(actual,expected);
    }

    @Test
    public void Convert8fromBase9ToBase2(){
        int expected = numberBaseConversionSystem.convert(8,9,2);
        int actual = 1000;
        assertEquals(actual,expected);
    }

    @Test
    public void Convert347fromBase8ToBase10(){
        int expected = numberBaseConversionSystem.convert(347,8,10);
        int actual = 231;
        assertEquals(actual,expected);
    }


    @Test
    public void Convert9fromBase11ToBase2_ThrowException(){

        assertThrows(IllegalArgumentException.class, () -> numberBaseConversionSystem.convert(9,11,2));
    }

    @Test
    public void Convert9fromBase10ToBase1_ThrowException(){
        assertThrows(IllegalArgumentException.class, () -> numberBaseConversionSystem.convert(9,10,1));
    }

}
