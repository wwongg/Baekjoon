

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // 10진법 N수
        int B = scan.nextInt(); // B진법
        StringBuilder sb = new StringBuilder();


        while (N != 0) {
            if(N % B >= 10) {
                sb.append((char)((N % B) + 'A' - 10));
            } else sb.append(N % B);
            N = N / B;
        }
        scan.close();
        System.out.println(sb.reverse());



    }




}







