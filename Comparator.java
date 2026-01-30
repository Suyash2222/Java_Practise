import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
* Sorting a list using custom comparator
* */

public class Comparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Lion","Zebra","Horse","Bat","Cat","Ant");
        System.out.println(names);
        sortInDescending(names);
        System.out.println(names);
    }
    public static void sortInDescending(List<String> stringList){
        Collections.sort(stringList, new java.util.Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)){
                    return 0;
                }else if (o1.charAt(0)<o2.charAt(0)){
                    return 1;
                }else {
                    return -1;
                }
            }
        });
    }
}
