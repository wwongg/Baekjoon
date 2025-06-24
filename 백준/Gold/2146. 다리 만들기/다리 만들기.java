
import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class Main {

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int[][] map;
    static boolean[][] visit;

    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visit = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        islandCount();

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(map[i][j] > 0) {
                    visit = new boolean[n][n];
                    int result = BFS(i, j);
                    if(result == -1) continue;
                    if(min > result) {
                        min = result;
                    }
                }
            }
        }

        System.out.println(min - 1);

    }

    static int BFS(int y, int x) {

        int current = map[y][x];
        visit[y][x] = true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y, 0});

        while (!q.isEmpty()) {
            int[] pos = q.poll();
            int px = pos[0];
            int py = pos[1];
            int count = pos[2];

            if(map[py][px] != current && map[py][px] != 0) {
                return count;
            }

            for (int i = 0; i < 4; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];


                if(nx < 0 || nx > n - 1 || ny < 0 || ny > n - 1) continue;


                if(visit[ny][nx] || map[ny][nx] == current) continue;

                visit[ny][nx] = true;
                q.offer(new int[]{nx, ny, count+1});

            }

        }


        return -1;


    }


    static void islandCount() {
        int idx = 2;
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {


                if(map[i][j] != 0 && !visit[i][j]) {
                    q.offer(new int[]{i, j});
                    map[i][j] = idx;
                    visit[i][j] = true;
                    while (!q.isEmpty()) {
                        int[] pos = q.poll();
                        int px = pos[1];
                        int py = pos[0];

                        for (int k = 0; k < 4; k++) {
                            int nx = px + dx[k];
                            int ny = py + dy[k];

                            if(nx < 0 || nx >= n || ny < 0 || ny >= n) continue;

                            if(map[ny][nx] == 1) {
                                map[ny][nx] = idx;
                                visit[ny][nx] = true;
                                q.offer(new int[]{ny, nx});
                            }
                        }
                    }

                    idx++;
                }
            }
        }
    }















}
