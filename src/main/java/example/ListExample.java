package example;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Item 1");
        arrayList.add("Item 2");
        arrayList.add("Item 3");
        System.out.println(arrayList);

        arrayList.set(1, "Item Setted");

        System.out.println(arrayList);

        arrayList.remove(2);

        System.out.println(arrayList);

        Set<String> set = new HashSet<>();

        set.add("Item Setted");
        set.add("Item Setted");

        System.out.println(set);

        Map<String, String> map = new HashMap<>();

        map.put("day18month06year2024/bai1", "Item 1");
        map.put("day18month06year2024/bai2", "Item 2");
        map.put("day18month06year2024/bai3", "Item 3");

        System.out.println(map);
    }
}
