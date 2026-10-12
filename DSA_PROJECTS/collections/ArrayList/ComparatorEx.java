package collections.ArrayList;

import java.util.*;

class intComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}


public class ComparatorEx {
    public static void main(String[] args) {
        List<Integer>myList = new ArrayList<>(List.of(10,2,30,12,45,32,8));
        System.out.println("Before Sorting :" +myList);
        intComparator obj = new intComparator();
        Collections.sort(myList,obj);
        System.out.println("After Sorting :"+myList);
    }
}
