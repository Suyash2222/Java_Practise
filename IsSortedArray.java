public class IsSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to array sorting check post");
      int []arr=  ArrayUtility.inputArray();

      boolean isInc= isIncreasing(arr);
      boolean isDec= isDecreasing(arr);

      if (isInc || isDec){
          System.out.println("Your array is sorted.");
      }
      else {
          System.out.println("Your array is not sorted.");
      }
    }
    public static boolean isIncreasing(int[] arr){
        int i=1;
        while (i< arr.length){
            if (arr[i]>arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isDecreasing(int[] arr){
        int i=1;
        while (i< arr.length){
            if (arr[i]<arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
