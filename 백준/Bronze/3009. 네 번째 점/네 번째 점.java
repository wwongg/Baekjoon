

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] com_1 = {scan.nextInt(), scan.nextInt()};
        int[] com_2 = {scan.nextInt(), scan.nextInt()};
        int[] com_3 = {scan.nextInt(), scan.nextInt()};
        
        scan.close();
        
        int x;
        int y;

        // x좌표 비교
        if(com_1[0] == com_2[0]) {
            x = com_3[0];
        } else if (com_1[0] == com_3[0]) {
            x = com_2[0];
        } else {
            x = com_1[0];
        }

        if(com_1[1] == com_2[1]) {
            y = com_3[1];
        } else if (com_1[1] == com_3[1]) {
            y = com_2[1];
        } else {
            y = com_1[1];
        }

        System.out.printf("%d %d", x, y);




    }




}







