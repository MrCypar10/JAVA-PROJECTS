package collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}

public class ComparatorEx2 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>(List.of("jan" ,"feb" ,"mar" ,"apr" ,"may" ,"jun", "july" ,"aug" , "sept" , "oct" ,"nov" ,"dec"));
        System.out.println("Before Sorting : "+ myList);

        Collections.sort(myList,new StringComparator());
        System.out.println("After Sorting : "+ myList);

    }
}


