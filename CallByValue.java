
public class CallByValue {

    static void add(int a, double b, String msg) {

        a = 50;
        b = 80.0;
        double c = a + b;
        msg = "jai shree ram";

        System.out.println("add : " + c);
    }

    public static void main(String[] args) {
        int a = 10;
        double b = 20.0;
        String msg = new String("Hello");
        CallByValue c = new CallByValue();

        //c.add(a, b);
        add(a, b, msg);

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("msg: " + msg);
    }
}
