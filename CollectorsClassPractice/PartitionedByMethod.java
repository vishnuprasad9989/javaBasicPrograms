package CollectorsClassPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionedByMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(12);
        list.add(16);
        list.add(36);
        list.add(3);
        list.add(7);
        list.add(91);
        System.out.println("The original list: "+list);

        //partitioning by or sorting and seperating the even and odd elemnts...
        Map<Boolean, List<Integer> > partition = list.stream()
                .collect(Collectors.partitioningBy(num -> num%2 ==0));
        System.out.println(partition);

        //

    }
}
