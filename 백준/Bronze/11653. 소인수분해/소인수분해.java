import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int rest = n;

        int[] resultArr = new int[10000];
        int j = 0;

        int startNum = 2;

        while (true) {
            if (rest % startNum == 0) {
                resultArr[j++] = startNum;
                rest = rest / startNum;
            } else {
                startNum++;
            }

            if (rest == 1) {
                break;
            }
        }

        for (int i = 0; i < resultArr.length; i++) {
            if (resultArr[i] == 0) {
                break;
            }
            System.out.println(resultArr[i]);


        }


    }
}




