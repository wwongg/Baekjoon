
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[] num = new int[8];
        for(int i = 0; i < 8; i++) {
            num[i] = scan.nextInt();
        }

        int up = 0;
        int down = 0;
        for(int i = 0; i < 7; i++) {
            if(num[i] < num[i+1]) {
                up++;
            } else if(num[i] > num[i+1]) {
                down++;
            }
        }

        if(up == 7) {
            System.out.println("ascending");
        } else if(down == 7) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }

}







