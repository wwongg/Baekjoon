import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int souce = 2;
        int result = 0;

        for(int i = 0; i <= N; i++) {
            result = souce *  souce;
            souce = souce + (souce - 1);
        }
        System.out.println(result);




    }


}