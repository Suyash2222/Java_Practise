import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        int reverse=revNum(num);
        System.out.println("Reverse of your number is: "+reverse);
    }
    public static int revNum(int num){
        int newNum=0;
        while (num>0){
            int digit=num%10;
            newNum=newNum * 10 + digit;
            num /=10;
        }
        return newNum;
    }
}
