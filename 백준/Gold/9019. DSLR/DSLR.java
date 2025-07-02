

import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class Main {

    static String[] command = new String[10000];
    static boolean[] visit = new boolean[10000];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] input = new int[T];
        int[] output = new int[T];


        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            input[i] = Integer.parseInt(st.nextToken());
            output[i] = Integer.parseInt(st.nextToken());


        }

        for (int i = 0; i < T; i++) {
            BFS(input[i], output[i]);
        }





    }

    static void BFS(int input, int output) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(input);

        Arrays.fill(visit, false);
        Arrays.fill(command, "");

        visit[input] = true;

        while (!q.isEmpty() && !visit[output]) {
            int num = q.poll();

            int D = (num * 2) % 10000;
            int S = num  == 0 ? 9999 : num - 1;
            int L = (num % 1000) * 10 + num / 1000;
            int R = (num % 10) * 1000 + num / 10;

            if(!visit[D]) {
                visit[D] = true;
                q.add(D);
                command[D] = command[num] + 'D';
            }

            if(!visit[S]) {
                visit[S] = true;
                q.add(S);
                command[S] = command[num] + 'S';
            }

            if (!visit[L]) {
                visit[L] = true;
                q.add(L);
                command[L] = command[num] + 'L';
            }

            if (!visit[R]) {
                visit[R] = true;
                q.add(R);
                command[R] = command[num] + 'R';
            }
        }
        System.out.println(command[output]);

    }





















}
