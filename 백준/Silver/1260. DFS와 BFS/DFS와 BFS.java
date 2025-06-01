

import java.io.*;
import java.util.*;
import java.util.LinkedList;



public class Main {

    static int[][] map;
    static boolean[] visit;
    static Queue<Integer> q = new LinkedList<>();
    static StringBuilder sb;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 정점의 개수
        int m = Integer.parseInt(st.nextToken());   // 간선의 개수
        int v = Integer.parseInt(st.nextToken());   // 시작 정점 번호
        map = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            map[x][y] = map[y][x] = 1;
        }

        visit = new boolean[n + 1];
        sb = new StringBuilder();
        DFS(v, n);
        sb.append("\n");
        visit = new boolean[n + 1];
        BFS(v, n);
        System.out.println(sb);
    }

    // 재귀 사용
    public static void DFS(int start, int n) {
        visit[start] = true;
        sb.append(start + " ");

        for (int i = 0; i <= n; i++) {
            if(!visit[i] && map[start][i] == 1) {
                DFS(i, n);
            }
        }
    }

    // 큐 사용
    public static void BFS(int start, int n) {
        q.add(start);
        visit[start] = true;

        while (!q.isEmpty()) {
            start = q.poll();
            sb.append(start + " ");

            for (int i = 1; i <= n; i++) {
                if (map[start][i] == 1 && !visit[i]) {
                    q.add(i);
                    visit[i] = true;
                }
            }
        }
    }









   




}
