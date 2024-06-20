package day20month06year2024;

import java.util.HashSet;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The given string is: ");
        String input = sc.nextLine();

        input="abbbbbbbbccccc";

        getFirstCharRepeatWithSetAndFor(input);
        getFisrtCharRepeatWith2For(input);
    }
    public static void getFirstCharRepeatWithSetAndFor(String givenString){
        HashSet<Character> stringNotRepeated = new HashSet<>();
        for (int i = 0; i < givenString.length(); i++) {
            if(!stringNotRepeated.add(givenString.charAt(i))){
                System.out.println("The first non repeated character in string is: " + givenString.charAt(i) );
                break;
            }
        }
    }

    public static void getFisrtCharRepeatWith2For (String givenString){
        int counter = 0;
        char fchar;
        for (int i = 0; i < givenString.length(); i++) {
            for (int j = i+1; j < givenString.length(); j++) {
                if (givenString.charAt(i) == givenString.charAt(j)) {
                    counter++;
                }
                if(counter == 1){
                    fchar = givenString.charAt(i);
                    System.out.println("The first non repeated character in string is: " + fchar);
                    break;
                }
            }
            if (counter == 1) {
                break;
            }
            counter = 0;
        }
    }
}
