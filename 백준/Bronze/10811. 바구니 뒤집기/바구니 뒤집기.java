import java.util.Scanner;


public class Main {

        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt(); // N개의 바구니
            int M = scan.nextInt(); // M번 교환 횟수

            int[] box = new int[N + 1];
            for(int i = 1; i <= N; i++) {
                box[i] = i;
            }

            for(int i = 0; i < M; i++) {
                int x = scan.nextInt();
                int y = scan.nextInt();

                for(int j = x; j <= y; j++) {
                    int temp = box[x];
                    box[x++] = box[y];
                    box[y--] = temp;
                }

            }

            for(int i = 1; i <= N; i++) {
                System.out.print(box[i] + " ");
            }

    }
}