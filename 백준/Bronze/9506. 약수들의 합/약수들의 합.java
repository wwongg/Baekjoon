
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true) {
            int num = scan.nextInt();
            if(num == -1) {
                break;
            }

            int[] arr = new int[num];
            int sum = 0;
            int index = 0;
            for(int i = 1; i <num; i++) {
                if(num % i == 0) {
                    arr[index++] = i;
                    sum += i;
                }
            }

            if(sum != num) {
                System.out.println(num + " is NOT perfect.");
                continue;
            }

            System.out.print(num +" = ");
            for(int i = 0; i < index; i++) {
                if(i == index - 1) {
                    System.out.print(arr[index - 1]);
                } else {
                    System.out.print(arr[i] + " + ");
                }
            }
            System.out.println();

        }
        
    }
    
}







