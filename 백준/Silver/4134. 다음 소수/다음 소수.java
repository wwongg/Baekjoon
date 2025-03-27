
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(br.readLine());
            sb.append(next(num) + "\n");
        }
        System.out.println(sb);
    }

    public static long next(long num) {

        if(num == 0 || num == 1) {
            return 2;
        }
        else {
            while (true) {

                boolean prime = true;
                for (long i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        prime = false;
                        break;
                    }
                }


                if (prime) {
                    return num;
                }
                num++;
            }
        }

    }




}
