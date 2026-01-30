package in.kgcoding.challenge111;

import java.util.Scanner;
import java.util.stream.IntStream;

public class CheckingFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check its factorial: ");
        int number = sc.nextInt();

        IntStream.rangeClosed(2,number)
                .reduce((a,b)-> a*b)
                .ifPresent((System.out::println));
    }
}
