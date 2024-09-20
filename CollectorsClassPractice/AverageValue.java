package CollectorsClassPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageValue {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,8,3,5,6,18,32,1);
        System.out.println("The List: "+list);

        // finding average
        double average = list.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println("The average of list: "+average);
    }
}
