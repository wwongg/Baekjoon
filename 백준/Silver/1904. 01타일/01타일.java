
import java.io.*;
import java.util.*;


public class Main {

    static int[] fibo;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1로만 이루어진 타일 하나, 00 타일 하나
        int n = Integer.parseInt(br.readLine());
        fibo = new int[Math.max(n + 1, 3)];

        fibo[1] = 1;
        fibo[2] = 2;

        for (int i = 3; i <= n; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 15746;
        }


        System.out.println(fibo[n]);
    }


}
