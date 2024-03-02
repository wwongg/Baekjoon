import java.util.Scanner;


public class Main {

        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);

            String num1 = scan.next();
            String num2 = scan.next();

            String newnum1 = "";
            String newnum2 = "";

            for(int i = num1.length() - 1; i >= 0; i--) {
                newnum1 += num1.charAt(i);
                newnum2 += num2.charAt(i);
            }

            if(Integer.parseInt(newnum1) > Integer.parseInt(newnum2)) {
                System.out.println(newnum1);
            } else {
                System.out.println(newnum2);
            }


        }
}