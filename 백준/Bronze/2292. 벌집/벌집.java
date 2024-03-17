import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); // 찾고자 하는 수

        int count = 1;
        int range = 2;

        if(N == 1) {
            System.out.println(count);
        } else {
            while (range <= N) {
                range = range + (6 * count);
                count++;
            }
            System.out.println(count);
        }


    }


}