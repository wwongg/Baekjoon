

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] arr = new int[10][10];
        int a = 0; // 최댓값이 위치하는 행
        int b = 0; // 최댓값이 위치하는 열
        int max = -1;

        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    a = i;
                    b = j;
                }
            }
        }

        System.out.println(max);
        System.out.printf("%d %d", a, b);



    }
}







