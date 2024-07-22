
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] S = str.split("");
        String[] sum = S;

        for(int i = 0; i < S.length; i++) {
            for(int j = i + 1; j < S.length; j++) {
                sum[i] += S[j];

            }
        }

        Arrays.sort(sum);
        for(int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
    }







}








