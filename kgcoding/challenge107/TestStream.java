package in.kgcoding.challenge107;

import java.util.Arrays;
import java.util.List;

public class TestStream {
    public static void main(String[] args) {
        List<String> names = List.of("Banana","Mango","Papaya","Kiwi","Date");
        names.stream()
                .forEach(name -> System.out.println(name));
    }

}
