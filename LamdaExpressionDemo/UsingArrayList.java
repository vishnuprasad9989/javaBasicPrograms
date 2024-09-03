package LamdaExpressionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(35);
        list.add(95);
        list.add(125);
        list.add(65);
        list.add(220);
        list.add(10);
        System.out.println("Before sorting the list:  "+list);

        //sorting the list in decending order using lamda camparator object...
        Collections.sort(list, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);

        System.out.println("After elements sorting:  "+list);
    }
}
