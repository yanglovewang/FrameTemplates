package list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lists {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int a = -40;
        int i = a >> 3;
        System.out.println(i);

        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.remove(3);
        
    }
}
