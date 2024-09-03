package StreamApis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IntroductionToStream {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("vijay");
        list.add("ajay");
        list.add("digvijay");
        list.add("aakash");
        list.add("ajay");
        list.add("aakash");
        list.add("mahesh");
        System.out.println("Original list :  "+list);

        // sorting in the unique elements
        // sorting greater then 5 values
        List<String> sort = list.stream().distinct()
                .filter(s -> s.length() >=5).collect(Collectors.toList());

        System.out.println("After sorting the Elements unique wise and " +
                "Geater then Five elements: "+sort);
    }
}
