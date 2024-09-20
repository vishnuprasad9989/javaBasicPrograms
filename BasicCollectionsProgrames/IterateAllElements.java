package BasicCollectionsProgrames;

import java.util.ArrayList;
import java.util.List;

public class IterateAllElements {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("blue");
        list.add("green");
        list.add("yellow");
        list.add("orange");
        list.add("pink");
        list.add("mango");

        System.out.println("The list of colors are:  ");
        for(String colors : list){
            System.out.print(colors + " , ");
        }
    }
}
