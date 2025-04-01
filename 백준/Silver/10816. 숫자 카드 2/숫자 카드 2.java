
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(st.nextToken());
            if(map.containsKey(input)) {
                int value = map.get(input);
                map.put(input, value + 1);
            } else {
                map.put(input, 1);
            }
        }

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int input = Integer.parseInt(st.nextToken());
            if(map.containsKey(input)) {
                sb.append(map.get(input) + " ");
            } else {
                sb.append(0 + " ");
            }
        }

        System.out.println(sb);

    }



}
