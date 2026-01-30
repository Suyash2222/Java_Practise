import java.util.Scanner;

public class SumOfInteger {
    public static void main(String[] args) {
        System.out.print("Enter A Number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=printSum(num);
        System.out.println("Sum Of Digit is: "+sum);
    }
    public static int printSum(int num){
        int sum=0;
        while (num>0){
            sum=sum+(num%10);
            num=num/10;
        }



        return sum;
    }
}
