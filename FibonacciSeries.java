import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Fibonacci Series");
        System.out.print("Enter number up to you want fibonacci series: ");
        int num=sc.nextInt();
        printFibo(num);
    }

    private static void printFibo(int num) {
        int first=0, second=1;
        if(num<0)return;;
        System.out.print("0 ");
        if (num==0)return;
        System.out.print("1 ");

        while (first+second<=num){
            int third=first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
        }
    }
}
