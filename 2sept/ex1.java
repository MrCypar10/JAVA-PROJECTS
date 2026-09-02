 import java.util.*;
 
 public class ex1{
    
    public static void main(String[] args) {
    Random r1 = new Random();
    int n = r1.nextInt(10); 

    
    
    for(int i = 1; i<=7; i++){
    Scanner sc = new Scanner(System.in);
    int a  = sc.nextInt();
        if (a==n) {
        System.out.println("You Won the Game !! ");
        break;
     }
     else{
        System.out.println("You lose the game!!!");
     }
    }
    }
 }