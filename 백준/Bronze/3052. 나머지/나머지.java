import java.util.Scanner;


public class Main {


        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);
            int[] num = new int[10];
            int count = 0;

            for(int i = 0; i < 10; i++) {
                num[i] = scan.nextInt() % 42;
                boolean check = false;
                for(int j = 0; j < i; j++) {
                    if(num[i] == num[j]) {
                        check = true;
                        break;
                    } else {
                        check = false;
                    }
                }
                if(check == false) {
                    count++;
                }
            }
            System.out.println(count);





        }

    }