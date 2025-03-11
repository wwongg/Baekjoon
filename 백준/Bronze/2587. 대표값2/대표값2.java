

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        ArrayList<Integer> array = new ArrayList<>();

        while (true) {
            String line = br.readLine();
            if(line == null || line.isEmpty()) break;
            st = new StringTokenizer(line);
            
            while (st.hasMoreTokens()) {
                array.add(Integer.parseInt(st.nextToken()));
            }
        }

        Collections.sort(array);

        int sum = 0;
        for (Integer num : array) {
            sum += num;
        }
        System.out.println(sum / array.size());
        System.out.println(array.get((array.size())/2));
    }
}
