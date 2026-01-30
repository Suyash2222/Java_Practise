import java.util.Scanner;

public class PasswordCheker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Set a Password");
        String pass;
        do {
            System.out.print("Enter your password: ");
            pass = sc.next();
        }while (!checkPass(pass));

        System.out.println("Thanks for entering valid password");
    }
    public static boolean  checkPass(String password){

        return password.length() > 5;

    }
}
