package CollectorsClassPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ToSet {
    public static void main(String[] args) {
        List<String> city = new  ArrayList<>();
        city.add("mumbai");
        city.add("hyderabad");
        city.add("pune");
        city.add("hyderabad");
        city.add("delhi");
        city.add("noida");
        System.out.println(city);

        // sorting the list and collecting stream into set

        String sortCity = city.stream().collect(Collectors.toSet()).toString();
        System.out.println(sortCity);
    }
}
