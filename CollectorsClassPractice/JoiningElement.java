package CollectorsClassPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningElement {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("vishnu","ashok","praveen","madhav","ashwini");
        System.out.println(list);

        //joining into list by *
        String name = list.stream().collect(Collectors.joining(" * "));
        System.out.println(name);
    }
}
