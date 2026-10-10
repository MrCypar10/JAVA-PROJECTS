package collections;

import java.util.ArrayList;
import java.util.List;

// creating objects of List Child
public class RemovingData {
    public static void main(String[] args) {
        List <String> myList = new ArrayList<>(List.of("jan" ,"feb" ,"mar" ,"apr" ,"may" ,"jun", "july" ,"aug" , "sept" , "oct" ,"nov" ,"dec"));

        System.out.println("List Size : "+myList.size());
        System.out.println("Removing March ? " + myList.remove("mar"));//(returns t/f : args=>(object));
        System.out.println("List Size : "+myList.size());
        System.out.println(myList);

        System.out.println();
        System.out.println();

        System.out.println("Removing Month ? " + myList.remove(5));//(returns removed value : args=>(index no.));
        System.out.println("List Size : "+myList.size());
        System.out.println(myList);
    }
}
