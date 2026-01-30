package in.kgcoding.challenge82;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array");
        int size = sc.nextInt();
        int numArray[]=new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter element: ");
            numArray[i]=sc.nextInt();
        }

        Statistics s = new Statistics();
        double calculatedMean = s.calmean(numArray);
        System.out.println("Mean of array is : "+calculatedMean);
    }
    private static class Statistics{
        public double calmean(int numArray[]){
            int sizeOfArray = numArray.length;
            int sumOfArray=0;
            double mean;
            for (int x:numArray){
                sumOfArray += x;
            }

           return mean = (double) sumOfArray/sizeOfArray;


        }
//        public double calmedian(int numArray[]){
//
//
//
//        }
    }
}
