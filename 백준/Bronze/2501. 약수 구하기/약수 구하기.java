
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int p = scan.nextInt(); // 수
        int k = scan.nextInt(); // 번째 수

        int[] a = new int[p + 1];
        int count = 0;

        for(int i = 1; i <= p; i++) {
            if(p % i == 0) {
                a[++count] = i;
            }
        }

        if(k > count) {
            System.out.println(0);
        } else {
            System.out.println(a[k]);
        }
    }



}







