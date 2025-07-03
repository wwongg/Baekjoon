import com.sun.jdi.IntegerType;

import java.io.*;
import java.util.*;

public class Main {

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    // 동 서 남 북
    static int[][] map;
    static boolean[][][] visit;
    static int endX;
    static int endY;
    static int endDir;
    static int M;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        map = new int[M + 1][N + 1];
        visit = new boolean[M + 1][N + 1][5];
        // 이동가능 공간 0, 불가능 공간 1

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine(), " ");
        int startY = Integer.parseInt(st.nextToken());
        int startX = Integer.parseInt(st.nextToken());
        int direction = Integer.parseInt(st.nextToken());
        // 출발 지점 y, x 그리고 바라보는 방향

        st = new StringTokenizer(br.readLine(), " ");
        endY = Integer.parseInt(st.nextToken());
        endX = Integer.parseInt(st.nextToken());
        endDir = Integer.parseInt(st.nextToken());

        int result = BFS(startY, startX, direction);

        System.out.println(result);

    }

    static int BFS(int y, int x, int dir) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y, dir, 0});
        visit[y][x][dir] = true;

        while (!q.isEmpty()) {
            int[] pos = q.poll();
            int px = pos[0];
            int py = pos[1];
            dir = pos[2];
            int count = pos[3];

            if(py == endY && px == endX && dir == endDir) {
                return count;
            }

            for (int i = 1; i <= 3; i++) {
                int nx = px + (dx[dir - 1] * i);
                int ny = py + (dy[dir - 1] * i);

                if(nx <= 0 || ny <= 0 || nx > N || ny > M) continue;

                if(map[ny][nx] == 0) {
                    if(!visit[ny][nx][dir]) {
                        visit[ny][nx][dir] = true;
                        q.add(new int[]{nx, ny, dir, count + 1});
                    }
                } else {
                    break;
                }
            }

            for (int i = 1; i <= 4; i++) {
                if(dir != i && !visit[py][px][i]) {
                    int turn = 1;
                    if(dir == 1) {
                        if(i == 2) {
                            turn++;
                        }
                    } else if(dir == 2) {
                        if(i == 1) {
                            turn++;
                        }
                    } else if(dir == 3) {
                        if(i ==4) {
                            turn++;
                        }
                    } else {
                        if(i == 3) {
                            turn++;
                        }
                    }

                    visit[py][px][i] = true;
                    q.add(new int[]{px, py, i, count + turn});
                }
            }
        }
        return -1;
    }





}