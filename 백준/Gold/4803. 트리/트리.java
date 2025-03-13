

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int parent[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int testCase = 1;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if(n == 0 && m == 0) break;
            sb.append("Case " + (testCase++) + ": ");
            parent = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                parent[i] = i;
            }

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                union(a, b);
            }

            Set<Integer> tree = new HashSet<>();
            for (int i = 1; i <= n; i++) {
                if(find(parent[i]) > 0) tree.add(find(parent[i]));
            }

            if(tree.size() == 0) sb.append("No trees.");
            else if (tree.size() == 1) {
                sb.append("There is one tree.");
            } else {
                sb.append("A forest of " + tree.size() + " trees.");
            }
            sb.append("\n");




        }
        System.out.println(sb);



    }

    static void union(int x, int y) {
        x = find(x);
        y = find(y);

        if(x == y) {
            parent[y] = x;
            parent[x] = 0;
        } else if(x < y) {
            parent[y] = x;
        } else {
            parent[x] = y;
        }

    }

    static int find(int n) {
        if(n == parent[n]) return n;
        else return parent[n] = find(parent[n]);
    }
}
