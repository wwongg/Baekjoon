import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] chess = {1, 1, 2, 2, 2, 8};

        int[] x = new int[6];
        for(int i = 0; i < 6; i++) {
            x[i] = scan.nextInt();
        }

        for(int i = 0; i < 6; i++) {
            System.out.printf("%d ", chess[i] - x[i]);
        }

    }


}