import java.util.Scanner;


public class Main {

        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);
            int T = scan.nextInt(); // 테스트 케이스의 개수




            for(int i = 0; i < T; i++) {
                String input = scan.next();
                 
                System.out.println(String.valueOf(input.charAt(0)) + String.valueOf(input.charAt(input.length() - 1)));

                
            }



    }
}