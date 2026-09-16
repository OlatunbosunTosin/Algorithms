public class SecondHighestNumber {
    public static int findSecondHighest(int[] numbers) {
        int highest = numbers[0];
        int secondHighest = numbers[0];
        int a = 0;
        for(int index = 0; index < numbers.length; index++){
            if(numbers[index] > highest)
                highest = numbers[index];
            if(secondHighest < highest && secondHighest > numbers[index])
                a = secondHighest;
        }
        return a;
    }
//            for(int index = 0; index < numbers.length; index++){
//        if(numbers[index] > highest) {
//            secondHighest = highest;
//            highest = numbers[index];
//        }
//        else if(numbers[index] > secondHighest)
//            secondHighest = numbers[index];
//
//    }
//        return secondHighest;
}
