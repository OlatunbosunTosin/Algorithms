public class SecondHighestNumber {
    public static int findSecondHighest(int[] numbers) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for(int index = 0; index < numbers.length; index++){
            if(numbers[index] > highest) {
                secondHighest = highest;
                highest = numbers[index];
            }
            else if(numbers[index] > secondHighest && numbers[index] < highest)
                secondHighest = numbers[index];
            }
        return secondHighest;
    }

}
