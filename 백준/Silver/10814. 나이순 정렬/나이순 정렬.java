import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[][] memberInfo = new String[n][2];

        for (int i = 0; i < n; i++) {

            String[] input = br.readLine().split(" ");

            memberInfo[i][0] = input[0];
            memberInfo[i][1] = input[1];
        }

        Arrays.sort(memberInfo, (o1, o2) -> {

            return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);


        });


        for (int i = 0; i < n; i++) {
            System.out.println(memberInfo[i][0] + " " + memberInfo[i][1]);
        }

















    }


}