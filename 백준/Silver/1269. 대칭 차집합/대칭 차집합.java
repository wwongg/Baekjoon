
import java.io.*;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet hashSetA = new HashSet<>();
        HashSet hashSetB = new HashSet<>();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            hashSetA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            hashSetB.add(Integer.parseInt(st.nextToken()));
        }


        int ans = 0;

        for (Object num : hashSetA) {
            if(!hashSetB.contains(num)) {
                ans += 1;
            }
        }

        for (Object num : hashSetB) {
            if(!hashSetA.contains(num)) {
                ans += 1;
            }
        }

        System.out.println(ans);

    }



}
