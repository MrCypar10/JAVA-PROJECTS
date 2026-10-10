// immutable

package collections.ArrayList;
import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        List<String> movies = List.of("PATHAAN","GADAR-2","RARKPK","THE KERALA STORY","TJMM");// Immutable ->Cannot be changed.

        // old way.
//        movies.add(0,"Pathaan");
//        movies.add(1,"Gadar-2");
//        movies.add(2,"RARKPK");
//        movies.add(3,"The Kerala Story");
//        movies.add(4,"TJMM");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Movie Name :");
        String mov = sc.nextLine().toUpperCase();// inputed string will be in UpperCase

        int pos = movies.indexOf(mov);

        if(pos==-1){
            System.out.println(mov+" Not found !!");
        }else{
            System.out.println("Rank is "+ (pos+1));
        }


    }
}
