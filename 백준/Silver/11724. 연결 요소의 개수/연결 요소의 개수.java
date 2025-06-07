

import org.w3c.dom.ls.LSException;

import java.io.*;
import java.util.*;
import java.util.LinkedList;



public class Main {


    static boolean[] visit;
    static int[][] graph;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int result = 0;

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        graph = new int[1001][1001];

        visit = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int input1 = Integer.parseInt(st.nextToken());
            int input2 = Integer.parseInt(st.nextToken());

            graph[input1][input2] = graph[input2][input1] = 1;
        }

        for (int i = 1; i <= n; i++) {
            if(!visit[i]) {
                dfs(i, n);
                result++;
            }
        }


        System.out.println(result);

    }

    public static void dfs(int x, int n) {
        visit[x] = true;
        for (int i = 1; i <= n; i++) {
            if (graph[x][i] == 1 && !visit[i]) {
                dfs(i, n);
            }
        }
    }











   




}


