package Example2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Shop {
    private static Scanner sc = new Scanner(System.in);

    public static void generalLoop() {
        HashSet<Product> set = new HashSet<>();
        int options = -1;
        while (options!=1) {
            System.out.println("Wyierz opcję:");
            System.out.println("0 - dodaj nowy produkt");
            System.out.println("1 - wyjście z programu");
            options = sc.nextInt();
            sc.nextLine();
            if (options == 0) {
                Product product = makeProduct();
                if (contains(product,set)){
                    System.out.println("WYierz opcje:");
                    System.out.println("1- nadpisanie produktu");
                    System.out.println("2 - pozostawienie oryginalnego produktu");
                    int options2 = sc.nextInt();
                    if (options2 == 1) {
                        set.remove(product);
                        set.add(product);
                    }
                } else {
                    set.add(product);
                }
            }
        }
        System.out.println(set);
    }

    private static Product makeProduct() {
        System.out.println("Podaj nazwę produktu");
        String name = sc.nextLine();
        System.out.println("Podaj cenę produktu");
        double price = sc.nextDouble();
        sc.nextLine();
        return new Product(name, price);
    }

    private static boolean contains(Product product, HashSet<Product> set) {
        return set.contains(product);
    }


}
