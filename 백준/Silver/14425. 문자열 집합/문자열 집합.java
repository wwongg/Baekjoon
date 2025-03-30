

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int count = 0;

        HashMap<Integer, String > hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String inputStrA = br.readLine();
            hashMap.put(i, inputStrA);
        }



        for (int i = 0; i < m; i++) {
            String inputStrB = br.readLine();
            if(hashMap.containsValue(inputStrB)){
                count++;
            };

        }

        System.out.println(count);




    }



}
