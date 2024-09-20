package BasicCollectionsProgrames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddAllElements {
    public static void main(String[] args) {

        String[] arr = {"vishnu","prasad","roman","angad","krishna","anil"};

        List<String> list = new ArrayList<>();

        // for adding all elements from array
        Collections.addAll(list, arr);
        System.out.println("The array list of names are :  "+list);
    }
}
