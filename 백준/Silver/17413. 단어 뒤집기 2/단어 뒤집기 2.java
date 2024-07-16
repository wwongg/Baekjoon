import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();
        Stack<Character> stack = new Stack<>();


        for(int i = 0; i < S.length(); i++) {
            // < >사이에 있는 문자는 스택에 그대로 보존

            // 그 외의 문자는 stack2 스택에 푸쉬하여 <를 만났을 때 stack1에 팝 후 푸쉬
            if(S.charAt(i) == '<') {
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                while(S.charAt(i) != '>') {
                    sb.append(S.charAt(i++));
                }
                sb.append(S.charAt(i));
            } else if(S.charAt(i) == ' ') {
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(S.charAt(i));

            }else {
                stack.push(S.charAt(i));
            }

        }

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        bw.write(sb.toString());
        br.close();
        bw.close();



    }


}
