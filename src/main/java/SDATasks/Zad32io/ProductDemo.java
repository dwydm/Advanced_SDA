package SDATasks.Zad32io;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ProductDemo {
    private static List<Product> productList = new ArrayList<>();
     static {
        fillProductList();
    }

    public static void main(String[] args) {


    }

    private static void fillProductList() {
        createProduct("Banan", 7,5);
        createProduct("Ananas",9,1);
        createProduct("Pomarancze",6.5,6);
        createProduct("Wisnie", 12.1,200);
        createProduct("Kiwi", 6.4,1);
    }

    private static void createProduct(String name, double price, int amount) {
        productList.add(new Product(name,price,amount));
    }
}
