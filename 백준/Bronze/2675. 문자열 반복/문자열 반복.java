import java.util.Scanner;


public class Main {

        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);
            int T = scan.nextInt(); // 테스트 케이스의 개수


            for(int i = 0; i < T; i++) {
                int R = scan.nextInt(); // 반복 횟수
                String s = scan.next();

                for(int j = 0; j < s.length(); j++) {
                    for(int k = 0; k < R; k++) {
                        System.out.print(s.charAt(j));
                    }
                }
                System.out.println();

            }

    }
}