import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Welcome to day checker");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a choice number: ");
        int ch = sc.nextInt();

        switch (ch){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter choice number between 1 to 7 ");
                System.exit(0);
        }
    }
}
