package Array;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ex1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the Elements :");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your Inputed Elements are");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();

        Arrays.sort(arr);
        int k = arr[n-1];
        System.out.println( " largest no is :" +k);
    }
}