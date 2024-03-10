

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int N = scan.nextInt();
        int price = 0;

        for(int i = 1; i <= N; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            price += (a * b);
        }

        if(X == price) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }




    }

}

