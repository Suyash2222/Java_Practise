import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to factorial generator using Recursion.\n");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long fact = factRec(num);
        System.out.println("Factorial of "+num+" is "+fact);
    }

    public static long factRec(int num){
        if (num == 1 ){
            return 1;
        }
        return num * factRec(num - 1);//recursive call
    }
}
