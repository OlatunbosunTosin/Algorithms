public class MaximumConsecutiveLength {
    public static int findMax(int[] numbers) {

        int count = 0;
        int highest = 0;
        while(count < numbers.length) {
            int counter = 1;
            int index = count;
            for (;index < numbers.length-1; index++) {
                if(numbers[index+1] == numbers[index]+1) counter+=1;
                else{
                    break;
                }
            }
            if(counter > highest) highest = counter;
            count++;
        }
        return highest;
    }


}
