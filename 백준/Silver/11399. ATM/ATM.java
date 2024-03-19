import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[] P = new int[N];
        int prevSum = 0;
        int sum = 0;

        for(int i = 0; i < N; i++) {
            P[i] = scan.nextInt();
        }

        Arrays.sort(P);

        for(int i = 0; i < N; i++) {
            sum += P[i];
            prevSum += sum;
        }

        System.out.println(prevSum);





    }


}