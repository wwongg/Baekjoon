

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[][] s = new char[5][15];
        int max = 0;
        
        for(int i = 0; i < s.length; i++) {
            String str = scan.next();
            if(str.length() > max) {
                max = str.length();
            }
            for(int j = 0; j < str.length(); j++) {
                s[i][j] = str.charAt(j);
            }
        }

        for(int i = 0; i < max; i++) {
            for(int j = 0; j < 5; j++) {
                if(s[j][i] == '\0') {
                    continue;
                }
                System.out.print(s[j][i]);
            }
        }
    }
}







