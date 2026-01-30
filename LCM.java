import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First number for LCM: ");
        int First=sc.nextInt();
        System.out.print("Enter Second number for LCM: ");
        int Second=sc.nextInt();
        int LCM=calLcm(First,Second);
        System.out.println("LCM of Given Number is : "+LCM);

    }
    public static int calLcm(int First, int Second){
        int i=1;
        while (i<=Second){
            int factor = First * i;
            if(factor % Second == 0){
                return factor;
            }
            i++;
        }
    return 0;
    }

}
