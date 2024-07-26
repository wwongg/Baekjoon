import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        // 곱해지는 5의 개수가 늘어날수록 0의 개수가 하나씩 증가함

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int count = 0;

        while( N >= 5) {
            count += N / 5;
            N /= 5;
        }

        System.out.println(count);

    }


}