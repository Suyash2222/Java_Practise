import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        System.out.println("Welcome To OddSum");
        System.out.print("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       int sum= printSum(num);
        System.out.println("Oddsum till "+num+" Is "+sum);
    }

    private static int printSum(int num) {
        int sum=0;
        int i=1;
        while(i<=num){
            sum=sum+i;
            i=i+2;
        }
        return sum;
    }
}
