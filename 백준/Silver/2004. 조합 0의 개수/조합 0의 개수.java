import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;

public class Main {

    public static void main(String[] args) throws IOException {



        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();

        long count5 = division1(N) - division1(N - M) - division1(M);
        long count2 = division2(N) - division2(N - M) - division2(M);

        System.out.println(Math.min(count5, count2));

    }


    public static int division1(int num) {

        int count = 0;
        while(num >= 5) {
            count += num / 5;
            num /= 5;
        }

        return count;
    }

    public static int division2(int num) {

        int count = 0;
        while(num >= 2) {
            count += num / 2;
            num /= 2;
        }

        return count;
    }

}