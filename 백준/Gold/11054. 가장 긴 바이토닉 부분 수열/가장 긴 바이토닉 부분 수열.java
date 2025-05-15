

import java.io.*;
import java.util.*;


public class Main {

    static int[] r_dp;
    static int[] l_dp;
    static int[] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        r_dp = new int[n + 1];
        l_dp = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            r_dp[i] = 1;
            l_dp[i] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if(arr[j] < arr[i] && r_dp[i] < r_dp[j] + 1) {
                    r_dp[i] = r_dp[j] + 1;
                }
            }
        }

        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i ; j--){
                if(arr[j] < arr[i] && l_dp[i] < l_dp[j] + 1) {
                    l_dp[i] = l_dp[j] + 1;
                }
            }
        }

        int[] result = new int[n + 1];
        int max = 0;
        for (int i = 1; i <= n; i++) {
            result[i] = r_dp[i] + l_dp[i];
            max = Math.max(max, result[i]);
        }

        System.out.println(max - 1);











    }

   




}
