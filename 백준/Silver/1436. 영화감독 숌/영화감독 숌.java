import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int num = 666;
        int count = 1;

        while (count != n) {
            num++;

            if(String.valueOf(num).contains("666")) {
                count++;
            }
        }

        System.out.print(num);




    }
    


}