
import java.io.*;
import java.util.Scanner;

import static java.lang.Math.min;

public class Main {


    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int M = scan.nextInt();
        int N = scan.nextInt();

        int minNumber = 0;
        int sum = 0;
        int index = 0;

        int[] numBox = new int[N + 1];

        for(int j = M; j <= N; j++) {
            boolean check = true;
            if(j == 1) check = false;

            for (int i = 2; i < j; i++) {
                if(j % i == 0) {
                    check = false;
                    break;
                }
            }
            if(check) {
                numBox[index++] = j;
            }
        }

        minNumber = numBox[0];
        for(int i = 0; i < numBox.length; i++) {
            sum += numBox[i];
        }

        if(sum != 0) {
            System.out.println(sum + " " + minNumber);
        } else{
            System.out.println(-1);
        }



    }







}
