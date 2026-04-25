
import java.util.Scanner;

public class vending {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0;
        char stay;
        int trayNo;

        do {
            System.out.println("Tray1 | Bevarages");
            System.out.println("Tray2 | Snacks");
            System.out.println("Tray3 | Chocolates");

            System.out.println("Select your Tray(1/2/3/0)");
            trayNo = sc.nextInt();
            switch (trayNo) {

                case 1: {
                    do {
                        System.out.println("a. Red Bull 180");
                        System.out.println("b. Fanta  40");
                        System.out.println("c. Coca Cola 50");
                        System.out.println("Items to purchase(a/b/c)");

                        char ch = sc.next().charAt(0);

                        if (ch == 'a') {
                            total += 180;
                        } else if (ch == 'b') {
                            total += 40;
                        } else if (ch == 'c') {
                            total += 50;
                        }

                        System.out.println("Stay y/n");
                        stay = sc.next().charAt(0);

                    } while (stay != 'n');
                    break;
                }

                case 2: {
                    do {

                        System.out.println("a. Lays 20");
                        System.out.println("b. Kurkure  10");
                        System.out.println("c. Orea 15");
                        System.out.println("Items to purchase(a/b/c)");

                        char ch = sc.next().charAt(0);

                        if (ch == 'a') {
                            total += 20;
                        } else if (ch == 'b') {
                            total += 10;
                        } else if (ch == 'c') {
                            total += 15;
                        }

                        System.out.println("Stay y/n");
                        stay = sc.next().charAt(0);

                    } while (stay != 'n');
                    break;
                }

                case 3: {
                    do {
                        System.out.println("a. Dairy Milk 110");
                        System.out.println("b. Silk  150");
                        System.out.println("c. Much 50");
                        System.out.println("Items to purchase(a/b/c)");

                        char ch = sc.next().charAt(0);

                        if (ch == 'a') {
                            total += 110;
                        } else if (ch == 'b') {
                            total += 150;
                        } else if (ch == 'c') {
                            total += 50;
                        }

                        System.out.println("Stay y/n");
                        stay = sc.next().charAt(0);

                    } while (stay != 'n');
                    break;
                }
            }
        } while (trayNo != 0);
        System.out.println("Your total Bill = " + total);
        sc.close();

    }
}
