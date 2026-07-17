
public class EventLongest {

    public static void main(String[] args) {
        int[] arr = new int[]{51, 2, 1, 0, 1, 1, 0};
        int sum = 0, max = 0, l = 0, r = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        if (sum % 2 == 0) {
            System.err.println(arr.length);
            return;
        }

        while (l < arr.length && arr[l] % 2 == 0) {
            l++;
        }
        while (r >= 0 && arr[r] % 2 == 0) {
            r--;
        }

        max = arr.length - 1 - l > r ? arr.length - l - 1 : r;
        System.out.println(max);
    }

}
