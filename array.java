
import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = {10, 20, 30, 40, 50};
        //int[] arr = new int[]{10, 20, 30, 40, 50};

        int[] arr1 = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println(arr1[j]);

        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
