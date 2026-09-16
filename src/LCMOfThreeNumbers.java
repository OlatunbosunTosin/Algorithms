public class LCMOfThreeNumbers {

    public static int findLCM(int numberOne, int numberTwo, int numberThree){
        int lcm = 1;
        int divisor = 2;
        while(numberOne != 1 || numberTwo != 1 || numberThree != 1) {
            if(numberOne % divisor == 0 || numberTwo % divisor == 0 || numberThree % divisor == 0) {
                if (numberOne % divisor == 0) numberOne = numberOne / divisor;
                if (numberTwo % divisor == 0) numberTwo = numberTwo / divisor;
                if (numberThree % divisor == 0) numberThree = numberThree / divisor;
                lcm *= divisor;
            }
            else divisor++;
        }
        return lcm;
    }


}
