
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        int[] arr = new int[26];

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') {
                arr[s.charAt(i) - 'A']++;
            } else {
                arr[s.charAt(i) - 'a']++;
            }
        }
        int max = -1;
        char ch ='?';

        for(int i = 0; i < 26; i++) {
            if(arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);



            }
}







