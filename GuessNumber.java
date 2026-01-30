import java.util.Scanner;

public class GuessNumber {
   int random;

   GuessNumber(){
        random = (int) Math.ceil(Math.random()*10);
   }

    /**
     *
     * @param guessedNumber the number gussed by player
     * @return
     * negative if guessed number is lower
     * 0 is guessed number is correct
     * positive if guessed number is higher
     */
   int guess (int guessedNumber){
      return guessedNumber - random;

   }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       GuessNumber game = new GuessNumber();
        System.out.println("Welcome to number guessing game");
        System.out.println("Please guess a number between 1 to 10");
        int inputNumber;
        int result;

        do{
            System.out.print("Enter guessed number: ");
            inputNumber = sc.nextInt();
            result = game.guess(inputNumber);
            if (result == 0 ){
                System.out.println("Congrats you guessed correct number");
            } else if (result < 0) {
                System.out.println("Guess a higher number");
            }else {
                System.out.println("Please guess lower");
            }
        }while (result !=0);

    }





}
