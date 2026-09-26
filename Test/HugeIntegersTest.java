import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HugeIntegersTest {

    HugeIntegers hugeIntegers = new HugeIntegers();
    @Test
    public void parseStringToArrayTest(){
        String digits = "1234567890123456789012345678901234567890";
        int[] expected = {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0};
        assertArrayEquals(expected, hugeIntegers.parse(digits));
    }

    @Test
    public void parseStringOfLength10ToArrayTest(){
        String digits = "1234567890";
        int[] expected = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8,9,0};
        assertArrayEquals(expected, hugeIntegers.parse(digits));
    }

    @Test
    public void convertArrayToStringTest(){
        String digits = "1234567890";
        hugeIntegers.parse(digits);
        String expected = "1234567890";
        assertEquals(expected, hugeIntegers.toString());
    }

    @Test
    public void SameStringReturnsTrueForIsEqualToMethodTest(){
        String digitOne = "1234567890";
        hugeIntegers.parse(digitOne);

        HugeIntegers hugeIntegersTwo = new HugeIntegers();
        String digitTwo = "1234567890";
        hugeIntegersTwo.parse(digitTwo);

        assertTrue(hugeIntegers.isEqualTo(hugeIntegersTwo));
    }

    @Test
    public void DifferentStringReturnsFalseForIsEqualToMethodTest(){
        String digitOne = "12345678903467";
        hugeIntegers.parse(digitOne);

        HugeIntegers hugeIntegersTwo = new HugeIntegers();
        String digitTwo = "1234567890";
        hugeIntegersTwo.parse(digitTwo);

        assertFalse(hugeIntegers.isEqualTo(hugeIntegersTwo));
    }


    @Test
    public void SameStringReturnsFalseForIsNotEqualToMethodTest(){
        String digitOne = "1234567890";
        hugeIntegers.parse(digitOne);

        HugeIntegers hugeIntegersTwo = new HugeIntegers();
        String digitTwo = "1234567890";
        hugeIntegersTwo.parse(digitTwo);

        assertFalse(hugeIntegers.isNotEqualTo(hugeIntegersTwo));
    }

    @Test
    public void DifferentStringReturnsTrueForIsNotEqualToMethodTest(){
        String digitOne = "12345678903467";
        hugeIntegers.parse(digitOne);

        HugeIntegers hugeIntegersTwo = new HugeIntegers();
        String digitTwo = "1234567890";
        hugeIntegersTwo.parse(digitTwo);

        assertTrue(hugeIntegers.isNotEqualTo(hugeIntegersTwo));
    }

    @Test
    public void addTwoHugeIntegersTest(){
        String digitOne = "1201200";
        hugeIntegers.parse(digitOne);

        HugeIntegers hugeIntegersTwo = new HugeIntegers();
        String digitTwo = "1201200";
        hugeIntegersTwo.parse(digitTwo);

        hugeIntegers.add(hugeIntegersTwo);
        int[] summedIntegers = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,4,0,2,4,0,0};
        assertArrayEquals(hugeIntegers.getNumberArray(), summedIntegers);
    }

    @Test
    public void addTwoHugeIntegersWithDifferentLengthTest(){
        String digitOne = "9900";
        hugeIntegers.parse(digitOne);

        HugeIntegers hugeIntegersTwo = new HugeIntegers();
        String digitTwo = "100";
        hugeIntegersTwo.parse(digitTwo);

        hugeIntegers.add(hugeIntegersTwo);
        int[] summedIntegers = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0};

        assertArrayEquals(hugeIntegers.getNumberArray(), summedIntegers);
    }

    @Test
    public void subtractTwoHugeIntegersTest(){
        String digitOne = "5000100983792020";
        hugeIntegers.parse(digitOne);

        HugeIntegers hugeIntegersTwo = new HugeIntegers();
        String digitTwo = "40002838289";
        hugeIntegersTwo.parse(digitTwo);

        hugeIntegers.subtract(hugeIntegersTwo);
        int[] subtractedIntegers = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,5,0,0,0,0,6,0,9,8,0,9,5,3,7,3,1};
        assertArrayEquals(hugeIntegers.getNumberArray(),subtractedIntegers);
    }

    @Test
    public void subtractTwoHugeIntegersWithFirstLessTHanSecondTest(){
        String digitOne = "40002838289";
        hugeIntegers.parse(digitOne);

        HugeIntegers hugeIntegersTwo = new HugeIntegers();
        String digitTwo = "5000100983792020";
        hugeIntegersTwo.parse(digitTwo);

        hugeIntegers.subtract(hugeIntegersTwo);
        int[] subtractedIntegers = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,5,0,0,0,0,6,0,9,8,0,9,5,3,7,3,1};

        assertArrayEquals(hugeIntegers.getNumberArray(),subtractedIntegers);
    }

    @Test
    public void firstHugeIntegerIsGreaterThanSecondInteger_returnTrueTest(){
        String digitOne = "9000000000000000";
        hugeIntegers.parse(digitOne);

        HugeIntegers hugeIntegersTwo = new HugeIntegers();
        String digitTwo = "7000000000000000";
        hugeIntegersTwo.parse(digitTwo);

        assertTrue(hugeIntegers.isGreaterThan(hugeIntegersTwo));
    }

    @Test
    public void firstHugeIntegerIsNotGreaterThanSecondIntegerTest(){
        String digitOne = "900000000000000";
        hugeIntegers.parse(digitOne);

        HugeIntegers hugeIntegersTwo = new HugeIntegers();
        String digitTwo = "7000000000000000";
        hugeIntegersTwo.parse(digitTwo);

        assertFalse(hugeIntegers.isGreaterThan(hugeIntegersTwo));
    }

    @Test
    public void firstHugeIntegerIsLessThanSecondIntegerTest(){
        String digitOne = "900000000000";
        hugeIntegers.parse(digitOne);

        HugeIntegers hugeIntegersTwo = new HugeIntegers();
        String digitTwo = "7000000000000000";
        hugeIntegersTwo.parse(digitTwo);

        assertTrue(hugeIntegers.isLessThan(hugeIntegersTwo));
    }

    @Test
    public void firstHugeIntegerIsNotLessThanSecondIntegerTest(){
        String digitOne = "90000000000000000";
        hugeIntegers.parse(digitOne);

        HugeIntegers hugeIntegersTwo = new HugeIntegers();
        String digitTwo = "7000000000000000";
        hugeIntegersTwo.parse(digitTwo);

        assertFalse(hugeIntegers.isLessThan(hugeIntegersTwo));
    }

    @Test
    public void firstHugeIntegerIsGreaterThanSecondIntegerUsingIsGreaterThanOrEqualToMethod_returnTrueTest(){
        String digitOne = "9000000000000000";
        hugeIntegers.parse(digitOne);

        HugeIntegers hugeIntegersTwo = new HugeIntegers();
        String digitTwo = "7000000000000000";
        hugeIntegersTwo.parse(digitTwo);

        assertTrue(hugeIntegers.isGreaterThanOrEqualTo(hugeIntegersTwo));
    }

    @Test
    public void firstHugeIntegerIsEqualToSecondIntegerUsingIsGreaterThanOrEqualToMethod_returnTrueTest(){
        String digitOne = "9000000000000000";
        hugeIntegers.parse(digitOne);

        HugeIntegers hugeIntegersTwo = new HugeIntegers();
        String digitTwo = "9000000000000000";
        hugeIntegersTwo.parse(digitTwo);

        assertTrue(hugeIntegers.isGreaterThanOrEqualTo(hugeIntegersTwo));
    }

    @Test
    public void firstHugeIntegerIsLessThanSecondIntegerUsingIsLessThanOrEqualToMethod_returnTrueTest(){
        String digitOne = "900000000000";
        hugeIntegers.parse(digitOne);

        HugeIntegers hugeIntegersTwo = new HugeIntegers();
        String digitTwo = "7000000000000000";
        hugeIntegersTwo.parse(digitTwo);

        assertTrue(hugeIntegers.isLessThanOrEqualTo(hugeIntegersTwo));
    }

    @Test
    public void firstHugeIntegerIsEqualToSecondIntegerUsingIsLessThanOrEqualToMethod_returnTrueTest(){
        String digitOne = "900000000000";
        hugeIntegers.parse(digitOne);

        HugeIntegers hugeIntegersTwo = new HugeIntegers();
        String digitTwo = "900000000000";
        hugeIntegersTwo.parse(digitTwo);

        assertTrue(hugeIntegers.isLessThanOrEqualTo(hugeIntegersTwo));
    }
}
