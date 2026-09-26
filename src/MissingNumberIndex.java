import java.util.ArrayList;

public class MissingNumberIndex {
    public static int[] findMissingNumberIndex(int[] numbers) {
        ArrayList<Integer> newNumbers = new ArrayList<>();
        ArrayList<Integer> newArray = new ArrayList<>();

        for (int count = 0; count < numbers.length; count++) {
            newNumbers.add(numbers[count]);
        }

        for (int index = 0; index < newNumbers.size()-1; index++) {
            if(newNumbers.get(index+1) != newNumbers.get(index)+1) {
                newArray.add(newNumbers.get(index)+1);
                newArray.add(index+1);
                newNumbers.add(index+1, newNumbers.get(index)+1);
            }
        }

        int[] array = new int[newArray.size()];

        for (int count = 0; count < newArray.size(); count++) {
            array[count] = newArray.get(count);
        }
        return array;
    }
}
