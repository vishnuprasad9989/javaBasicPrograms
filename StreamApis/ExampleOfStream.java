package StreamApis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    float price;

    public Product() {
        System.out.println("Default constructor of the class");
    }

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class ExampleOfStream {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<Product>();
        // adding some products
        list.add(new Product(01,"parle",150));
        list.add(new Product(02,"britania",180));
        list.add(new Product(03,"sunfest",120));
        list.add(new Product(04,"balaji",115));
        list.add(new Product(05,"haldirams",190));
        list.add(new Product(06,"lays",220));

        List<Float> list1 = list.stream()
                .filter(p->p.price >= 150) // sorting the data above 150 price
                .map(p->p.price) // getting price from list
                .collect(Collectors.toList()); // collecting as list

        System.out.println("After sorting with stram API's :   "+list1);
    }
}
