import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Program ");
        System.out.println("Enter number to check if it is Palindrome: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean pal = checkPalindromeNum(num);

        if (pal) {
            System.out.println("Your number is palindrome");
        } else {
            System.out.println("Your number is not palindrome");
        }
    }

    public static boolean checkPalindromeNum(int num) {
        int original = num;
        int rev = 0;

        // loop must run while num > 0, not num < 0
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        return original == rev;
    }
}
