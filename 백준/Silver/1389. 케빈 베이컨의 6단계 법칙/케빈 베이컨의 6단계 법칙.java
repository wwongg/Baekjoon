import com.sun.jdi.IntegerType;

import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<Integer>[] relation;
    static int[][] result;

    static boolean[] visit;

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        relation = new ArrayList[N + 1];
        result = new int[N + 1][2];


        for (int i = 0; i <= N; i++) {
            relation[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int input1 = Integer.parseInt(st.nextToken());
            int input2 = Integer.parseInt(st.nextToken());

            relation[input1].add(input2);
            relation[input2].add(input1);
        }

        for (int i = 1; i <= N; i++) {
            BFS(i);
        }

        Arrays.sort(result, ((o1, o2) -> {
            if(o1[1] == o2[1]) {
                return o1[0] - o2[0];
            } else {
                return o1[1] - o2[1];
            }
        }));

        System.out.println(result[1][0]);
    }

    static void BFS(int start) {
        Queue<int[]> q = new LinkedList<>();
        int count = 0;
        result[start][0] = start;
        visit = new boolean[N + 1];
        visit[start] = true;

        q.add(new int[]{start, 0});

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int currentNode = current[0];
            int depth = current[1];


            for (int i = 0; i < relation[currentNode].size(); i++) {
                if(!visit[relation[currentNode].get(i)]) {
                    q.add(new int[] {relation[currentNode].get(i), depth + 1});
                    visit[relation[currentNode].get(i)] = true;
                    count += (depth + 1);

                }
            }

        }

        result[start][1] = count;
    }








}