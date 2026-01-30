import java.util.Scanner;

public class SumOfAllPositive {
    //sum of all positive number in array and skip if number is negative
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int [] numArray = new int[size];
        for (int i = 0; i<size; i++){
            System.out.print("Enter " +(i+1)+ " value: ");
            numArray[i]= sc.nextInt();
        }
        System.out.println("Sum of all Positive numbers from Array is: "+sumOfPositive(numArray));
    }

    public static int sumOfPositive(int [] numArray){
        int sum = 0;
        for (int num: numArray){
            if (num<0){
                continue;
            }else {
                sum +=num;
            }
        }

        return sum;
    }
}
