import java.util.ArrayList;
import java.util.List;

public class Swap {
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(5);
        nums.add(8);
        nums.add(9);
        nums.add(1);
        System.out.println(nums);
        swapNum(nums,1,3);
        System.out.println(nums);

    }
    public static void swapNum(List<Integer> nums, int x, int y){
        int swap = nums.get(x);
        nums.set(x, nums.get(y));
        nums.set(y,swap);

    }
}
