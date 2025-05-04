
import java.io.*;
import java.util.*;


public class Main {

    static long[] fibo;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(angle(n)).append('\n');
        }

        System.out.println(sb);


    }

    static long angle(int n) {
        fibo = new long[Math.max(n + 1, 3)];
        fibo[0] = 0;
        fibo[1] = 1;
        fibo[2] = 1;

        for (int i = 3; i <= n; i++) {
            fibo[i] = fibo[i - 2] + fibo[i - 3];
        }

        return fibo[n];
    }


}
