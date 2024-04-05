
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int result = fac(n) / ( fac(n - m) * fac(m) );

        System.out.println(result);




    }

    public static int fac(int num) {
        int sum = 1;
        for(int i = 1; i <= num; i++) {
            sum *= i;
        }
        return sum;
    }

}







