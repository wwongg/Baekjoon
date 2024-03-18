import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();

        int crossCount = 1; // 대각선에서의 수 개수
        int sum = 0;

        while (true) {
            if(X <= crossCount + sum) {

                if (crossCount % 2 == 1) {
                    System.out.println((crossCount - (X - sum - 1)) + "/" + (X - sum));
                    break;
                } else {
                    System.out.println((X - sum) + "/" + (crossCount - (X - sum - 1)) );
                    break;
                }
            } else {
                sum += crossCount;
                crossCount++;
            }
        }




    }


}