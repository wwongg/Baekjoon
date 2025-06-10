
import org.w3c.dom.ls.LSException;

import javax.print.DocFlavor;
import java.io.*;
import java.util.*;
import java.util.LinkedList;



public class Main {

    static int[][] W;

    static int result = Integer.MAX_VALUE;

    static boolean[] visit;

    static int n;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        W = new int[n + 1][n + 1];
        visit = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= n; j++) {
                W[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visit[1] = true;
        DFS(1, 1, 1, 0);

        System.out.println(result);

    }
    static void DFS(int start, int now, int count, int cost) {
        if (W[now][start] != 0 && count == n) {
            result = Math.min(result, cost + W[now][start]);
            return;
        }


        for (int i = 1; i <= n; i++) {
            if (!visit[i] && W[now][i] != 0) {
                visit[i] = true;
                DFS(start, i, count + 1, cost + W[now][i]);
                visit[i] = false;
            }
        }

    }








}


