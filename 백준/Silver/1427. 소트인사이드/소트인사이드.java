import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        String nums = scan.nextLine();

        int[] number = new int[nums.length()];

        for (int i = 0; i < nums.length(); i++) {
            number[i] = nums.charAt(i) - '0';
        }

        Arrays.sort(number);

        for (int i = 0; i < number.length; i++) {
            int temp;

            for (int j = 0; j < number.length - 1; j++) {
                if(number[j] < number[j + 1]) {
                    temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                }
            }
        }



        for (int i = 0; i < nums.length(); i++) {
            System.out.print(number[i]);
        }


    }





}

