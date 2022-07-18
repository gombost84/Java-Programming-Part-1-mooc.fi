
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smol = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smol) {
                smol = array[i];
            }
        }

        return smol;
    }

    public static int indexOfSmallest(int[] array) {

        int smol = array[0];
        int smolIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= smol) {
                smol = array[i];
                smolIndex = i;
            }
        }

        return smolIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {

        int smol = table[startIndex];
        int smolIndex = startIndex;

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] <= smol) {
                smol = table[i];
                smolIndex = i;
            }
        }

        return smolIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int tempNum = array[index1];

        array[index1] = array[index2];
        array[index2] = tempNum;
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int index = indexOfSmallestFrom(array, i);
            swap(array, i, index);
        }

    }
}
