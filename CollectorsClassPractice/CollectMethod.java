package CollectorsClassPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethod {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6,8,9,3,22,16,2);
        System.out.println(numbers);

        //Collect method() we can return List odd numbers
        List<Integer> oddNumbers = numbers.stream().filter(num->num%2 !=0).collect(Collectors.toList());
        System.out.println(oddNumbers);
    }
}
