package CollectorsClassPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToList {
    public static void main(String[] args) {

        List<String> cities = Arrays.asList("mumbai","pune","hyderabad","chennai","bengalore");
        System.out.println(cities);

        //Collecting the entire list into Stream
        String citi = cities.stream().collect(Collectors.toList()).toString();
        System.out.println(citi);

    }
}
