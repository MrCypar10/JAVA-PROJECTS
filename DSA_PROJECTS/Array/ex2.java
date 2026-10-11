
package Array;
import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int x : arr) {
            System.out.print(x+ " ");
        }
        System.out.println();

        int start = 0;
        int end = arr.length-1;
        while (start < end) {
         int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
        System.out.println("Reversed Array :");
        for(int x: arr){
            System.out.print(x+" ");

        }
    }
}