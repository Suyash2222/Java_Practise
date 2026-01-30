import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check it is even or odd:  ");
        int num = sc.nextInt();

        String res= checkEvenOdd(num);
        System.out.println(num+" is "+res);


    }
    public static String checkEvenOdd(int num){
        String check= num % 2 == 0 ? "even" : "odd";
        return check;
    }

}
