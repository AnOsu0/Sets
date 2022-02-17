package Lesson;

import java.util.Set;
import java.util.TreeSet;

public class PersonTreeSet {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>();
        set.add(new Person("Jan","Kowalski"));
        set.add(new Person("Jan","Kowalski"));
        set.add(new Person("Jan","Marzec"));
        set.add(new Person("Anna","Kawalec"));
        set.add(new Person("Szymon","Zalewski"));

        System.out.println(set);
        System.out.println("Size: " + set.size());
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());
        System.out.println(set.contains(new Person("Szymon","Zalewski")));

        Set<String> names = Set.of("Ania","Kasia","Basia");



    }
}
