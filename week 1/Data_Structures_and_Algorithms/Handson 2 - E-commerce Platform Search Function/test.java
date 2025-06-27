import java.util.*;

public class test{
    public static void main(String[] args) {
        Product[] products ={
            new Product(1, "Phone", "Electronics"),
            new Product(2, "earbuds", "Electronics"),
            new Product(3, "tv", "Electronics"),
            new Product(6, "laptop", "Electronics")
        };
        Arrays.sort(products, Comparator.comparingInt(p -> p.pId));

        System.out.println("Linear Search");
        Product l=Product.lSearch(products, 3);
        System.out.println(l.pId+" "+l.Name);

        System.out.println("Binary Search");
        Product b=Product.bSearch(products, 2);
        System.out.println(b.pId+" "+b.Name);
    }
}

//Binary Search will have less complexity in case of large product lists as O(log n)<O(n); but prefer linear in case of small list of items.