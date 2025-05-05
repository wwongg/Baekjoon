

import java.io.*;
import java.util.*;


public class Main {

    static int[] array;
    static Integer[] dp;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 다음 배열이 음수일 때 음수를 더했을 때 0보다 크면 더하기 아니면 끝내기
        array = new int[n];
        dp = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = array[0];
        int max = array[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(array[i], array[i] + dp[i - 1]);
            max = Math.max(dp[i], max);
        }

        System.out.println(max);


    }

   




}
