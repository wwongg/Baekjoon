import java.util.Scanner;


public class Main {

        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);

            int N = scan.nextInt();
            int totalArea = 0;
            int x = 0;
            int y = 0;
            boolean[][] paper = new boolean[101][101];

            for(int i = 0; i < N; i++) {
                x = scan.nextInt();
                y = scan.nextInt();
                for(int j = x; j < x + 10; j++) {
                    for(int k = y; k < y + 10; k++) {
                        if(!paper[j][k]) {
                            paper[j][k] = true;
                            totalArea++;
                        }
                    }
                }
            }

            System.out.println(totalArea);


        }
}