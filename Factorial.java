import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Welcome");
        System.out.print("Enter A Number to Calculate Its Factorial: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        long fact=PrintFact(num);
        System.out.println("Factorial Of "+num+"= "+fact);
    }
    public static long PrintFact(int num)
    {
       if (num<2){
           return 1;
       }
       long fact=1;
       int i=2;
       while (i<=num){
           fact=fact*i;
           i++;
       }
        return fact;
    }

}
