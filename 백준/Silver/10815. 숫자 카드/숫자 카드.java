import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(input[i]);
        }

        int m = Integer.parseInt(br.readLine());
        String[] input2 = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            if(set.contains(input2[i])){
                sb.append("1");
            } else {
                sb.append("0");
            }
            sb.append(" ");
        }
        System.out.println(sb);



    }


}