package day20month06year2024;

import java.util.ArrayList;
import java.util.List;

public class Bai2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("Red");
        stringList.add("Blue");
        stringList.add("Green");
        stringList.add("Yellow");
        stringList.add("Orange");
        stringList.add("Pink");
        stringList.add("Violet");
        stringList.add("Gray");

        System.out.println("List before soft: " + stringList);
        for (int i = 0; i < stringList.size(); i++) {
            for (int j = i + 1; j < stringList.size(); j++) {
                if (stringList.get(i).charAt(0) > stringList.get(j).charAt(0)) {
                    System.out.println(stringList.get(i).charAt(0) + " " + stringList.get(j).charAt(0));
                    String temp = stringList.get(i);
                    stringList.set(i, stringList.get(j));
                    stringList.set(j, temp);
                }
            }
        }
//        Collections.sort(stringList);
        System.out.println("List after soft: " + stringList);
    }
}
