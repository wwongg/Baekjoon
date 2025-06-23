import com.sun.jdi.IntegerType;

import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<Integer>[] relation;
    static int[] visit;

    static boolean find;

    static int count = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int findX = Integer.parseInt(st.nextToken());
        int findY = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());
        relation = new ArrayList[n + 1];
        visit = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            relation[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            relation[x].add(y);
            relation[y].add(x);
        }

        BFS(findX, findY);

        if(find) {
            System.out.println(visit[findY]);
        } else {
            System.out.println(-1);
        }

    }

    static void BFS(int findX, int findY) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(findX);

        while (!q.isEmpty()) {
            int currentNode = q.poll();
            if(currentNode == findY) {
                find = true;
                return;
            }

            for (int next: relation[currentNode]) {
                if (visit[next] == 0) {
                    q.offer(next);
                    visit[next] = visit[currentNode] + 1;
                }
            }
        }
    }






}