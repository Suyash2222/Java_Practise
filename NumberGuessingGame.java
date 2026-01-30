import java.util.Scanner;
//number guessing game using do while loop
//we provided default number num
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 6, guess;
        System.out.println("Welcome to number Guessing Game");
       do {
           System.out.print("Guess the Number between 1 to 10: ");
           guess = sc.nextInt();
       }while (num != guess);
        System.out.println("You Guessed the number");


    }
}
