

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String situation = st.nextToken();
            if (hashMap.containsKey(name)) {
                hashMap.remove(name);
            } else {
                hashMap.put(name, situation);
            }
        }

        ArrayList<String> list = new ArrayList<String>(hashMap.keySet());
        Collections.sort(list, Collections.reverseOrder());

        for (String li : list) {
            System.out.println(li + " ");
        }
    }



}
