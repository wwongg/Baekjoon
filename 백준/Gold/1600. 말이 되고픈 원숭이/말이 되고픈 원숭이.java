
import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class Main {
    static int W, H, K;
    static int[][] map;
    static boolean[][][] visited;

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    static int[] hx = {1, 2, 1, 2, -2, -1, -2, -1};
    static int[] hy = {2, 1, -2, -1, 1, 2, -1, -2};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        K = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        W = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        map = new int[H][W];
        visited = new boolean[K + 1][H][W];

        for (int i = 0; i < H; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < W; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(bfs());
    }

    static int bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0, 0, 0});  // y, x, 이동 횟수, 말처럼 이동한 횟수
        visited[0][0][0] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int y = cur[0];
            int x = cur[1];
            int cnt = cur[2];
            int horse = cur[3];

            if (y == H - 1 && x == W - 1) return cnt;

            // 원숭이 움직임
            for (int d = 0; d < 4; d++) {
                int ny = y + dy[d];
                int nx = x + dx[d];

                if (ny >= 0 && ny < H && nx >= 0 && nx < W) {
                    if (!visited[horse][ny][nx] && map[ny][nx] == 0) {
                        visited[horse][ny][nx] = true;
                        q.offer(new int[]{ny, nx, cnt + 1, horse});
                    }
                }
            }

            // 말처럼 움직이기
            if (horse < K) {
                for (int d = 0; d < 8; d++) {
                    int ny = y + hy[d];
                    int nx = x + hx[d];

                    if (ny >= 0 && ny < H && nx >= 0 && nx < W) {
                        if (!visited[horse + 1][ny][nx] && map[ny][nx] == 0) {
                            visited[horse + 1][ny][nx] = true;
                            q.offer(new int[]{ny, nx, cnt + 1, horse + 1});
                        }
                    }
                }
            }
        }

        return -1;
    }
}
