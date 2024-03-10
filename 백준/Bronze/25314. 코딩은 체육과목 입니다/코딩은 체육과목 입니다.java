import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int n = (N / 4);

        for(int i = 0; i < n; i++) {
            System.out.print("long ");
        }
        System.out.print("int");

    }
}