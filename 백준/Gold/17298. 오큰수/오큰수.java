import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        Stack<Integer> stack = new Stack<>();

        int[] nge = new int[N];

        for(int i = 0; i < N; i++) {
            nge[i] = scan.nextInt();
        }

        for(int i = 0; i < N; i++) {
            while(!stack.isEmpty() && nge[stack.peek()] < nge[i]) {
                nge[stack.pop()] = nge[i];
            }

            stack.push(i);
        }

        while(!stack.isEmpty()) {
            nge[stack.pop()] = -1;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < N; i++) {
            sb.append(nge[i]).append(' ');
        }

        System.out.println(sb);

    }


}
