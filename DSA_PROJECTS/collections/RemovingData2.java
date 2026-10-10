package collections;

import java.util.ArrayList;
import java.util.List;

// creating objects of List Child
public class RemovingData2 {
    public static void main(String[] args) {
        List <String> myList = new ArrayList<>(List.of("jan" ,"feb" ,"mar" ,"apr" ,"may" ,"jun", "july" ,"aug" , "sept" , "oct" ,"nov" ,"dec"));

        System.out.println("List Size : "+myList.size());
        int index = myList.indexOf("mar");
        System.out.println("Removing Month at Index : "+index+" , "+ myList.remove(index));//(returns removed value : args=>(index no.));
        System.out.println("List Size : "+myList.size());
        System.out.println(myList);
    }
}
