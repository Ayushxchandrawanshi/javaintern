
import java.util.Scanner;

public class WareHouse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total Stock ");
        int n = sc.nextInt();
        int total = 0;

        for (int i = 1; i < n; i++) {

            int current = sc.nextInt();
            int min = sc.nextInt();

            if (current < min) {
                System.out.println("Restock needed for product" + i);
                total++;
            }
            System.out.println("Total no. of product" + total);
        }
    }
}
