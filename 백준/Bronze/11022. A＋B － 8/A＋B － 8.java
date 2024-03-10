import java.util.Scanner;


public class Main {


        public static void main(String args[]) {

            Scanner in = new Scanner(System.in);

            int a = in.nextInt();

            for (int i = 1; i <= a; i++) {
                int c = in.nextInt();
                int d = in.nextInt();

                System.out.printf("Case #%d: %d + %d = %d", i, c, d, (c + d));
                System.out.println();
            }

            in.close();
        }

    }