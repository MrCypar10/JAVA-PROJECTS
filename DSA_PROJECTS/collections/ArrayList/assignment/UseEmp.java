package collections.ArrayList.assignment;
import java.util.*;

public class UseEmp {
    private static String Syatem;

    public static void main(String[] args) {
    List<Emp> empList = new ArrayList<>();
    Emp e1 = new Emp(21,"Amit",45000.0);
    Emp e2 = new Emp(19,"Sumit",35000.0);
    Emp e3 = new Emp(20,"Amrita",46000.0);
    Emp e4 = new Emp(23,"Amitansh",49000.0);

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);

        for(Emp x : empList) {
            System.out.println(x);
        }
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter age, name, salary");
        int age = sc.nextInt();
        String name = sc.next();
        double sal = sc.nextDouble();

        Emp e = new Emp(age,name,sal);
        System.out.println("Removed ?" +empList.remove(e));

        for(Emp x : empList) {
            System.out.println(x);
        }
    }
}
