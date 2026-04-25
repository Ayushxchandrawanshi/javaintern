
public class Recursion {

    static void recur(int a) {
        if (a <= 5) {
            //System.out.println(a);

            a++;
            recur(a);
            System.out.println(a);
        }
    }

    public static void main(String[] args) {

        recur(1);
    }

}
