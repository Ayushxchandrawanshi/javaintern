//Find the longest subarray whose sum is even in a list of element

public class SubArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 0, 1, 1, 0};
        int sum = 0, max = 0, l = 0;

        for (int r = 0; r < 7; r++) {
            sum += arr[r];

            while (sum % 2 != 0) {
                sum += arr[l];
                l++;
            }
            if (sum % 2 == 0 && max < r - l + 1) {
                max = r - l + 1;
            }
        }
        System.out.println(max);
    }
}
