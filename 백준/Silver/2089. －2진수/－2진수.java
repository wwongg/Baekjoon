import java.io.*;
import java.util.StringTokenizer;

public class Main {



    public static void main(String[] args) throws IOException {

        // -2진수 => 원래의 2진수에다가 1을 더함

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        if(N == 0){
            sb.append(0);
        } else{
            while (N != 1){
                sb.append(Math.abs(N % -2));

                N = (int)(Math.ceil((double)N/-2));
            }
            sb.append(N);
        }
        System.out.println(sb.reverse());


    }






}
