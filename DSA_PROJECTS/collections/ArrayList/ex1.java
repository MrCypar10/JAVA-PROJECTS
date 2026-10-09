package collections.ArrayList;
    import java.util.*;

public class ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List <String> months = new ArrayList<>();

        for(int i = 0;i<4;i++){

            System.out.println("Enter the months name");
            String str = sc.next();
            months.add(str);
        }


        for(int i = months.size()-1; i>=0;i--){
            System.out.println(months.get(i));
        }
    }
}
