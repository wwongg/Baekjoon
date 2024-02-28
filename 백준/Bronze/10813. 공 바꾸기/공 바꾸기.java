import java.util.Scanner;


public class Main {


        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt(); // N개의 바구니
            int M = scan.nextInt(); // M번 교환 횟수
            int temp;

            int[] box = new int[N];
            for(int i = 0; i < box.length; i++) {
                box[i] = i + 1;
            }

            for(int i = 0; i < M; i++) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                temp = box[x - 1];
                box[x - 1] = box[y - 1];
                box[y - 1] = temp;

            }

            for(int i = 0; i < N; i++) {
                System.out.print(box[i] + " ");

            }









        }

    }