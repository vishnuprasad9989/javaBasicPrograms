package BasicCollectionsProgrames;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindMinMax {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(138);
        list.add(382);
        list.add(528);
        list.add(101);
        list.add(122);
        list.add(420);
        list.add(320);
        System.out.println("Original list: "+list);

        // finding minimum value of elements
        int minimum = Collections.min(list);
        int maximum = Collections.max(list);

        //camparing values if find equals
        if(minimum == maximum){
            System.out.println("The all elements are equal... ");
        }else {
            System.out.println("The minimum value of list is: "+minimum);
            System.out.println("The maximum value of list is: "+maximum);
        }
    }
}
