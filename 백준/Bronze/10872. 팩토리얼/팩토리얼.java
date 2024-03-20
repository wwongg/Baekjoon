import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int result = factorial(N);

        System.out.println(result);

    }

    static int factorial(int a) {
        int fact = 1;
        for(int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }


}