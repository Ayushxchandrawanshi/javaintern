
import java.util.Scanner;

public class vehicle_fine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the speed of vehicle");
        int speed = sc.nextInt();
        int fine = 0;

        System.out.println("Repeated fine (y/n)");
        char repeated = sc.next().charAt(0);

        if (speed >= 100) {
            fine += 1000;
        } else if (speed >= 80) {
            fine += 500;
        }
        if (repeated == 'y') {
            fine = fine * 2;
            System.out.println("Double fine: " + repeated);
        }

        System.out.println("Total fine: " + fine);

    }

}
