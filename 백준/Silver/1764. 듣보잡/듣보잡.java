
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 듣도 못한 사람
        int m = Integer.parseInt(st.nextToken()); // 보도 못한 사람

        HashSet<String> set = new HashSet<>();


        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            set.add(input);
        }


        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String comparison = br.readLine();
            if(set.contains(comparison)) {

                arr.add(comparison);
            }
        }


        Collections.sort(arr);
        StringBuilder sb = new StringBuilder();


        sb.append(arr.size() + "\n");
        for (String s : arr) {
            sb.append(s + "\n");
        }

        System.out.println(sb);
    }



}
