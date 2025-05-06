import java.io.*;
import java.util.*;

public class Main {

    static int[][] triangle;
    static int[][] dp; // 최댓값 자장 배열

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        triangle = new int[n][n];
        dp = new int[n][n];

        StringTokenizer st;

        // 정수 삼각형 배열 저장 루프
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int j = 0; j < n; j++) {
            dp[n - 1][j] = triangle[n - 1][j];
        }
        // 아래서부터 위로 탐색



        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {

                    dp[i][j] = Math.max(dp[i + 1][j], dp[i + 1][j + 1]) + triangle[i][j];


            }
        }

        int result = dp[0][0];


        System.out.println(result);




    }


}
