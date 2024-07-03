import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int N = scan.nextInt();
        int K= scan.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        // 큐 사이즈가 1이 아닐때만 반복문 동작
        while (queue.size() != 1) {
            for(int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }

            sb.append(queue.poll() + ", ");
        }


        sb.append(queue.poll() + ">");

        System.out.println(sb);

    }
}
