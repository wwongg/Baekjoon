
import java.util.Arrays;
import java.util.Scanner;


public class Main {

        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);

            int N = scan.nextInt();

            int[] x = new int[N];
            int[] y = new int[N];

            for(int i = 0; i < N; i++) {
                x[i] = scan.nextInt();
                y[i] = scan.nextInt();
            }

            Arrays.sort(x);
            Arrays.sort(y);

            int xLength = x[N - 1] - x[0];
            int yLength = y[N - 1] - y[0];

            System.out.println(xLength * yLength);


        }
}

