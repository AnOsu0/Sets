package Lesson;

import java.util.HashSet;

public class PersonSet {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        people.add(new Person("Jan","Kowalski"));
        people.add(new Person("Jan","Kowalski"));
        people.add(new Person("Anna","Kawalec"));
        people.add(new Person("Anna","Kawalec"));
        people.add(new Person("Szymon","Zalewski"));
        System.out.println(people);
        System.out.println("Rozmiar " + people.size());
        System.out.println("Czy zawiera Jan Kowalski " + people.contains(new Person("Jan","Kowalski")));
        people.remove(new Person("Anna","Kawalec"));
        System.out.println(people);
        System.out.println("Rozmiar " + people.size());
    }
}
