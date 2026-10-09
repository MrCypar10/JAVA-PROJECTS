package collections.ArrayList;
import java.util.*;

public class AddingElements {
    public static void main(String[] args) {
        List<Integer>myList = new ArrayList<>();
        myList.add(10);
        myList.add(0,20);
        myList.add(1,30);
        myList.add(40);
        myList.add(2,50);
        myList.add(60);
        myList.add(4,70);
        System.out.println(myList);
    }
}
