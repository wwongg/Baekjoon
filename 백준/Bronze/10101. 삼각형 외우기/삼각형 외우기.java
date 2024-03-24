
import java.util.Scanner;


public class Main {

        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);

            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            int sum = a + b + c;

            if(sum == 180) {
                if(a == b && a == c) {
                    System.out.println("Equilateral");
                } else if (a == b || a == c || b == c) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            } else {
                System.out.println("Error");
            }


        }
}

