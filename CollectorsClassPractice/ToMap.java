package CollectorsClassPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("pune","bengalore","newyork","sydney");
        System.out.println(list);

       /* Map<String, Integer> cityList1 = list.stream()
                .collect(Collectors.toMap(city -> city, city ->city.length()));
        System.out.println(cityList1);*/


        // converting stream to map
        String cityList = list.stream().collect(Collectors
                .toMap(city -> city , city -> city.length())).toString();
        System.out.println(cityList);
    }
}
