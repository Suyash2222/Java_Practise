import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int no1 = sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        int no2 = sc.nextInt();

        int minNum= no1 < no2 ? no1 : no2;
        System.out.println(minNum+" is minimum number.");



    }
}
