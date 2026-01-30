import java.util.Scanner;
//multiplication table of number using for loop
public class NumberTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to table generator");
        int num;
        System.out.print("Enter a number for generating table: ");
        num = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(num+ "*"+ i+" " + (num * i));
        }
    }
}
