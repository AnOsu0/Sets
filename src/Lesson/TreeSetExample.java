package Lesson;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(2);
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(3);
        System.out.println(set);
        System.out.println("Size: " + set.size());
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());
        System.out.println("contains 4?" + set.contains(4));
        System.out.println("contains 5?" + set.contains(5));
    }
}
