public class SquareOfArray {
    public static int[] squareArray(int[] numbers) {
        int[] squaredArray = new int[numbers.length];
        checkNumberConstraint(numbers);
        for (int index = 0; index < numbers.length; index++){
            squaredArray[index] = numbers[index] * numbers[index];
        }
        sortArray(squaredArray);
        return squaredArray;
    }

    private static void checkNumberConstraint(int[] numbers){
        for (int index = 0; index < numbers.length; index++){
            if(numbers[index] < -100 || numbers[index] > 1000) throw new IllegalArgumentException("number out of range");
        }
    }

    private static int[] sortArray(int[] numbers) {
        for (int index = 0; index < numbers.length-1; index++){
            for (int indexes = index+1; indexes < numbers.length; indexes++){
                if(numbers[index] > numbers[indexes]){
                    int temp = numbers[index];
                    numbers[index] = numbers[indexes];
                    numbers[indexes] = temp;
                }
            }
        }
        return numbers;
    }
}
