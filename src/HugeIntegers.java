import java.math.BigInteger;
import java.util.Arrays;

public class HugeIntegers {

    private int[] numberArray = new int[40];

    public int[] getNumberArray() {
        return numberArray;
    }

    public int[] parse(String digits) {
        int startIndex = 40 - digits.length();

        for(int index = 0; index < digits.length(); index++){
            char number = digits.charAt(index);
            numberArray[startIndex++] = Character.getNumericValue(number);
        }
        return numberArray;
    }

    public String toString(){
        String numbers = "";
        int start = 0;
        for(int index = 0; index < numberArray.length; index++){
            if(numberArray[index] != 0) {
                start = index;
                break;
            }
        }
        for(int indexes = start; indexes < numberArray.length; indexes++){
            numbers += numberArray[indexes];
        }

        return numbers;
    }

    public boolean isEqualTo(HugeIntegers hugeIntegers) {
        for(int index = 0; index < numberArray.length; index++){
            if(numberArray[index] != hugeIntegers.numberArray[index]) return false;
        }
        return true;
    }

    public boolean isNotEqualTo(HugeIntegers hugeIntegers) {
        for(int index = 0; index < numberArray.length; index++){
            if(numberArray[index] != hugeIntegers.numberArray[index]) return true;
        }
        return false;
    }

    public void add(HugeIntegers hugeInteger){
        int firstArrayLength = this.toString().length();
        int secondArrayLength = hugeInteger.toString().length();
        int loopLength = 0;

        if(firstArrayLength > secondArrayLength) loopLength = firstArrayLength;
        else loopLength = secondArrayLength;

        int stopIndex = 40 - loopLength;
        int carryOver = 0;
        int index = 39;
        for(; index >= stopIndex; index--){
            int sum = numberArray[index] + hugeInteger.numberArray[index] + carryOver;
            carryOver = sum/10;
            int remainder = sum % 10;
            numberArray[index] = remainder;
        }
        numberArray[index] = carryOver;
    }

    public void subtract(HugeIntegers hugeInteger) {
        int firstArrayLength = this.toString().length();
        int secondArrayLength = hugeInteger.toString().length();
        int loopLength = 0;

        if(firstArrayLength > secondArrayLength) loopLength = firstArrayLength;
        else loopLength = secondArrayLength;

        int stopIndex = 40 - loopLength;
        int carryOver = 0;
        int index = 39;
        for(; index >= stopIndex; index--){
            int sum = numberArray[index] + hugeInteger.numberArray[index] + carryOver;
            carryOver = sum/10;
            int remainder = sum % 10;
            numberArray[index] = remainder;
        }
        numberArray[index] = carryOver;
    }

    public boolean isGreaterThan(HugeIntegers hugeInteger) {
        String firstNumber = this.toString();
        String secondNumber = hugeInteger.toString();
        BigInteger numberOne = new BigInteger(firstNumber);
        BigInteger numberTwo= new BigInteger(secondNumber);
        return numberOne.compareTo(numberTwo) > 0;
    }


    public boolean isLessThan(HugeIntegers hugeInteger) {
        String firstNumber = this.toString();
        String secondNumber = hugeInteger.toString();
        BigInteger numberOne = new BigInteger(firstNumber);
        BigInteger numberTwo= new BigInteger(secondNumber);
        return numberOne.compareTo(numberTwo) < 0;
    }

    public boolean isGreaterThanOrEqualTo(HugeIntegers hugeInteger) {
        return isGreaterThan(hugeInteger) || isEqualTo(hugeInteger);
    }

    public boolean isLessThanOrEqualTo(HugeIntegers hugeInteger) {
        return isLessThan(hugeInteger) || isEqualTo(hugeInteger);
    }
}
