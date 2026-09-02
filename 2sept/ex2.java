import java.util.Random;
import java.util.Scanner;

//
public class ex2 {
    public static void main(String[] args) {
        Random r1 = new Random();
        int n = r1.nextInt(10);
        int maxAttempt = 7;
        Scanner sc = new Scanner(System.in);
        System.out.println("MAximum attemepts : " +maxAttempt);
        System.out.println("You have to guess the number between 1 to 10");

        for (int i = 0; i<maxAttempt; i++) {
            System.out.println("Attempt " + i + "\n Guess the Number :");
            int guessNum = sc.nextInt();
            if (guessNum == n) {
                System.out.println("Congratulations! you Won the game");
                return;
            }
            if (guessNum > n) {
                System.out.println("Too high! try again.");
            } else {
                System.out.println("Too Low! try again. ");
            }
        }
        System.out.println("You couldn't guess the Number is " +maxAttempt +"attempts");

    }
}
