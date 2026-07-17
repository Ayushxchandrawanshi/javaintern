
import java.util.Scanner;

public class CinemaBooking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = 7;
        int[] arr = new int[7];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            } else {
                max = max < count ? count : max;
                count = 0;
            }
        }

        System.err.println(max);
    }

}
