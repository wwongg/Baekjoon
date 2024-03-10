import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] a = new int[N];
        int key = scan.nextInt();


        for(int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }

        scan.close();

        for(int i = 0; i < N; i++) {
            if(a[i] < key) {
                System.out.print(a[i] + " ");
            }
        }






    }


}
