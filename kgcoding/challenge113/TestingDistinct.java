package in.kgcoding.challenge113;

import java.util.List;
import java.util.stream.Collectors;

public class TestingDistinct {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(8,5,8,3,7,2,5,8,1,2,6,8,1);

       List<Integer> distNum= numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distNum);
    }



}
