import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] a = new int[N];


        for(int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }

        scan.close();

        int min = a[0];
        int max = a[0];

        for(int i = 0; i < N; i++) {
            if(a[i] > max) {
                max = a[i];
            }
            if(a[i] < min) {
                min = a[i];
            }
        }
        System.out.printf("%d %d", min, max);

    }


}
