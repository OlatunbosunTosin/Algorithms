public class ArrayRotation {
    public static int [] rotateArray(int[] numbers, int shift) {
        int[] newArray = new int[numbers.length];
        int count = 0;
        for(int index = 0; index < numbers.length; index++){
            if(shift < numbers.length) newArray[index] = numbers[shift++];
            else{
                newArray[index] = numbers[count++];
            }
        }
        return newArray;
    }
}
