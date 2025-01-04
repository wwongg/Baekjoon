import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] listQueueStack = new int[N];
        int[] currentList = new int[N];

        StringBuilder answer = new StringBuilder();

        StringTokenizer input1 = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            listQueueStack[i] = Integer.parseInt(input1.nextToken());
        }

        StringTokenizer input2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            currentList[i]= Integer.parseInt(input2.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] insertList = new int[M];

        StringTokenizer input3 = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            insertList[i] = Integer.parseInt(input3.nextToken());
        }

        Deque<Integer> queue = new ArrayDeque<>();

        for(int i = 0; i < N; i++) {
            // 타입이 큐라면
            if(listQueueStack[i] == 0) {
                queue.addFirst(currentList[i]);
            }
        }
        for(int i = 0; i < M; i++) {
            queue.add(insertList[i]);
            answer.append((queue.pollFirst() + " "));
        }

        System.out.println(answer);
        br.close();

    }





}





