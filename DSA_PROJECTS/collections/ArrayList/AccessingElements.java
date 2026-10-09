package collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AccessingElements {
    public static void main(String[] args) {
        List<String>myList = new ArrayList<>();
        myList.add("BGMI");
        myList.add("CODM");
        myList.add("Fortnite");
        myList.add("GTA V");
        String str = myList.get(3);
        System.out.println(str);
    }
}
