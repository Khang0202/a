package assighment;

import java.util.HashMap;
import java.util.HashSet;

public class bai1 {
    public static void main(String[] args) {
        int[] array = {5, 1, 8, 4, 9, 1, 5, 7, 7, 7, 7};
        System.out.println("Sum of distinct elements: " + sumOfDistinctElements(array));
    }

    /**
     * This method calculates the sum of distinct elements in the given array.
     * If an element appears more than once, it is only added to the sum the first time.
     *
     * @param array the array of integers to process
     * @return the sum of distinct elements in the array
     */
    public static int sumOfDistinctElements(int[] array) {
        HashSet<Integer> set = new HashSet<Integer>();
        int sum = 0;
        // Iterate through each element in the array
        for (int i = 0; i < array.length; i++) {
            if (set.add(array[i])) {
                sum += array[i];
            }
        }
        return sum;
    }


}
