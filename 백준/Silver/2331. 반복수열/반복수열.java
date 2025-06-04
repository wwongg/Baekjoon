
import java.io.*;
import java.util.*;
import java.util.LinkedList;



public class Main {


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String startNum = st.nextToken();
        int p = Integer.parseInt(st.nextToken());
        int duplicateNumIndex = 0;

        List<String> list = new ArrayList<>();
        list.add(startNum);

        while (true) {
            int result = 0;
            String beforeNum = list.get(list.size() - 1);
            for (int i = 0; i < beforeNum.length(); i++) {
                int digit = beforeNum.charAt(i) - '0';
                result += Math.pow(digit, p);
            }

            if(list.contains(String.valueOf(result))) {
                duplicateNumIndex = list.indexOf(String.valueOf(result));
                break;
            }

            list.add(String.valueOf(result));
        }

        System.out.println(duplicateNumIndex);


    }


















   




}
