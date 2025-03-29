

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        int[] numA = new int[2];    // 분자
        int[] numB = new int[2];    // 분모
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputA = br.readLine().split(" ");
        String[] inputB = br.readLine().split(" ");

        for (int i = 0; i < 2; i++) {
            numA[i] = Integer.parseInt(inputA[i]);
            numB[i] = Integer.parseInt(inputB[i]);
        }

        int resultA = numA[0] * numB[1] + numA[1] * numB[0];
        int resultB = numA[1] * numB[1];


        StringBuilder sb = new StringBuilder();

        while (true) {

            int gcd = GCD(resultA, resultB);
            if(gcd == 1) {
                sb.append(resultA + " ").append(resultB);
                break;
            } else {
                resultA /= gcd;
                resultB /= gcd;
            }

        }

        System.out.println(sb);




    }

    static int GCD(int a, int b) {
        if(b == 0)return a;
        else return GCD(b, a % b);
    }

}
