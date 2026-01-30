import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,5,8,7,3,1,2,5,1,2);
        System.out.println(Collections.frequency(num,3));
    }
}
