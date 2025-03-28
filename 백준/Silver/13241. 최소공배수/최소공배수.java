
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);





        System.out.println(a * b /GCD(a, b));




    }

    static long GCD(long a, long b) {
        if(b == 0) return a;
        else return GCD(b, a % b);
    }

}
