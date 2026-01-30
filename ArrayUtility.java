import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your array:");
        int size=sc.nextInt();
        int[]numArray= new int[size];

        int i=0;
        while (i<size){
            System.out.print("Enter "+(i+1)+" element: ");
            numArray[i]= sc.nextInt();
            i++;
        }
        return numArray;
    }

    public static void displayArray(int[] numArray){
        int i=0;
        while (i< numArray.length)
        {
            System.out.print(numArray[i]+" ");
            i++;
        }
        System.out.println();
    }

}
