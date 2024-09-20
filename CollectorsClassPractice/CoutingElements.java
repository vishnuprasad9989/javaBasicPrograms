package CollectorsClassPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CoutingElements {
    public static void main(String[] args) {
        List<String> states = Arrays.asList("maharastra","telangana","assam","bihar","delhi","punjab");
        System.out.println("The List of states: "+states
        );
        // counting number of elements present in list by using stream...
        Long countElement = states.stream().collect(Collectors.counting());
        System.out.println("There are: "+countElement+"  states are there in list");
    }
}
