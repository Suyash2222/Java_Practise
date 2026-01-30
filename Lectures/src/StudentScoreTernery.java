import java.util.Scanner;

public class StudentScoreTernery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student marks: ");
        int mark = sc.nextInt();

        String res = mark >= 80 ? "High" : (mark >= 50 ? "Moderate" : "Low");
        System.out.println("Your score is "+res);
    }
}
