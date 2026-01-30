import java.util.Scanner;

public class MaxFromArray {
    //display maximum number from integer array using forEach loop
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int [] numArray = new int[size];
        for (int i = 0; i<size; i++){
            System.out.print("Enter " +(i+1)+ " value: ");
            numArray[i]= sc.nextInt();
        }
        int res = maxArray(numArray);
        System.out.println("Maximum number from array is "+res);
        sc.close();

    }
    public static int maxArray(int[]numArray){
        int [] array = numArray;
        int max = array[0];

        for (int x:array){
            if (x>max){
                max = x;
            }
        }
        return max;
    }
}
