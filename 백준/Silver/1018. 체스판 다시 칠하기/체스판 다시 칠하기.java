import java.io.*;
import java.util.Scanner;

import static java.lang.Math.min;

public class Main {

    static boolean[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] number = br.readLine().split(" ");
        int col = Integer.parseInt(number[0]);   //행 개수
        int row = Integer.parseInt(number[1]);   //열 개수

        int min = 64;

        //board배열 크기 설정
        board=new boolean[col][row];

        //입력받기
        for (int i = 0; i < col; i++) {
            String str = br.readLine();
            for (int j=0;j<row;j++){
                if (str.charAt(j) == 'W') {
                    board[i][j] = true;		// W일 때는 true
                } else {
                    board[i][j] = false;		// B일 때는 false
                }
            }
        }

        //체스판 잘라가며 최솟값 찾기
        for (int i = 0; i <= col - 8; i++) {
            for (int j = 0; j <= row - 8; j++) {
                min = min(min,calculate(j, i));
            }
        }

        //출력
        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
    }public static int min = 64;
    public static boolean[][] arr;


    public static int calculate(int startX, int startY) {
        int dif = 0;
        boolean firstColor=board[startY][startX];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                boolean FT=(board[i + startY][j + startX] == firstColor);
                if ((i + j) % 2 == 0) {if (FT) {dif++;}}
                else {if (!FT) {dif++;}}
            }
        }
        return min(dif, 64 - dif);
    }
}