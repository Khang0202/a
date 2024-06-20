package assighment;

public class bai3 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Number of even elements: " + numberOfEvenElements(array));
        System.out.println("Number of odd elements: " + numberOfOddElements(array));
    }

    /**
     * This method counts the number of even elements in the given array.
     *
     * @param array the array of integers to process
     * @return the count of even elements in the array
     */
    public static int numberOfEvenElements(int[] array) {
        int count = 0;
        // Iterate through each element in the array
        for (int i = 0; i < array.length; i++) {
            // Check if the element is even
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * This method counts the number of odd elements in the given array.
     *
     * @param array the array of integers to process
     * @return the count of odd elements in the array
     */
    public static int numberOfOddElements(int[] array) {
        int count = 0;
        // Iterate through each element in the array
        for (int i = 0; i < array.length; i++) {
            // Check if the element is odd
            if (array[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

}
