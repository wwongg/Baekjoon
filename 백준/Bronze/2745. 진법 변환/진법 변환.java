
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String N = scan.next();
        int B = scan.nextInt();
        int sum = 0;
        int tmp = 1;

        //A = 65, Z = 90 (아스키 코드)
        for(int i = N.length() - 1; i >= 0; i--) {
            char C = N.charAt(i);
            if(N.charAt(i) >= 'A' && N.charAt(i) <= 'Z') {
                sum += (C - 'A' + 10) * tmp;
            } else {
                sum += (C - '0') * tmp;
            }
            tmp = tmp * B;

        }

        System.out.println(sum);




    }
}







