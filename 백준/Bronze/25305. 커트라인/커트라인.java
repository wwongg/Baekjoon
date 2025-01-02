import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        Integer[] score = new Integer[n];

        for(int i = 0; i < n; i++) {
            score[i] = scan.nextInt();
        }

        Arrays.sort(score, Collections.reverseOrder());

        System.out.println(score[k-1]);



    }



}

