// Mutable

package collections.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex2_b_Mutable {
    public static void main(String[] args) {
        List<String> movies = new ArrayList<>(List.of("PATHAAN","GADAR-2","RARKPK","THE KERALA STORY","TJMM"));// Mutable ->Can be changed.
        movies.add("TIGER ZINDA HAI");  // GET ADD IN THE MOVIES LIST. BY THE HELP OF ARRAYLIST CONSTRUCTOR.

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
