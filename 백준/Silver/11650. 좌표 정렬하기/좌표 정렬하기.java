
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] matrixArr = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            matrixArr[i][0] = Integer.parseInt(input[0]);
            matrixArr[i][1] = Integer.parseInt(input[1]);
        }

        Arrays.sort(matrixArr, (o1, o2) -> {
            if(o1[0] == o2[0]) {
                return o1[1] - o2[1];
            } else {
                return o1[0] - o2[0];
            }
        });

        for (int i = 0; i < n; i++) {

                System.out.print(matrixArr[i][0] + " " + matrixArr[i][1]);
            System.out.println();

        }


    }
}








