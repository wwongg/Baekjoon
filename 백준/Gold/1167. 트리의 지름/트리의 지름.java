

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static class Node {
        int value;
        int cost;

        Node(int value, int cost) {
            this.value = value;
            this.cost = cost;
        }
    }

    static int v;
    static ArrayList<Node> edges[];
    static boolean visit[];
    static int candidate;

    static int max;


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        v = Integer.parseInt(br.readLine());
        edges = new ArrayList[v + 1];
        visit = new boolean[v + 1];

        for (int i = 0; i <= v; i++) {
            edges[i] = new ArrayList<Node>();
        }

        for (int i = 0; i < v; i++) {
            st = new StringTokenizer(br.readLine());
            int vertex = Integer.parseInt(st.nextToken());
            while (true) {
                int next = Integer.parseInt(st.nextToken());
                if(next == -1) {
                    break;
                }
                int cost = Integer.parseInt(st.nextToken());
                edges[vertex].add(new Node(next, cost));
            }
        }
        dfs(1, 0);
        visit = new boolean[v + 1];
        dfs(candidate, 0);
        System.out.println(max);



    }

    public static void dfs(int v, int len) {
        if (len > max) {
            max = len;
            candidate = v;
        }

        visit[v] = true;
        for (int i = 0; i < edges[v].size(); i++) {
            Node next = edges[v].get(i);
            if(visit[next.value] == false) {
                dfs(next.value, len + next.cost);
            }
        }
    }
}
