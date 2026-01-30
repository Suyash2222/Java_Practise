import java.util.Scanner;

public class MinMaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to min max program**");
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] numArr = new int[size];

        int i = 0;
        while (i < size) {
            System.out.print("Enter " + (i + 1) + " Element of array: ");
            numArr[i] = sc.nextInt();
            i++;  // Fixed: increment i
        }

        int maxNo = FindMax(numArr);
        System.out.println("Maximum number in array is: " + maxNo);

        int minNo = findMin(numArr);
        System.out.println("Minimum number in array is: "+minNo);
    }

    public static int FindMax(int[] numArr) {
        int max = numArr[0];  // Fixed: Initialize with first element
        int i = 1;            // Start from 1 since 0 is used
        while (i < numArr.length) {
            if (numArr[i] > max) {
                max = numArr[i];
            }
            i++;  // Fixed: increment i
        }
        return max;
    }

    public static int findMin(int[] numArr) {
        int min = numArr[0];  // Fixed: Initialize with first element
        int i = 1;            // Start from 1 since 0 is used
        while (i < numArr.length) {
            if (numArr[i] < min) {
                min = numArr[i];
            }
            i++;  // Fixed: increment i
        }
        return min;
    }
}
