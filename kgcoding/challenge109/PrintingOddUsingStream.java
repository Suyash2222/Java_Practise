package in.kgcoding.challenge109;

import java.util.List;

public class PrintingOddUsingStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,8,6,9,7,5,10,20,40,33);
          numbers.stream()
                .filter(num -> num % 2 != 0)
                  .forEach(num -> System.out.println(num));


    }
}
