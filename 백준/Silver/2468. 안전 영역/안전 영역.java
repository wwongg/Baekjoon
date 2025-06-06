
import java.io.*;
import java.util.*;
import java.util.LinkedList;



public class Main {

    static int[][] heightMap;

    static boolean[][] serveMergeMap;
    static boolean[][] visit;
    static List<Integer> list;

    static int count;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        heightMap = new int[n][n];
        list = new ArrayList<>();

        int maxHeight = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                heightMap[i][j] = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(maxHeight, heightMap[i][j]);
            }
        }

        for (int i = 0; i < maxHeight; i++) {
            findServeMerge(n, i);
        }

        Collections.sort(list);
        System.out.println(list.get(list.size() - 1));


    }

    public static void findServeMerge(int n, int height) {
        serveMergeMap = new boolean[n][n];
        visit = new boolean[n][n];
        count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(heightMap[i][j] <= height) {
                    serveMergeMap[i][j] = true;
                    visit[i][j] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!serveMergeMap[i][j] && !visit[i][j]) {
                    dfs(n, i, j);
                    count++;

                }

            }
        }

        list.add(count);

    }

    public static void dfs(int n, int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < n && ny >= 0 && ny < n &&
                    !serveMergeMap[nx][ny] && !visit[nx][ny]) {
                visit[nx][ny] = true;
                dfs(n, nx, ny);
            }
        }
    }



















   




}
