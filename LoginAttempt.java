
import java.util.Scanner;

public class LoginAttempt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password");
        int attempt = 0;
        String password = sc.next();

        for (int i = 1; i <= 3; i++) {
            if (password.equals("ayush")) {
                System.out.println("Login Successfull");
            } else {
                System.out.println("Accound Locked");
            }
        }
    }

}
