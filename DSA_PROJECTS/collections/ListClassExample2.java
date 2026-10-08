package collections;

import java.util.ArrayList;
import java.util.List;

// creating objects of List Child
public class ListClassExample2 {
    public static void main(String[] args) {
        List <Integer> myList;
        myList = new ArrayList<>();
        myList.add(0,10);
        myList.add(1,20);
        myList.add(2,30);
        myList.add(40);
        myList.add(3,50);
        myList.add(60);

        System.out.println(myList);

    }
}
