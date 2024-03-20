import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // 동전 종류 수
        int[] coin = new int[N];
        int count = 0; // 동전 개수

        int K = scan.nextInt(); // 찾고자 하는 가격

        for(int i = 0; i < N; i++) {
            coin[i] = scan.nextInt();
        }


        for(int i = N - 1; i >= 0; i--) {
            if (coin[i] <= K) {
                count += K / coin[i];
                K %= coin[i];
            }
        }

        System.out.println(count);


    }


}







