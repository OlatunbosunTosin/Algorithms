import java.math.BigInteger;
import java.util.Arrays;

public class HugeIntegers {

    private int[] numberArray = new int[40];

    public HugeIntegers(){
        Arrays.fill(numberArray,-1);
    }

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
        for(int index = 0; index < numberArray.length; index++){
            if(numberArray[index] != -1) numbers += numberArray[index];
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
        String firstNumber = this.toString();
        String secondNumber = hugeInteger.toString();
        BigInteger numberOne = new BigInteger(firstNumber);
        BigInteger numberTwo= new BigInteger(secondNumber);
        BigInteger sum = numberOne.add(numberTwo);
        this.parse(sum.toString());
    }

    public void subtract(HugeIntegers hugeInteger) {
        String firstNumber = this.toString();
        String secondNumber = hugeInteger.toString();
        BigInteger numberOne = new BigInteger(firstNumber);
        BigInteger numberTwo= new BigInteger(secondNumber);
        BigInteger difference = numberOne.subtract(numberTwo);
        this.parse(difference.toString());
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
