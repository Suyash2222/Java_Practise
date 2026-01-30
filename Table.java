import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A number for table: ");
        int num=sc.nextInt();
        PrintTable(num);

    }
    public static void PrintTable(int num){
        int i=1;
        while (i<=10){
            System.out.println(num+"*"+i+" "+(i*num));
            i++;
        }



    }
}
