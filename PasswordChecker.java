
import java.util.*;

public class PasswordChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = sc.nextLine();

        System.out.println(passwordStrength(password));
    }

    static String passwordStrength(String password) {
        boolean hashLength = false;
        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean hasSpecChar = false;
        boolean hasLower = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else {
                hasSpecChar = true;

            }
        }

        if (password.length() >= 8 && hasDigit == true && hasUpper == true && hasLower == true && hasSpecChar == true) {
            return "Strong";
        }

        return "week";
    }
}
