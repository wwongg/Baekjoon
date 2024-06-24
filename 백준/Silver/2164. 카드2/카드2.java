import java.io.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int front = 1;
        int back = N;

        int[] card = new int[2 * N];

        for (int i = 1; i <= N; i++) {
            card[i] = i;
            back = i;
        }

        for(int i = N; i > 1; i--) {
            front++;

            card[back + 1] = card[front];

            back++;
            front++;
        }

        System.out.println(card[front]);

    }


}