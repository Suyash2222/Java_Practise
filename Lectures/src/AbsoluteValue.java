import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to absolute value converter");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int res = num >= 0 ? num : -num;

        System.out.println("Absolute number is "+res);
    }
}
