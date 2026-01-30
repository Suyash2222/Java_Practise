package in.kgcoding.challenge108;

import java.util.List;

public class TestFilterAndReduce {
    public static void main(String[] args) {
        List<String> names = List.of("You Are watching the","bad","Program for filtering","ghatiya","the strings"
        ,"Having less","characters than 10");
       String res= names.stream()
                .filter(name-> name.length()>10)
                .reduce("",(a,b) -> a + " " +b);

        System.out.println(res);

    }
}
