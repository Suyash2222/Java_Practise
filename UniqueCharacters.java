import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//program to find number of unique characters in string using Set
public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Character> uniqueChar = new HashSet<>();
        System.out.print("Enter a string: ");
        String userString = sc.next();
        for (char c : userString.toCharArray()) {
            uniqueChar.add(c);
        }
        System.out.printf("Your String has %d unique characters.",uniqueChar.size());
    }
}
