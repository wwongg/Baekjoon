import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int N = Integer.parseInt(br.readLine());


        Stack<Character> answer = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            answer.push(s.charAt(i));
        }
        Stack<Character> buffer = new Stack<>();


        for(int i = 0; i < N; i++) {
            String c = br.readLine();
            char ch = c.charAt(0);
            if(ch == 'P') {
                char input = c.charAt(2);
                answer.push(input);
            } else if(ch == 'L') {
                if(!answer.isEmpty()) {
                    buffer.push(answer.pop());
                }
            } else if(ch == 'D') {
                if(!buffer.isEmpty()) {
                    answer.push(buffer.pop());
                }
            } else if(ch == 'B') {
                if(!answer.isEmpty()) {
                    answer.pop();
                }

            }
        }

        while(!buffer.isEmpty()) {
            answer.push(buffer.pop());
        }

        for(int i = 0; i < answer.size(); i++) {
            bw.write(answer.get(i));
        }

        bw.flush();
        bw.close();

    }


}
