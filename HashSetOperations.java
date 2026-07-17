
import java.util.HashSet;
import java.util.Scanner;

public class HashSetOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int ele = 1;
        while (ele != 0) {
            set.add(ele);
            ele = sc.nextInt();

        }
        for (int i : set) {

            System.out.println(i);
        }
    }
}
