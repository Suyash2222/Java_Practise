import java.util.Scanner;

public class NumberOfOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        int i = 0;
        while (i < size) {
            System.out.print((i + 1) + " Element: ");
            int elem = sc.nextInt();
            arr[i] = elem;
            i++;
        }

        System.out.print("Enter the number for searching: ");
        int searchEle = sc.nextInt();

        int count=0;
        boolean found=false;
        for (i = 0; i < arr.length; i++) {
            if (searchEle == arr[i]) {
                count +=1;
                found=true;

            }
        }

        if (found){
            System.out.println("Element occur "+count+" times");

        }else {
            System.out.println("Element not found in array.");
        }


    }
}
