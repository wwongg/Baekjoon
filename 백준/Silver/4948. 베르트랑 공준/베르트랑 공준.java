
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static boolean[] prime = new boolean[246913];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        getPrime();	// 소수를 얻는 메소드 실행

        StringBuilder sb = new StringBuilder();

        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;	// n 이 0 일경우 종료

            int count = 0;	// 소수 개수를 셀 변수

            for(int i = n + 1; i <= 2 * n; i++) {
                if(!prime[i]) count++;
            }
            sb.append(count).append('\n');	// 문자열로 이어준다
        }
        System.out.print(sb);


    }

    public static void getPrime() {
        
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for (int j = i * i; j < prime.length; j+=i) {
                prime[j] = true;
            }
        }
    }




}
