
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] atm = new int[n];

        String[] input = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            atm[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(atm);

        int time = 0;
        int result = 0;

        for (int i = 0; i < n; i++) {
            time += atm[i];
            result += time;
        }

        System.out.println(result);




    }
}








