import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        while (true) {

            if(N%5 == 0) { // 0일 때도 마찬가지
                sum += N/5;
                System.out.println(sum);
                break;
            } else {
                N -= 3;
                sum++;
            }

            if(N < 0) {
                System.out.println("-1");
                break;
            }
        }


    }











}