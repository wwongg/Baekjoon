import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = scan.nextInt();
        for(int i = 0; i < T; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            int ans2 = ggd(a, b);

            sb.append(ans2).append("\n");
        }

        System.out.println(sb.toString());


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