package CollectorsClassPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummingElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(25, 3, 16, 9, 27, 11, 78);
        System.out.println("Original list: " + list);

        //summing the list from strem
        Integer sumOfElements = list.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("After adding all elements:  " + sumOfElements);
    }
}
