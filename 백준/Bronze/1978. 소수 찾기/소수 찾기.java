

import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = 0;
        int count = 0;
        while(k < n) {
            int num = scan.nextInt();
            if(num == -1) {
                break;
            }

            int[] arr = new int[num];
            int sum = 0;
            int index = 0;
            for(int i = 1; i <num; i++) {
                if(num % i == 0) {
                    arr[++index] = i;
                    sum += i;
                }
            }

            if(index == 1) {
                count++;
            }
            k++;


        }
        System.out.println(count);

    }

}







