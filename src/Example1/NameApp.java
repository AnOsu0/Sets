package Example1;

import java.io.FileNotFoundException;
import java.util.TreeSet;

public class NameApp {
    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<String> set =
                Names.makeSetfromFile("C:\\Users\\LNV\\Desktop\\JavaFiles\\namespl.txt");
        System.out.println(set.size());
        System.out.println(set.first());
        System.out.println(set.last());
    }
}
