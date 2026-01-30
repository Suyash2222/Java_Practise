import java.util.Scanner;

public class Swap_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int no1=sc.nextInt();
        System.out.print("Enter Second Number: ");
        int no2=sc.nextInt();

        System.out.println("First No: "+no1+" Second No: "+no2);
        int temp;
        temp=no1;
        no1=no2;
        no2=temp;

        System.out.println("After Swapping \n First Number: "+no1+"\n Second Number: "+no2);
    }
}
