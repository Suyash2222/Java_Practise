import java.util.Scanner;

public class OccuranceOfElement {
    //find occurence of number in array using for each loop
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int [] numArray = new int[size];
        for (int i = 0; i<size; i++){
            System.out.print("Enter " +(i+1)+ " value: ");
            numArray[i]= sc.nextInt();
        }

        System.out.println("Enter a number to find occurences of: ");
        int ocNum = sc.nextInt();
        int res = findOccurence(numArray,ocNum);

        System.out.println("Your number "+ocNum+" Occured "+res+" times");
        sc.close();
    }

    public static int findOccurence(int [] numArray,int ocNum){
        int count = 0;
        for (int x: numArray){
            if (ocNum == x){
                count += 1 ;
            }

        }
        return count;
    }
}
