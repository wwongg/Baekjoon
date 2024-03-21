

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        int w = scan.nextInt();
        int h = scan.nextInt();

        int small_y = 0;
        int small_x = 0;

        if((h-y) > y) {
            small_y = y;
         } else {
            small_y = h - y;
        }

        if((w - x) > x) {
            small_x = x;
        }else {
            small_x = w - x;
        }

        if(small_x > small_y) {
            System.out.println(small_y);
        } else {
            System.out.println(small_x);
        }

    }




}







