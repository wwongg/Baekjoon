

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 도감에 들어있는 포켓몬 수
        int m = Integer.parseInt(st.nextToken()); // 맞춰야 할 수

        HashMap<Integer, String> mapA = new HashMap<>();
        HashMap<String , Integer> mapB = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String pokemon = br.readLine();
            mapA.put(i, pokemon);
            mapB.put(pokemon, i);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= m; i++) {
            String  input = br.readLine();
            if(input.charAt(0) >= 49 && input.charAt(0) <= 57) {
                int num = Integer.parseInt(input);
                sb.append(mapA.get(num));
            } else {
                sb.append(mapB.get(input));
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }



}
