package Lesson;

import java.lang.reflect.AnnotatedArrayType;
import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        System.out.println(set);

        HashSet<String> strings = new HashSet<>();
        strings.add("AA");
        strings.add("CC");
        strings.add("BB");
        strings.add("Aa");
        System.out.println(strings);
        System.out.println(strings.contains("AA"));
        System.out.println(strings.contains("DD"));
        strings.remove("BB");
        System.out.println(strings.contains("BB"));
        System.out.println(strings.size());
    }
}
