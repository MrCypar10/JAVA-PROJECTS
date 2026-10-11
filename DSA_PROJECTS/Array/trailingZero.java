package Array;

public class trailingZero {
    public static void main(String[] args) {
        int arr[] = {10, 50, 0, 0, 6, 4};

        for (int i = 0; i < arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if (i == 0 && j != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        }
        for (int x : arr) {
            System.out.print(x + " ");

        }
    }
}