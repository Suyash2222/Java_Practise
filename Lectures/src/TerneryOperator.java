import java.util.Scanner;

public class TerneryOperator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the First No: ");
        int n1= input.nextInt();
        System.out.print("Enter the Second No: ");
        int n2= input.nextInt();

//        if (n1>n2){
//            System.out.println(n1+" Is greatest number");
//        }else {
//            System.out.println(n2+" is greatest number.");
//        }

        int greatestNumber= n1  > n2 ? n1 : n2;
        System.out.println(greatestNumber+" is greatest num");
    }
}
