package BasicCollectionsProgrames;

import java.util.ArrayList;
import java.util.List;

public class SearchAnElement {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("cricket");
        list.add("football");
        list.add("vollyball");
        list.add("basketball");
        list.add("kabbadi");
        list.add("kho kho");
        System.out.println(list);

        // searching an element
        if(list.contains("kabbadi")){
            System.out.println("The element kabbadi is found");
        }else {
            System.out.println("The element ur searching is not exist");
        }
    }
}
