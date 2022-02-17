package Example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Names {

    public static TreeSet<String> makeSetfromFile(String fileNme) throws FileNotFoundException {
        File file = new File(fileNme);
        NameComparator nameComparator = new NameComparator();
        TreeSet<String> names = new TreeSet<String>(nameComparator);
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            String name = reader.nextLine();
            names.add(name);
        }
        return names;
    }


}

class NameComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}
