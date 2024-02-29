import java.util.Scanner;


public class Main {

        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);
            String language = scan.next();
            int n = scan.nextInt();

            System.out.println(language.charAt(n - 1));

    }
}