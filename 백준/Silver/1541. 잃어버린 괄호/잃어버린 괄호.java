import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arr = scan.nextLine().split("-");

        int result = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            int temp = 0;

            String[] plusArr = arr[i].split("\\+");

            for(String s : plusArr) {
                temp += Integer.parseInt(s);
            }

            if(result == Integer.MAX_VALUE) {
                result = temp;
            } else {
                result -= temp;
            }
        }

        System.out.println(result);
        
    }
}