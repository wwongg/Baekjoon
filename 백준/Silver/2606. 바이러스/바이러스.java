

import org.w3c.dom.ls.LSException;

import javax.print.DocFlavor;
import java.io.*;
import java.util.*;
import java.util.LinkedList;



public class Main {

    static int[][] graph;
    static boolean[] visit;

    static int count = 0;

    public static final int INF = (int) 1e9;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());

        graph = new int[n + 1][n + 1];
        visit = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            Arrays.fill(graph[i], INF);
        }

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int input1 = Integer.parseInt(st.nextToken());
            int input2 = Integer.parseInt(st.nextToken());

            graph[input1][input2] = graph[input2][input1] = 1;

        }

        dfs(1, n);

        System.out.println(count);
    }

    static void dfs(int start, int n ) {
        visit[start] = true;

        for (int i = 1; i <= n; i++) {
            if (graph[start][i] == 1 && !visit[i]) {
                count++;
                dfs(i,n);
            }
        }

    }





}


