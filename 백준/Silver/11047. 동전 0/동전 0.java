
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int coin = Integer.parseInt(input[1]);

        int count = 0;

        int[] coinUnit = new int[n];

        for (int i = 0; i < n; i++) {
            coinUnit[i] = Integer.parseInt(br.readLine());
        }



            for (int i = n - 1; i >= 0; i--) {
                if (coin / coinUnit[i] > 0) {
                    count += (coin / coinUnit[i]);
                    coin %= coinUnit[i];
                    i++;
                }
            }

        System.out.println(count);





    }
}








