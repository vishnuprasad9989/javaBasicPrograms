package StreamApis;

import java.util.ArrayList;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("vinesh");
        list.add("roman");
        list.add("ashish");
        list.add("roman");
        list.add("mahesh");
        list.add("anil");
        list.add("mahesh");
        list.add("angad");
        System.out.println("Orginal list : " + list);

        /*for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    System.out.println("removed duplicate elements: " + list.get(j));
                    list.remove(j);
                    i--;
                }
            }
        }
        System.out.println(list);

        List<String> l = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > 5) {
                l.add(list.get(i));
            }
        }
        System.out.println(l);*/

        List<String> result = new ArrayList<>();
        for(String s: list){
            if (s.length() > 5){
                result.add(s);
            }
        }
        System.out.println(result);
    }
}
