

import java.io.*;
import java.util.*;


public class Main {

    static int[] dp;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] grapeJuice = new int[
                Math.max(n + 1, 3)];
        for (int i = 1; i <= n; i++) {
            grapeJuice[i] = Integer.parseInt(br.readLine());
        }
        dp = new int[Math.max(n + 1, 3)];

        dp[0] = 0;
        dp[1] = grapeJuice[1];
        dp[2] = grapeJuice[1] + grapeJuice[2];

        int max = 0;

        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(Math.max(dp[i - 1],
                    dp[i - 2] + grapeJuice[i]),
                    dp[i - 3] + grapeJuice[i - 1] + grapeJuice[i]);

        }

        System.out.println(dp[n]
        );





    }

   




}
