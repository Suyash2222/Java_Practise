import java.util.Scanner;

public class ExitOnExit {
    //take inputs from user and exit the program when exit command is entered
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Enter a command: ");
            String command = sc.next();
            if (command.equalsIgnoreCase("exit")){
                break;
            }
        }
        System.out.println("You have successfully exited from program. ");
    }
}
