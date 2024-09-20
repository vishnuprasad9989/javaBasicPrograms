package StreamApis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenOddUsingStream {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(12);
        list.add(45);
        list.add(13);
        list.add(16);
        list.add(32);
        list.add(47);
        list.add(19);
        // iterating the list
        for(Integer num : list){
            System.out.print(num+" , ");
        }
        System.out.println();

        List<Integer> evenNumber = list.stream().filter(a -> a%2 == 0).collect(Collectors.toList());
        System.out.println("After sorting list into even numbers : "+evenNumber);

        List<Integer> oddNumber = list.stream().filter(a -> a%2 != 0).collect(Collectors.toList());
        System.out.println("After sorting list into odd numbers : "+oddNumber);
    }

}
