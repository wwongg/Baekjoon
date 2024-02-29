import java.util.Scanner;


public class Main {

        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt(); // 숫자의 개수

            String a = scan.next();
            scan.close();

            int sum = 0;

            for(int i = 0; i < N; i++) {
                sum += a.charAt(i) - '0';
            }
            System.out.println(sum);


    }
}