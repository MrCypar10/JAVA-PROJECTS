package collections;

import java.util.ArrayList;
import java.util.List;

// creating objects of List Child
public class SearchingArrayList {
    public static void main(String[] args) {
        List <Integer> myList;
        myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        System.out.println(myList.contains(30));//case Sensitive in string.
        System.out.println(myList.indexOf(30));
    }
}
