package CollectorsClassPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByElement {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("roman","vishnu","angad","vishal","prasad","anil");
        System.out.println("All names from list: "+names);

        //grouping the names from stream to list

        /* String groupName = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0))).toString();
        System.out.println("names grouping by: "+groupName);*/

        Map<Character ,List<String>> groupName1 = names.stream()
                .collect(Collectors.groupingBy(name-> name.charAt(0)));
        System.out.println("after grouping: "+groupName1);

    }
}
