import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int ans1 = gcd(a, b);
        System.out.println(ans1);
        int ans2 = ggd(a, b);
        System.out.println(ans2);
    }

    public static int gcd(int a, int b) {
        while(b != 0) {
            int r = a % b;

            a = b;
            b = r;
        }

        return a;
    }

    public static int ggd(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}