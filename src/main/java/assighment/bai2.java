package assighment;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        String str = "hello";
        printEachLetterTwice(str);
    }

    /**
     * This method prompts the user to enter a string via the console.
     * It handles possible exceptions that might occur during the input process.
     *
     * @return the string input by the user, or null if an exception occurs
     */
    public static String inputString() {
        String s = null;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the string: ");
            s = sc.nextLine();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        return s;
    }


    /**
     * This method takes a string as input and prints each character of the string twice.
     * It handles possible exceptions that might occur during the process.
     *
     * @param inputString the input string to process
     */
    public static void printEachLetterTwice(String inputString) {
        String temp = "";
        for (int i = 0; i < inputString.length(); i++) {
            try {
                temp = temp + inputString.charAt(i) + inputString.charAt(i);
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Output String : " + temp);
    }
}
