
import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class Main {

    static int[][] room;
    final static long mod = 1000000000;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[][] dp = new long[n + 1][10];

        // 오른쪽 맨 끝의 자릿수
        for (int i = 1; i < 10; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {

            for (int j = 0; j < 10; j++) {
                if(j == 0) {
                    dp[i][0] = dp[i - 1][1] % mod;
                }
                else if(j == 9) {
                    dp[i][9] = dp[i - 1][8] % mod;
                }
                else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % mod;
                }
            }
        }

        long result = 0;

        for (int i = 0; i < 10; i++) {
            result += dp[n][i];
        }

        System.out.println(result % mod);

    }






}
