import java.io.*;
import java.util.*;

public class Main {

    static long[][] dp;
    static long sum = 0;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        dp = new long[N + 1][10];

        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }


        for(int i = 1 ; i < 10 ; i++)
            sum += stair(N,i);

        System.out.println(sum%1000000000);


    }

    static long stair(int digit, int val) {
        if(digit == 1) {
            return dp[digit][val];
        }

        if(dp[digit][val] == 0) {
            if(val == 0) {
                dp[digit][val] = stair(digit - 1, val + 1);
            } else if(val ==9)
                dp[digit][val] = stair(digit-1,val-1);
            else
                dp[digit][val] = stair(digit-1,val-1) + stair(digit-1,val+1);
        }

        return dp[digit][val]%1000000000;

    }






}